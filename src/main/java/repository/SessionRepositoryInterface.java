package repository;

import java.util.List;

import dto.Session;

public interface SessionRepositoryInterface {

	List<Session> findAll();

	List<Session> findInOrder();

	List<Session> findInOrderReversed();

	Session findById(Long id);

	List<Session> FindBySubject(String subject);

	Session save(Session s);

}