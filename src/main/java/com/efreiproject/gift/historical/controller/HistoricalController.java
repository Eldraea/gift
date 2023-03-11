package com.efreiproject.gift.historical.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.historical.services.HistoricalService;
import com.efreiproject.gift.model.Historical;

@RestController
@RequestMapping("/historical")
public class HistoricalController {
	
	private HistoricalService historicalService;
	
	public HistoricalController(HistoricalService historicalService) {
		this.historicalService = historicalService;
	}
	
	@GetMapping
	public ResponseEntity<List<Historical>> getHistorical(){
		
		return new ResponseEntity<List<Historical>>(HttpStatus.OK);
	}

}
