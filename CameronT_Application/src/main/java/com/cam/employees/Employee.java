package com.cam.employees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String name;
	private String time;

	private Employee() {}

	public Employee(String name, String time) {
		this.name = name;
		this.time = time;
	}
}