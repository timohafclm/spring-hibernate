package ru.timofeev.springhibernate.repository;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.timofeev.springhibernate.dto.Contact;

import java.util.List;

@Transactional
@Repository("contactDao")
@RequiredArgsConstructor
public class ContactDaoImpl implements ContactDao {
    private final SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public List<Contact> findAll() {
        return null;
    }

    @Override
    public List<Contact> findAllWithDetail() {
        return null;
    }

    @Override
    public Contact finfById(Long id) {
        return null;
    }

    @Override
    public Contact save(Contact contact) {
        return null;
    }

    @Override
    public void delete(Contact contact) {

    }
}
