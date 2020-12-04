package com.example.studentsHackathon;

import java.util.Arrays;
import java.util.Random;

/*
Create API - 3 hrs.

Student class -> Registration Id, Student Name, Age, City

StudentUtils -> It should contain array of Student

Should provide following functionalities -
[*] 1. get Student by Registration Id
[*] 2. get all Students by Name
[*] 3. Update Student by Registration Id
[*] 4. Remove student by Registration Id
[*] 5. get all Students by City
[*] 6. get all Elder Students by age
[*] 7. get all younger students by age 
*/

public class Main {

	//Testing the StudentUtils Class
	public static void main(String[] args) {
		String[] names = {"Brian","Michael","James","Nicole","Amber","Jonah","Ashleigh","Dustin","Jamal","Steven"};
		String[] cities = {"Manhattan","Queens","Brooklyn","Ther Bronx","Staten Island","Nassau County","Suffolk County","Other_City"};
		
		Student[] students = new Student[10];
		int[] generatedIds = new int[10];
		
 		for(int i = 0; i < students.length; i ++) {
 			generatedIds[i] = new Random().nextInt(899999999) + 100000000;
			students[i] = new Student(
					generatedIds[i], 
					names[new Random().nextInt(names.length)], 
					new Random().nextInt(13) + 5, 
					cities[new Random().nextInt(cities.length)]);
		}
		
		StudentUtils su = new StudentUtils(students);
		
		System.out.println(su);
		
		String city = cities[new Random().nextInt(cities.length)];
		System.out.println("\nCity: " + city);
		System.out.println(Arrays.toString(su.getAllStudentsInCity(city)) + "\n");
		
		int id = generatedIds[new Random().nextInt(generatedIds.length)];
		//int id = 1;
		System.out.println("ID: " + id);
		System.out.println(su.getStudentById(id) + "\n");
		
		String updatedName = names[new Random().nextInt(names.length)];
		//String updatedName = null;
		int updatedAge = new Random().nextInt(13) + 5;
		//int updatedAge = 0;
		String updatedCity = cities[new Random().nextInt(cities.length)];
		//String updatedCity = null;
		System.out.println("Uptaded");
		System.out.println(
				su.updateStudentById(
						id,	updatedName, updatedAge, updatedCity) ? su.getStudentById(id) + "\n" : "Student Not Found. Not Updated.\n");
	
		System.out.println("Removing " + id);
		System.out.println(su.removeStudentById(id) ? su.toString() + "\n": "Student not found. Not removed.\n");
			
		String name = names[new Random().nextInt(names.length)];
		System.out.println("Name: " + name);
		System.out.println(Arrays.toString(su.getAllStudentsWithName(name)) + "\n");
		
		int elderAge = new Random().nextInt(13) + 5;
		System.out.println("Students olderthan or equal to " + elderAge);
		System.out.println(Arrays.toString(su.getElderStudentsByAge(elderAge)) + "\n");
		
		int youngerAge = new Random().nextInt(13) + 5;
		System.out.println("Students younger or equal to " + youngerAge);
		System.out.println(Arrays.toString(su.getYoungerStudentsByAge(youngerAge)));
	}

}
