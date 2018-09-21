package com.example.demoMockito.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoMockito.model.DoSomeThing;

@Repository("doSomeThingRepository")
public interface DoSomeThingRepository extends JpaRepository<DoSomeThing, Long> {

}
