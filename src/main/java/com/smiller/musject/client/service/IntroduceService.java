package com.smiller.musject.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGWTServices/introduceService")
public interface IntroduceService extends RemoteService{
	
	String greet(String name);

}
