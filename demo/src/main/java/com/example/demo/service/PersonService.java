package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    public PersonService(@Qualifier("Dao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public List<Person> addPerson(String id){
        //String url = "https://jsonplaceholder.typicode.com/users";
        //Object[] obj = restTemplate.getForObject(url, Object[].class);
        //System.out.print(Arrays.toString(obj));

        String name = "racecar";
        return personDao.insertPerson(name);
    }

}
