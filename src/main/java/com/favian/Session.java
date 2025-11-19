package com.favian;

import java.util.Date;

public class Session {
	private Long id;
	private String subject;
	private Date date;
	private Integer duration;
	private Integer focuslvl;
	private String note;
	
	public Session() {}
	
	public Session(Long id, String subject, Date date, Integer duration, Integer focuslvl, String note) {
		this.id = id;
		this.subject = subject;
		this.date = date;
		this.duration = duration;
		this.focuslvl = focuslvl;
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Integer getFocuslvl() {
		return focuslvl;
	}

	public void setFocuslvl(int focuslvl) {
		this.focuslvl = focuslvl;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}
