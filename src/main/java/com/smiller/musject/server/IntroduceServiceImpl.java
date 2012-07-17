package com.smiller.musject.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.smiller.musject.client.service.IntroduceService;
import com.smiller.musject.server.persistence.GreetingMapper;
import com.smiller.musject.shared.entity.Greeting;

@Controller("introduceService")
public class IntroduceServiceImpl implements IntroduceService {
	
	@Autowired
	GreetingMapper greetingDao;

	@Override
	public String greet(String name) {
		return new StringBuilder().append("Hello, ").append(name)
				.append(", glad to see yea!").toString();
	}

	@Override
	public Greeting get(String text) {
		return greetingDao.get(text);
	}

	@Override
	public void add(String author, String text) {
		greetingDao.add(author, text);
	}

	@Override
	public void update(Integer id, String text) {
		greetingDao.update(id, text);
	}

	@Override
	public void dell(Integer id) {
		greetingDao.dell(id);
	}

	@Override
	public List<Greeting> getAll() {
		return greetingDao.getAll();
	}

}
