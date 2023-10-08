package com.devguy.testshop.service;

import com.devguy.testshop.collections.Person;
import com.devguy.testshop.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements com.devguy.testshop.service.PersonService {


    @Autowired
    private PersonRepository personRepository;
    private Person person;

    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    @Override
    public List<Person> getPersonStartWith(String name) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
        return null;
    }



    @Override
    public Page<Person> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable) {
        return null;
    }

    @Override
    public List<Document> getOldestPersonByCity() {
        return null;
    }

    @Override
    public List<Document> getPopulationByCity() {
        return null;
    }


}
