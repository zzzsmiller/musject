package com.smiller.musject.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.smiller.musject.shared.entity.Greeting;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@RemoteServiceRelativePath("springGWTServices/introduceService")
public interface IntroduceService extends RemoteService{
	
	String greet(String name);
		
	Greeting get(@Param("text") String text);
		
	void add(@Param("author") String author, @Param("text") String text);
		
	void update(@Param("id") Integer id, @Param("text") String text);
		
	void dell(@Param("id") Integer id);
	
	List<Greeting> getAll();

}
