package com.efreiproject.gift.historical.data;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="historical")
public class HistoricalEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false, unique= true)
	private UUID eventId;
	
	@Column(nullable = false)
	private LocalDateTime eventDate;
	
	@Column(nullable = false, unique= true)
	private String action;
	
	

	public HistoricalEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public UUID getEventId() {
		return eventId;
	}

	public LocalDateTime getEventDate() {
		return eventDate;
	}

	public String getAction() {
		return action;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setEventId(UUID eventId) {
		this.eventId = eventId;
	}

	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	
}
