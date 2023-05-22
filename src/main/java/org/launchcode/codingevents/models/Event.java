package org.launchcode.codingevents.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;


/**
 * Created by Chris Bay
 */
@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    private EventType type;

    public Event(String name, String description, String contactEmail, EventType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
    }

    public Event() {}


public class Event {

    private int id;
    private static int nextId = 1;
    @NotBlank
    @Size(min=3,max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;
    @Size(max=500, message = "Description is too long. Try again.")
    private String description;
    @NotBlank
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    public Event(String name, String description, String contactEmail) {
        this.name = name;
        this.description = description;
        this.id = nextId;
        this.contactEmail = contactEmail;
        nextId++;
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

    public int getId() {
        return id;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }


    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;

        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getId() == event.getId();

    }

    @Override
    public int hashCode() {

        return Objects.hash(id);

        return Objects.hash(getId());

    }
}
