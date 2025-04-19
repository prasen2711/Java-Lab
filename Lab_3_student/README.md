**Assignment 03:**

**📌 Description**  
This project involves the creation of a Student Management System in Java, showcasing Object-Oriented Programming (OOP) principles. It provides functionalities for managing student records, such as adding, displaying, and processing student information.

**📂 File Structure**

1️⃣ **Student.java**  
This file defines the `Student` class, representing a student with relevant attributes and methods.  

**Methods & Functions:**  
- `Student(String name, int rollNo, int age, String branch)` – A constructor to initialize the student's details.  
- `void displayStudentDetails()` – Displays the student's information.

2️⃣ **StudentOperations.java**  
This file handles various operations related to student management.  

**Methods & Functions:**  
- `void addStudent(Student student)` – Adds a student to the list.  
- `void displayAllStudents()` – Displays the details of all students.  
- `Student searchStudent(int rollNo)` – Searches for a student by roll number and returns the student object.  
- `void removeStudent(int rollNo)` – Removes a student based on their roll number.

3️⃣ **Main.java**  
This is the entry point of the program, responsible for interacting with the `Student` and `StudentOperations` classes.  

**Methods & Functions:**  
- `public static void main(String[] args)` – Initializes and runs the student management system.

**🛠️ Technologies Used**  
- Java  
- Object-Oriented Programming (OOP)