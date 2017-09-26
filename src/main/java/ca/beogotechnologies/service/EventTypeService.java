package ca.beogotechnologies.service;

import ca.beogotechnologies.model.EventType;
import ca.beogotechnologies.repository.EventTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EventTypeService {
    @Autowired
    private EventTypeRepository eventTypeRepository;

    @Transactional
    public Optional<EventType> findOne(Long id) {
        return Optional.ofNullable(eventTypeRepository.findOne(id));
    }

    @Transactional
    public Page<EventType> findAll(Pageable pageable) {
        return eventTypeRepository.findAll(pageable);
    }

    @Transactional
    public EventType save(EventType type) {
        return eventTypeRepository.save(type);
    }

    @Transactional
    public void delete(EventType type) {
        eventTypeRepository.delete(type);
    }
}
