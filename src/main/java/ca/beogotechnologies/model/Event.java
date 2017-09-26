package ca.beogotechnologies.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Event")
public class Event {
    public static final String SEARCH_CRITERIA = "criteria";
    public static final String PROPERTY_START_DATE= "startDate";
    public static final String PROPERTY_END_DATE= "endDate";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EventID", nullable = false)
    private Long id;

    @Column(name = "EventTitle", nullable = false)
    private String title;

    @Column(name = "EventDescription")
    private String description;

    @Column(name = "EventLocation")
    private String location;

    @Column(name = "Online")
    private Boolean online;

    @Column(name = "EventAddress")
    private String address;

    @Column(name = "EventCity")
    private String city;

    @Column(name = "EventState")
    private String state;

    @Column(name = "EventZipCode")
    private String zipCode;

    @Column(name = "EventCountry")
    private String country;

    @Column(name = "EventStartDate")
    private Date startDate;

    @Column(name = "EventEndDate")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "OrganizerID")
    private Organizer organizer;

    @OneToOne
    @JoinColumn(name = "EventTypeID")
    private EventType eventType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean isOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
