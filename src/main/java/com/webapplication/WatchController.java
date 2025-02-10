package com.webapplication;

import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatchController {
	@GetMapping(value="/GetWatch")
	public List<Watch> getWatch(@RequestBody List<Watch> w) {
		return w;
	}
	@GetMapping(value="/GetPrice")
	public void getPrice(@RequestBody Watch w){
		Watch maxobj= ((Watch) Watch.max(Comparator.comparing(Watch :: getPrice))).get();
		System.out.println(maxobj);
		}
	}
