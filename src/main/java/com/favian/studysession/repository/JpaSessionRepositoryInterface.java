package com.favian.studysession.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.favian.studysession.dto.Session;

public interface JpaSessionRepositoryInterface extends JpaRepository<Session, Long>{
	List<Session> findBySubject(String subject);
	List<Session> findAllByOrderByDateAsc();
	List<Session> findAllByOrderByDateDesc(); 
	
	
	//sono già implementati in JPA
//	Session findById(Long id);
//	Session save(Session s);
//	List<Session> findAll();
}
