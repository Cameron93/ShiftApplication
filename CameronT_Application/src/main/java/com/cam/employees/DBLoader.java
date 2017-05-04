package com.cam.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBLoader implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired
	public DBLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		//Preloaded Staff Member
		this.repository.save(new Employee("Cameron Taylor", "Afternoon"));
	}
}