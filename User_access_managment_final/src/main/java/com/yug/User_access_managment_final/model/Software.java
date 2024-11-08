package com.yug.User_access_managment_final.model;

import javax.persistence.*;

@Entity
public class Software {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAccessLevels() {
        return accessLevels;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAccessLevels(String accessLevels) {
        this.accessLevels = accessLevels;
    }

    private String name;
    private String description;
    private String accessLevels;

}

