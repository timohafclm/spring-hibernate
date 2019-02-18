package ru.timofeev.springhibernate.repository;

import ru.timofeev.springhibernate.dto.Contact;

import java.util.List;

public interface ContactDao {
    List<Contact> findAll();

    List<Contact> findAllWithDetail();

    Contact finfById(Long id);

    Contact save(Contact contact);

    void delete(Contact contact);
}
