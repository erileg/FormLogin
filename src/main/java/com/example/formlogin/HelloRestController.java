package com.example.formlogin;

import static org.springframework.http.MediaType.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@GetMapping(value = {"*"}, produces = TEXT_PLAIN_VALUE)
	public String hello() {
		return "hello world...";
	}

	@GetMapping(value = {"/secret"}, produces = TEXT_PLAIN_VALUE)
	public String secret() {
		return "hello secret world...";
	}
}
