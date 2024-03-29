package org.kulkarni.onlinecatering.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {
	
	final static Logger log = LoggerFactory.getLogger(RequestController.class);
	
	@RequestMapping("/")
	public void Hello() {
		log.info("Hellooooooooo");
	}
}
