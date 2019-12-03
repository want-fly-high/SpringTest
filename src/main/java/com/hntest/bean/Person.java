package com.hntest.bean;

public class Person {

	private String name;
	private String statement;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", statement=" + statement + "]";
	}
	
	public void say() {
		System.out.println(this.name+"˵:"+this.statement);
	}
	
}
