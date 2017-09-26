package ca.beogotechnologies.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EventTypeID", nullable = false)
    private Long id;

    @Column(name = "EventTypeName", nullable = false)
    private String name;

    @Column(name = "EventTypeDescription")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
