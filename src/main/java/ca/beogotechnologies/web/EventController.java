package ca.beogotechnologies.web;

import ca.beogotechnologies.model.Event;
import ca.beogotechnologies.service.EventService;
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
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public ResponseEntity<Page<Event>> getEvents(Pageable pageable, @RequestParam() Map<String, String> filter) {
        return new ResponseEntity<>(eventService.findAll(pageable, filter), HttpStatus.OK);
    }

    @GetMapping("/events/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable Long id) {
        return eventService.findOne(id)
                .map(event -> new ResponseEntity<>(event, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/events")
    public ResponseEntity<?> insertEvent(@RequestBody @Valid Event event) {
        if (event.getId() != null) {
            return new ResponseEntity<>(Messages.ENTITY_ALREADY_EXISTS, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(eventService.save(event), HttpStatus.CREATED);
    }

    @PutMapping("/events/{id}")
    public ResponseEntity<Event> updateEvent(@RequestBody @Valid Event event) {
        return new ResponseEntity<>(eventService.save(event), HttpStatus.OK);
    }
}
