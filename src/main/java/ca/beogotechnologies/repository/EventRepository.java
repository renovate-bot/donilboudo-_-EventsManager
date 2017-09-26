package ca.beogotechnologies.repository;

import ca.beogotechnologies.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    Page<Event> findAllByTitleEquals(Pageable pageable, String criteria);

    Page<Event> findAllByEventTypeNameEquals(Pageable pageable, String criteria);

    Page<Event> findAllByStartDateBetween(Pageable pageable, Date startDate, Date endDate);
}
