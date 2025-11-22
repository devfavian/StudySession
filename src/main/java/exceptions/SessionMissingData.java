package exceptions;

import java.util.Date;

public class SessionMissingData extends RuntimeException {

	public SessionMissingData(String subject) {
		super("missing required field: " + subject);
	}
	
	public SessionMissingData(Date date) {
		super("missing required field: " + date);
	}
	
	public SessionMissingData(Integer duration) {
		super("missing required field: " + duration);
	}
	
}
