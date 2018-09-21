package com.example.demoMockito.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DoSomeThing {
	
	@Id
	@GeneratedValue	
	private long id;
	private String text; 
	private boolean complete;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	public DoSomeThing(long id, String text, boolean complete) {
		super();
		this.id = id;
		this.text = text;
		this.complete = complete;
	}
	public DoSomeThing( String text, boolean complete) {
		super();
		this.text = text;
		this.complete = complete;
	}
	
	public DoSomeThing() {
		super();
	}
	

}
