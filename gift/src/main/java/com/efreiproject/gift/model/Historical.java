package com.efreiproject.gift.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="historical")
public class Historical {
	
	@Id
	@GeneratedValue
	private UUID id;
	private LocalDateTime eventDate;
	private String action;
	public UUID getId() {
		return id;
	}
	public LocalDateTime getEventDate() {
		return eventDate;
	}
	public String getAction() {
		return action;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	

}
