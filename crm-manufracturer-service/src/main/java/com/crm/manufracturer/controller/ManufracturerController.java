package com.crm.manufracturer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crm.manufracturer.domain.Manufracturer;
import com.crm.manufracturer.service.ManufracturerService;

@RestController
@RequestMapping("/manufracturer")
public class ManufracturerController {

	@Autowired
	ManufracturerService manufracturerService;

	@RequestMapping(value = "/{manufracturerId}", method = RequestMethod.GET)
	public ResponseEntity<Manufracturer> getManufracturer(@PathVariable("manufracturerId") int manufracturerId) {

		System.out.println("*****Welcome to getManufracturer*****");

		Manufracturer manufracturer = manufracturerService.getManufracturer(manufracturerId);

		if (manufracturer == null) {
			return new ResponseEntity<Manufracturer>(HttpStatus.NOT_FOUND);
		}
		System.out.println("Manufracturer---->:" + manufracturer.getName());

		return new ResponseEntity<Manufracturer>(manufracturer, HttpStatus.OK);
	}
}
