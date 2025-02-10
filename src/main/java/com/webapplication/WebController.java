
package com.webapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping(value = "/Get")
	public String get() {
		return "Hello world";
	}
	@GetMapping(value ="/GetName/{name}")
	public String getName(@PathVariable String name) {
		return "hello"+name;
	}
	@GetMapping(value ="/GetSum")
	public int getSum(@RequestParam int a, @RequestParam int b) {
		return a+b;
	}
	@GetMapping(value ="/GetPrime")
	public String getNo(@RequestParam int a) {
		if(a%2!=0 && a%3!=0) {
			return "prime number";
		}
		else {
			return "not prime number";
			
		}
	}
}
