package com.example.demoMockito.service;

import java.util.List;

import com.example.demoMockito.model.DoSomeThing;

public interface DoSomeThingService {

	public List<DoSomeThing> getAllDoSomeThing();

	public DoSomeThing getDoSomeThingByid(long id);

	public DoSomeThing saveDoSomeThing(DoSomeThing doSomeThing);

	public void removeDoSomeThing(DoSomeThing doSomeThing);

}
