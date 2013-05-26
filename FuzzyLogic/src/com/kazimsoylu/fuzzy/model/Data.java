package com.kazimsoylu.fuzzy.model;

public class Data 
{
	private int id;
	private int age;
	private int amount;
	private int prim;

	
	public Data(int id, int age, int amount, int prim) {
		super();
		this.id = id;
		this.age = age;
		this.amount = amount;
		this.prim = prim;
	}
	public Data() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrim() {
		return prim;
	}
	public void setPrim(int prim) {
		this.prim = prim;
	}
	
	
}
