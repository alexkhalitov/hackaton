package ru.sbrf.hackaton.telegram.bot.model;

import javax.persistence.*;

/**
 * Страна
 */
@Entity
@Table(name="countries")
public class Country {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;

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
}


