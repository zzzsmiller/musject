package com.smiller.musject.server;

import org.springframework.stereotype.Controller;

import com.smiller.musject.client.service.IntroduceService;

@Controller("introduceService")
public class IntroduceServiceImpl implements IntroduceService {

	@Override
	public String greet(String name) {
		return new StringBuilder().append("Hello, ").append(name)
				.append(", glad to see yea!").toString();
	}

}
