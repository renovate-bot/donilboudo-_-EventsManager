package ca.beogotechnologies.model;

import javax.persistence.*;

@Entity
@Table(name = "Organizer")
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrganizerID", nullable = false)
    private Long id;

    @Column(name = "OrganizerName", nullable = false)
    private String name;

    @Column(name = "OrganizerAddress")
    private String address;

    @Column(name = "OrganizerPhone")
    private String phone;

    @Column(name = "OrganizerDescription")
    private String description;

    @Column(name = "OrganizerWebsiteLink")
    private String websiteLink;

    @Column(name = "OrganizerFacebookLink")
    private String facebookLink;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
    }

    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }
}
