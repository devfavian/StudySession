package com.favian.studysession.repository;

import java.util.List;

import com.favian.studysession.dto.Session;

public interface SessionRepositoryInterface {

	List<Session> findAll();

	List<Session> findInOrder();

	List<Session> findInOrderReversed();

	Session findById(Long id);

	List<Session> findBySubject(String subject);

	Session save(Session s);

}