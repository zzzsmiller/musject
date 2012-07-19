package com.smiller.musject.client.service;

import java.util.List;

import com.sencha.gxt.data.shared.loader.PagingLoadConfig;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.smiller.musject.shared.entity.Greeting;

@RemoteServiceRelativePath("springGWTServices/introduceService")
public interface IntroduceService extends RemoteService{
	
	String greet(String name);
		
	Greeting get(@Param("text") String text);
		
	void add(@Param("author") String author, @Param("text") String text);
		
	void update(@Param("id") Integer id, @Param("text") String text);
		
	void dell(@Param("id") Integer id);
	
	List<Greeting> getAll();

    PagingLoadResult<Greeting> getGreetings(PagingLoadConfig loadConfig);
}
