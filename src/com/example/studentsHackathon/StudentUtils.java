package com.example.studentsHackathon;

public class StudentUtils {
	private Student[] students;
	
	public StudentUtils() {
		
	}

	public StudentUtils(Student[] students) {
		super();
		this.students = students;
	}
	
	/**
	 * Returns the student with the registration id provided.
	 * @param id - The registration id of the student
	 * @return The student if found. Null if not found.
	 */
	public Student getStudentById(int id) {
		for(Student student: students) {
			if(student.getRegID() == id) {
				return student;
			}
		}
		return null;
	}
	
	/**
	 * Gathers a list of students that have the name provided.
	 * 
	 * @param name - The name being looked for
	 * @return A list of students with the provided name. This list will be empty if no students of that name was found.
	 */
	public Student[] getAllStudentsWithName(String name) {
		Student[] temp_solution = new Student[students.length];
		int numStudentsWithName = 0;
		
		for(Student student: students) {
			if(student.getName().equals(name)) {
				temp_solution[numStudentsWithName++] = student;
			}
		}
		
		Student[] solution = new Student[numStudentsWithName];
		for(int i = 0; i < numStudentsWithName; i++) {
			solution[i] = temp_solution[i];
		}
		
		return solution;
	}
	
	/**
	 * Searches the list of students by the provided id and will update the student if found
	 * 
	 * @param id - The student id
	 * @param name - The Student's new name. Enter null if the name will not be changed.
	 * @param age - The Student's new age. Enter 0 if the age will not be changed.
	 * @param city - the Student's new city. Enter null if the city will not be changed.
	 * @return True if the student was updated. False if the student was not found.
	 */
	public boolean updateStudentById(int id, String name, int age, String city) {
		Student updatedStudent = getStudentById(id);
		
		if(updatedStudent == null){
			return false;
		}
		
		for(Student student: students) {
			if(student.equals(updatedStudent)) {
				student.setName(name == null ? student.getName(): name);
				student.setAge(age == 0 ? student.getAge(): age);
				student.setCity(city == null ? student.getCity(): city);
			}
		}
		
		return true;
	}
	
	/**
	 * Searches the student list for a student with the provided id and will remove the student from the list if found.
	 * 
	 * @param id - The target student registration id
	 * @return True if the student was removed. False if the student's id was not found.
	 */
	public boolean removeStudentById(int id) {
		Student removedStudent = getStudentById(id);
		
		if(removedStudent == null) {
			return false;
		}
		
		Student[] tempStudents = new Student[students.length -1];
		int numStudentsAdded = 0;
		
		for(int i = 0; i < students.length; i++) {
			if(!students[i].equals(removedStudent)) {
				tempStudents[numStudentsAdded++] = students[i];
			}
		}
		
		students = tempStudents;
		
		return true;
	}
	
	/**
	 * Searches the list of students for students from the provided city.
	 * 
	 * @param city - The target city
	 * @return A list of Students from that city. An Empty List will be returned of no students from that city were found.
	 */
	public Student[] getAllStudentsInCity(String city) {
		Student[] temp_solution = new Student[students.length];
		int numStudentsInCity = 0;
		
		for(Student student: students) {
			if(student.getCity().equals(city)) {
				temp_solution[numStudentsInCity++] = student;
			}
		}
		
		Student[] solution = new Student[numStudentsInCity];
		for(int i = 0; i < numStudentsInCity; i++) {
			solution[i] = temp_solution[i];
		}
		
		return solution;
	}
	
	/**
	 * Gathers a list of students older than or equal to the provided age.
	 * 
	 * @param age - The minimum age.
	 * @return A list of students with ages older than or equal to the provided age. An empty list will be returned if no students were older or equal to the provided age.
	 */
	public Student[] getElderStudentsByAge(int age) {
		Student[] temp_solution = new Student[students.length];
		int numElderStudents = 0;
		
		for(Student student: students) {
			if(student.getAge() >= age) {
				temp_solution[numElderStudents++] = student;
			}
		}
		
		Student[] solution = new Student[numElderStudents];
		for(int i = 0; i < numElderStudents; i++) {
			solution[i] = temp_solution[i];
		}
		
		return solution;
	}
	
	/**
	 * Gathers a list of students younger than or equal to the provided age.
	 * 
	 * @param age - The maximum age.
	 * @return A list of students with ages younger than or equal to the provided age. An empty list will be returned if no students were younger or equal to the provided age.
	 */
	public Student[] getYoungerStudentsByAge(int age) {
		Student[] temp_solution = new Student[students.length];
		int numElderStudents = 0;
		
		for(Student student: students) {
			if(student.getAge() <= age) {
				temp_solution[numElderStudents++] = student;
			}
		}
		
		Student[] solution = new Student[numElderStudents];
		for(int i = 0; i < numElderStudents; i++) {
			solution[i] = temp_solution[i];
		}
		
		return solution;
	}

	@Override
	public String toString() {
		String student_str = "";
		for(Student student: students) {
			student_str += student.toString() + "\n";
		}
		
		return "StudentUtils \n[\n" + student_str + "]";
	}
	
}

