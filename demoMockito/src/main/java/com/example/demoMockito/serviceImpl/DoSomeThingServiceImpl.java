package com.example.demoMockito.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoMockito.JpaRepository.DoSomeThingRepository;
import com.example.demoMockito.model.DoSomeThing;
import com.example.demoMockito.service.DoSomeThingService;

@Service("serviceImpl")
public class DoSomeThingServiceImpl implements DoSomeThingService {

	@Autowired
	DoSomeThingRepository someThingRepos;

	@Override
	public List<DoSomeThing> getAllDoSomeThing() {
		return someThingRepos.findAll();
	}

	@Override
	public DoSomeThing getDoSomeThingByid(long id) {
		// TODO Auto-generated method stub
		return someThingRepos.findOne(id);
	}

	@Override
	public DoSomeThing saveDoSomeThing(DoSomeThing doSomeThing) {
		// TODO Auto-generated method stub
		return someThingRepos.save(doSomeThing);
	}

	@Override
	public void removeDoSomeThing(DoSomeThing doSomeThing) {
		// TODO Auto-generated method stub
		 someThingRepos.delete(doSomeThing);
	}

}
