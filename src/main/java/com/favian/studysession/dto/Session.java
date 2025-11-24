package com.favian.studysession.dto;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sessions")
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "duration")
	private Integer duration;
	
	@Column(name = "focuslvl")
	private Integer focuslvl;
	
	@Column(name = "note")
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

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getFocuslvl() {
		return focuslvl;
	}

	public void setFocuslvl(Integer focuslvl) {
		this.focuslvl = focuslvl;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}
