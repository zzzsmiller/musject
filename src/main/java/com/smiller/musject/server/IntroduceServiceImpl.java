package com.smiller.musject.server;

import java.util.List;

import com.sencha.gxt.data.shared.loader.PagingLoadConfig;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.smiller.musject.server.persistence.GreetingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.smiller.musject.client.service.IntroduceService;
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

    @Override
    public PagingLoadResult<Greeting> getGreetings(PagingLoadConfig loadConfig) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
