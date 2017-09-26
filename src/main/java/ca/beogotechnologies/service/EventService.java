package ca.beogotechnologies.service;

import ca.beogotechnologies.model.Event;
import ca.beogotechnologies.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
@Transactional
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    @Transactional
    public Optional<Event> findOne(Long id) {
        return Optional.ofNullable(eventRepository.findOne(id));
    }

    @Transactional
    public Page<Event> findAll(Pageable pageable, Map<String, String> filter) {
        final String searchCriteria = filter.get(Event.SEARCH_CRITERIA);
        if (searchCriteria != null) {
            return eventRepository.findAllByTitleEquals(pageable, searchCriteria);
        }
        return eventRepository.findAll(pageable);
    }

    @Transactional
    public Event save(Event event) {
        return eventRepository.save(event);
    }
}
