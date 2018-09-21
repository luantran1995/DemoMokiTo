package com.example.demoMockito.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoMockito.model.DoSomeThing;
import com.example.demoMockito.model.Response;
import com.example.demoMockito.service.DoSomeThingService;

@RestController
public class DoSomeThingController {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(DoSomeThingController.class);

	@Autowired
	DoSomeThingService doSomeThingService;

	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public ResponseEntity<List<DoSomeThing>> getAllDoSomeThing() {
		
		return new ResponseEntity<List<DoSomeThing>>(doSomeThingService.getAllDoSomeThing(), HttpStatus.OK);

	}

	@RequestMapping(value = "/dodo/{id}", method = RequestMethod.GET)
	public ResponseEntity<DoSomeThing> getById(@PathVariable("id") long id) {

		return new ResponseEntity<DoSomeThing>(doSomeThingService.getDoSomeThingByid(id), HttpStatus.OK);

	}

	@RequestMapping(value = "/dodo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Response> deleteId(@PathVariable("id") long id) {
		DoSomeThing a = doSomeThingService.getDoSomeThingByid(id);
		doSomeThingService.removeDoSomeThing(a);
		return new ResponseEntity<Response>(new Response(HttpStatus.OK.value(), "ToDo has been deleted"),
				HttpStatus.OK);
	}

}
