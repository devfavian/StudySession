package com.favian.studysession.services;

import org.springframework.stereotype.Service;

import com.favian.studysession.dto.Session;
import com.favian.studysession.exceptions.SessionInvalidField;
import com.favian.studysession.exceptions.SessionMissingData;

@Service
public class SessionServices implements SessionServicesInterface {
	
	public void isSubjectNull(Session s) { if(s.getSubject() == null || s.getSubject().isBlank())	throw new SessionMissingData("subject"); }
	public void isSubjectValid(Session s) { if(s.getSubject().length() > 50 || s.getSubject().length() < 3) throw new SessionInvalidField("subject"); }
	
	public void isDateNull(Session s) { if(s.getDate() == null)		throw new SessionMissingData("date"); }
	
	public void isDurationNull(Session s) { if(s.getDuration() == null) throw new SessionMissingData("durationMinutes"); }
	public void isDurationValid(Session s) { if(s.getDuration() > 600 || s.getDuration() < 1) throw new SessionInvalidField("durationMinutes"); }
	
	public void isFocusNull(Session s) { if(s.getFocuslvl() == null) s.setFocuslvl(2); }
	public void isFocusValid(Session s) { if(s.getFocuslvl() > 5 || s.getFocuslvl() < 1) throw new SessionInvalidField("focusLevel"); }
	
	public void validate(Session s) {
		isSubjectNull(s);
		isSubjectValid(s);
		isDateNull(s);
		isDurationNull(s);
		isDurationValid(s);
		isFocusNull(s);
		isFocusValid(s);
	}
}
