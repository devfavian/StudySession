package com.favian.studysession.services;

import com.favian.studysession.dto.Session;

public interface SessionServicesInterface {
	void isSubjectNull(Session s);
	void isSubjectValid(Session s);
	
	void isDateNull(Session s);
	
	void isDurationNull(Session s);
	void isDurationValid(Session s);
	
	void isFocusNull(Session s);
	void isFocusValid(Session s);
	
	void validate(Session s);
}
