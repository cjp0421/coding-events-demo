package org.launchcode.codingevents.models;

import javax.persistence.Entity;

@Entity
public class EventCategory extends AbstractEntity {
//    @Id
//    @GeneratedValue
//    int id;

    String name;

    public EventCategory(String name) {
        super();
        this.name = name;
    }

    public EventCategory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getId() {
//        return id;
//    }
}
