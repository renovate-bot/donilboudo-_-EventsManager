package ca.beogotechnologies.repository;

import ca.beogotechnologies.model.Organizer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
    Page<Organizer> findAllByNameEquals(Pageable pageable, String criteria);
}
