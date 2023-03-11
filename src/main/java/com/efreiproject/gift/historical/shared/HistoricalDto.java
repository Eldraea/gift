package com.efreiproject.gift.historical.shared;

import java.time.LocalDateTime;
import java.util.UUID;

public class HistoricalDto {
	
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
