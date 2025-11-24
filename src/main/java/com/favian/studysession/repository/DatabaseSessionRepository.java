package com.favian.studysession.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.favian.studysession.dto.Session;

@Repository
public class DatabaseSessionRepository implements SessionRepositoryInterface {
	
    private final JpaSessionRepositoryInterface jpa;
	
    public DatabaseSessionRepository(JpaSessionRepositoryInterface jpa) {
        this.jpa = jpa;
    }
	
    @Override
    public List<Session> findAll() {
        return jpa.findAll();
    }
	
    @Override
    public List<Session> findInOrder() {
        return jpa.findAllByOrderByDateAsc();
    }
	
    @Override
    public List<Session> findInOrderReversed() {
        return jpa.findAllByOrderByDateDesc();
    }

    @Override
    public Session findById(Long id) {
        return jpa.findById(id).orElse(null); // oppure exception custom
    }
	
    @Override
    public List<Session> findBySubject(String subject) {
        return jpa.findBySubject(subject);
    }
	
    @Override
    public Session save(Session s) {
        return jpa.save(s);
    }
}

