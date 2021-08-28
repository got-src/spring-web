package com.sheldonnofer.springweb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GreetingDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public Greeting saveGreeting(Greeting greeting){
        Greeting savedGreeting = (Greeting)getSession().save(greeting);
        return savedGreeting;
    }

    public boolean delete(Greeting greeting) {
        getSession().delete(greeting);
        return true;
    }

    public List getAllGreetings() {
        return getSession().createQuery("from Greeting").list();
    }

    public Greeting getGreeting(String id){
        return (Greeting)getSession().get(Greeting.class, id);
    }
}
