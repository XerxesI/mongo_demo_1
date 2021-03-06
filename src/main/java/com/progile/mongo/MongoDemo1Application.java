package com.progile.mongo;

import com.progile.mongo.model.Address;
import com.progile.mongo.model.Employee;
import com.progile.mongo.repository.EmployeeRepository;
import com.progile.mongo.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MongoDemo1Application implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	SequenceGeneratorService sequenceGeneratorService;

	public static void main(String[] args) {
		SpringApplication.run(MongoDemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		employeeRepository.deleteAll();

		List<Employee> listOfEmployees = new ArrayList<Employee>();
		Employee e1 = new Employee("BAT", "MAN", new Address("Bat Cave", "My Back Yard", "Gotham", "CA", 1234), 5000);
		Employee e2 = new Employee("SUPER", "MAN", new Address("Kriptonian Home", "Kriptonian City", "Kriptonian", "IN SPACE", 9999), 2000);
		Employee e3 = new Employee("AQUA", "MAN", new Address("My House", "In Ocean", "Atlantis", "NOWHERE", 77777), 10000);
		Employee e4 = new Employee("IRON", "MAN", new Address("Malibu", "Near Ocean", "CA", "CA", 1234), 12000);
		Employee e5 = new Employee("PROFIT", "MAN", null, 6000);

//		e1.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
		listOfEmployees.add(e1);
//		e2.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
		listOfEmployees.add(e2);
//		e3.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
		listOfEmployees.add(e3);
//		e4.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
		listOfEmployees.add(e4);
//		e5.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
		listOfEmployees.add(e5);

		employeeRepository.insert(listOfEmployees);

	}
}
