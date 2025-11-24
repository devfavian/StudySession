package com.favian.studysession.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.favian.studysession.dto.Session;
import com.favian.studysession.repository.SessionRepositoryInterface;
import com.favian.studysession.services.SessionServicesInterface;

@RestController
@RequestMapping("/sessions")
public class SessionController {
	
	private final SessionRepositoryInterface memory;
	private	final SessionServicesInterface services;
			
	public SessionController(SessionRepositoryInterface memory, SessionServicesInterface services) {
		this.memory = memory;
		this.services = services;
	}
	
	@GetMapping
	public List<Session> getSessions(){
		return memory.findAll();
	}
	
	@GetMapping("/inorder")
	public List<Session> getSessionsInOrder(){
		return memory.findInOrder();
	}
	
	@GetMapping("/inorderreversed")
	public List<Session> getSessionsInOrderReversed(){
		return memory.findInOrderReversed();
	}
	
	@GetMapping("findbyid/{id}")
	public Session getSessionById(@PathVariable Long id) {
		return memory.findById(id);
	}
	
	@GetMapping("findbysubject/{subject}")
	public List<Session> getSessionsBysubject(@PathVariable String subject){
		return memory.findBySubject(subject);
	}
	
	@PostMapping
	public Session createSession(@RequestBody Session s) {
		services.validate(s);
		return memory.save(s);
	}
}
