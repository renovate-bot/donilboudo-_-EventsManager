package ca.beogotechnologies.web;

import ca.beogotechnologies.model.EventType;
import ca.beogotechnologies.service.EventTypeService;
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
public class EventTypeController {
    @Autowired
    private EventTypeService eventTypeService;

    @GetMapping("/eventTypes")
    public ResponseEntity<Page<EventType>> getEventTypes(Pageable pageable, @RequestParam() Map<String, String> filter) {
        return new ResponseEntity<>(eventTypeService.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/eventTypes/{id}")
    public ResponseEntity<EventType> getEventType(@PathVariable Long id) {
        return eventTypeService.findOne(id)
                .map(type -> new ResponseEntity<>(type, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/eventTypes")
    public ResponseEntity<?> insertEventType(@RequestBody @Valid EventType type) {
        if (type.getId() != null) {
            return new ResponseEntity<>(Messages.ENTITY_ALREADY_EXISTS, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(eventTypeService.save(type), HttpStatus.CREATED);
    }

    @PutMapping("/eventTypes/{id}")
    public ResponseEntity<EventType> updateEvent(@RequestBody @Valid EventType type) {
        return new ResponseEntity<>(eventTypeService.save(type), HttpStatus.OK);
    }

    @DeleteMapping("/eventTypes/{id}")
    public ResponseEntity<?> deleteEventType(@RequestBody @Valid EventType type) {
        eventTypeService.delete(type);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
