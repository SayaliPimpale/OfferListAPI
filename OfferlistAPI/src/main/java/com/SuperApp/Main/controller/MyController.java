package com.SuperApp.Main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.SuperApp.Main.entities.Response;
import com.SuperApp.Main.services.OfferService;

@RestController
public class MyController {
	
	
	

	@Autowired
	private OfferService offerService;
	

	
	@GetMapping("/offerList")
	public Response getoffers() {
		return this.offerService.getOffers();

	}
}
