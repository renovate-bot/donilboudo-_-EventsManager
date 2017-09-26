package ca.beogotechnologies.service;

import ca.beogotechnologies.model.Event;
import ca.beogotechnologies.model.Organizer;
import ca.beogotechnologies.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
@Transactional
public class OrganizerService {
    @Autowired
    private OrganizerRepository organizerRepository;

    @Transactional
    public Optional<Organizer> findOne(Long id) {
        return Optional.ofNullable(organizerRepository.findOne(id));
    }

    @Transactional
    public Page<Organizer> findAll(Pageable pageable, Map<String, String> filter) {
        final String searchCriteria = filter.get(Event.SEARCH_CRITERIA);
        if (searchCriteria != null) {
            return organizerRepository.findAllByNameEquals(pageable, searchCriteria);
        }
        return organizerRepository.findAll(pageable);
    }

    @Transactional
    public Organizer save(Organizer organizer) {
        return organizerRepository.save(organizer);
    }
}
