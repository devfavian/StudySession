package com.favian;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessions")
public class SessionController {
	
	private final SessionRepository memory;
	
	public SessionController(SessionRepository memory) {
		this.memory = memory;
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
		return memory.FindBySubject(subject);
	}
	
	@PostMapping
	public Session createSession(@RequestBody Session s) {
		
		//if null
		if(s.getSubject() == null || s.getSubject().isBlank())	throw new SessionMissingData("subject");
		if(s.getDate() == null)		throw new SessionMissingData("date");
		if(s.getDuration() == null) throw new SessionMissingData("durationMinutes");
		if(s.getFocuslvl() == null) s.setFocuslvl(2);
		
		//conditions
		if(s.getSubject().length() > 50 || s.getSubject().length() < 3) throw new SessionInvalidField("subject");
		if(s.getDuration() > 600 || s.getDuration() < 1) throw new SessionInvalidField("durationMinutes");
		if(s.getFocuslvl() > 5 || s.getFocuslvl() < 1) throw new SessionInvalidField("focusLevel");
		
		return memory.save(s);
	}
}
