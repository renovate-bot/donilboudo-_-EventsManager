package ca.beogotechnologies.web;

import ca.beogotechnologies.model.Organizer;
import ca.beogotechnologies.service.OrganizerService;
import ca.beogotechnologies.util.messages.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(path = "/api")
public class OrganizerController {
    @Autowired
    private OrganizerService organizerService;

    @GetMapping("/organizers")
    public ResponseEntity<Page<Organizer>> getOrganizers(Pageable pageable, @RequestParam() Map<String, String> filter) {
        return new ResponseEntity<>(organizerService.findAll(pageable, filter), HttpStatus.OK);
    }

    @GetMapping("/organizers/{id}")
    public ResponseEntity<Organizer> getOrganizer(@PathVariable Long id) {
        return organizerService.findOne(id)
                .map(organizer -> new ResponseEntity<>(organizer, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/organizers")
    public ResponseEntity<?> insertOrganizer(@RequestBody @Valid Organizer organizer) {
        if (organizer.getId() != null) {
            return new ResponseEntity<>(Messages.ENTITY_ALREADY_EXISTS, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizerService.save(organizer), HttpStatus.CREATED);
    }

    @PutMapping("/organizers/{id}")
    public ResponseEntity<Organizer> updateOrganizer(@RequestBody @Valid Organizer organizer) {
        return new ResponseEntity<>(organizerService.save(organizer), HttpStatus.OK);
    }
}
