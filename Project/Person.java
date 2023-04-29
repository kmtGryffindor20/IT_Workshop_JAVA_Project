package Project;

public class Person {
    
    // Name of the person
    String name;
    // Age of the person
    int age;
    // Gender of the person
    String gender;
    // Date of Birth of the person
    String dob;
    // Course if the person is a proffessor
    String course;

    // Constructor for Professor
    Person(String name, int age, String gender, String dob, String course)
    {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.gender = gender;
        this.course = course;
    }

    // Constructor for student
    Person(String name, int age, String gender, String dob)
    {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.gender = gender;
    }


    // Prints details about the person. Can be used to avoid printing same details for professors and students
    void getPerson()
    {
        System.out.println("Name: " + name);
        System.out.println("Age:  " + age);
        System.out.println("Gender: " + gender);
        System.out.println("DOB: " + dob);
    }
}
