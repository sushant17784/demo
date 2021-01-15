package com.example.demo.student;

import java.util.Arrays;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

	private static final List<Student> STUDENTS = Arrays.asList(
 new Student(1, "James Bond"),
 new Student(2, "Maria Jones"),
 new Student(3, "Anna Smith")
);
	@GetMapping
	public  List<Student> getAllStudents(){
		return STUDENTS;
	}
	
	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		System.out.println(student);
	}
	
	@DeleteMapping(path="{studentId}")
	public void deleteStudent(@PathVariable("studentId")Integer studentId) {
		System.out.print(studentId);
	}
	@PutMapping(path="{studentId}")
	public void updateStudent(@PathVariable("studentId")Integer studentId, @RequestBody Student student) {
		System.out.println(String.format("%s %s", studentId, student));
	}
	
	/*
	 * @GetMapping(path="{studentId}") public Student
	 * getStudent(@PathVariable("studentId") Integer studentId) { return (Student)
	 * STUDENTS.stream() .filter(student ->
	 * studentId.equals(student.getStudentId())) .findFirst() .orElseThrow(() -> new
	 * IllegalStateException("Student " + studentId +"does not exist"));
	 * 
	 * }
	 */
}
