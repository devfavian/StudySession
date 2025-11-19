package com.favian;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class SessionRepository {
	
	private Map<Long, Session> sessions = new HashMap<>();
	private long nextId = 1;
	
	public SessionRepository() {}
	
	public List<Session> findAll(){
		return new ArrayList<>(sessions.values());
	}
	
	public List<Session> findInOrder() {
	    List<Session> result = new ArrayList<>(sessions.values());
	    result.sort(Comparator.comparing(Session::getDate));
	    return result;
	}
	
	public List<Session> findInOrderReversed() {
	    List<Session> result = new ArrayList<>(sessions.values());
	    result.sort(Comparator.comparing(Session::getDate).reversed());
	    return result;
	}

	public Session findById(Long id) {
		return sessions.get(id);
	}
	
	public List<Session> FindBySubject(String subject) {
		List<Session> result = new ArrayList<>();
		for(Session s : sessions.values()) {
			if(s.getSubject().contains(subject)) result.add(s);
		}
		
		return result;
	}
	
	public Session save(Session s) {
		if(s.getId() == null) s.setId(nextId++);
		sessions.put(s.getId(), s);
		return s;
	}
}
