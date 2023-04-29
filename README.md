# IT_Workshop_JAVA_Project

## Problem Statement
### - Inheritance
    Create a Student Management System that stores the details of students like their name, age, year, course, etc.
    The student’s data can be added and the complete report of the student can be printed out.
    The student also has a list of professors and the subjects they teach.
    Formulate the above problem through the use of JAVA and apply OOPs concepts in order to solve it.
    The solution must contain at least 2 classes: one inheriting the other and 3 interfaces: implemented by either of the two classes.
    The program must not take any user input and all the inputs required must be given in the program itself.
    Make the program more readable and well formatted.

## Schematic Diagram
### - Inheritance Chart
![Screenshot 2023-04-29 163754](https://user-images.githubusercontent.com/129510465/235299502-912d7dad-4cba-493a-b189-cbdc24f61c8f.png)


## Function of Classes
  ### 1. Person.java
      This is class is the blueprint for a person to be created.
      All Students and Professors are made through this class.
      It holds in their name, age, gender and date of birth.
      
  ### 2. Result.java
      This is an interface which holds the functions that must be implemented in the Student.java and the Subject.java classes.
      It allows different implementations of the generateReport(), calculateCGPA() and passOrFail() functions.
      
  ### 3. CoCurricular.java
      This is an interface which holds functions needed to be implemented for each student.
      It has two final variable which holds the absolute grace marks to be awarded for the co-curricular activities
      and setter methods to set the same for each student.
      
  ### 4. Student.java
      This is the class which creates a Person with extra attributes of
      roll number, branch, year of study, CGPA and co-curricular activity data.
      It is used when a new student is to be created. It implements the interfaces Result.java and CoCurricular.java. 
      
  ### 5. Subject.java
      This is the class which is used to create a Subject the student is studying.
      It has a Person object which acts as the professor of the class and attributes that define the subject.
      It implements the Result.java interface but calculates the subject grade instead of CGPA
      and prints the specific subject report instead of the whole student’s report,
      thus having different implementations through same interface in two different classes.
      
  ### 6. RunFile.java
      It is the class which holds the main function and is used to run the program.
      The user input required is given through the constructors during object creation and a few other values are set through setter methods.
      Finally, the report of the students added are printed out.
      
## Operation of Code
    The program starts executing from the RunFile.java and first creates the three professors that are teaching the courses to the students.
    There is constructor overloading in the Person classes which separates the creation of a student person and a professor person by an argument of course.
    The professors thus have a course defined to them which they teach.
    Next, two students are created and their details are passed as arguments.
    The student specific details are given through specific setter methods. 
    When a student is created the super class, i.e., the Person class’s constructor is called and the person details of the student is filled.
    Then the student’s subjects are set into an array of Subject objects.
    The student’s report is then printed which prints the person’s details first, then the student’s data.
    It calls the calculateCGPA() method to get the CGPA calculated and then calls the passOrFail() method to get the pass/fail status of the student.
    The RunFile.java thus runs all the functions implemented in the whole program either directly or indirectly and finally prints the data of the students.
    
## Output of the Code
![Screenshot 2023-04-29 162502](https://user-images.githubusercontent.com/129510465/235299820-070bfbe1-83ad-41ad-90a1-4a8eec0732d9.png)
    
    The above output is received when the RunFile.java creates two students.
    
```JAVA
    // Professors for the students (INPUT)
    Person proffs[] = {new Person("Anoop Singh", 30, "Male", "1993", "MA-102"),
                       new Person("Abhash Jha", 35, "Male", "1988", "MA-111"),
                       new Person("Ankit Arora", 33, "Male", "1990", "EO-102")};

    // Marks for the above subjects (INPUT)
    int s1Marks[] = {79, 76,88};
    int s2Marks[] = {71, 68, 81};

    // Students whose data are added (INPUT)
    Student s1 = new Student("Hardik", 19, "Male", "2003", proffs, s1Marks);
    Student s2 = new Student("Shishir", 19, "Male", "2003", proffs, s2Marks);
    s1.setBranch("MnC");
    s1.setRollNo(22124018);
    s1.setYear(1);
    s1.playsSports(true);
    s1.playsMusic(false);
    s2.setBranch("MnC");
    s2.setRollNo(22124041);
    s2.setYear(1);
    s2.playsSports(true);
    s2.playsMusic(false);
```
    


