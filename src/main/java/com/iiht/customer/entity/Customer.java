package com.iiht.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private char gender;
	
	private int age;
	
	private String preferedFood;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(long id, String name, char gender, int age, String preferedFood) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.preferedFood = preferedFood;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPreferedFood() {
		return preferedFood;
	}

	public void setPreferedFood(String preferedFood) {
		this.preferedFood = preferedFood;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", preferedFood="
				+ preferedFood + "]";
	}
	
}
