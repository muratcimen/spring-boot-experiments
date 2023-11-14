package com.muratcimen.cruddemo;

import com.muratcimen.cruddemo.dao.StudentDAO;
import com.muratcimen.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.DoubleSummaryStatistics;
import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
			//createStudent(studentDAO);

			createdMutipleStudents(studentDAO);

			//readStudent(studentDAO);

			//queryForStudents(studentDAO);

			//updateStudent(studentDAO);

			//deleteStudent(studentDAO);

			//deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {

		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deletedAll();
		System.out.println("Delete row count: " + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {

		int studentId = 3;
		System.out.println("Deleting student id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		//retrieve student based on the id : primary key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);
		//change first name to "Scooby"
		System.out.println("Updating student...");
		myStudent.setFirstName("Scooby");
		//update the student
		studentDAO.update(myStudent);
		//display the updated student
		System.out.println("Updated student: " + myStudent);
	}

	private void queryForStudents(StudentDAO studentDAO) {

		//get a list of students
		List<Student> theStudents = studentDAO.findAll();

		//display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		//create a student object
		System.out.println("Creaating new student object...");
		Student tempStudent = new Student("Daffy", "Duck", "daffy@muratcimen.com");
		//save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
		//display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);
		//retrieve student based on the id: primary key
		System.out.println("Retrieving student with id " + theId);
		Student myStudent = studentDAO.findById(theId);
		//display student
		System.out.println("Found the student: " + myStudent);
	}

	private void createdMutipleStudents(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creatign new student objects...");
		Student tempStudent1 = new Student("john", "Doe", "paul@muratcimen.com");
		Student tempStudent2 = new Student("Mary", "Public", "paul@muratcimen.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "paul@muratcimen.com");
		//save the student object
		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		//display id of the saved student
		System.out.println("Saved students. Generated id: " + tempStudent1.getId());
		System.out.println("Saved students. Generated id: " + tempStudent2.getId());
		System.out.println("Saved students. Generated id: " + tempStudent3.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creatign new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@muratcimen.com");
		//save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
		//display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}
