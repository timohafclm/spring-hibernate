package ru.timofeev.springhibernate.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Hobby {
    @Id
    @Column(name = "HOBBY_ID")
    private String hobbyId;

    @ManyToMany
    @JoinTable(name = "contact_hobby_detail", joinColumns = @JoinColumn(name = "HOBBY_ID"), inverseJoinColumns = @JoinColumn(name = "CONTACT_ID"))
    private Set<Contact> contacts = new HashSet<>();
}
