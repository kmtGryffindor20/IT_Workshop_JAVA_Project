package Project;

public class Subject implements Result{

    // Professor of the subject
    Person professor;
    // Name of the course
    String course;
    // Credits of the course
    int credits;
    // Marks attained by the student
    int marks;
    // Grade in the course
    int grade;


    // Generates Subject specific report (Implementation from Result)
    @Override
    public void generateReport()
    {
        System.out.print("" + course);
        System.out.print("\t" + professor.name);
        System.out.print("\t" + credits);
        System.out.print("\t" + marks);
        calculateCGPA();
        System.out.print("\t"+ grade);
        passOrFail();
    }

    // Calculates Grade for the subject (Implementation from Result)
    @Override
    public void calculateCGPA()
    {
        if(marks > 80)
            grade = 10;
        else if(marks > 70)
            grade = 9;
        else if (marks > 60)
            grade = 8;
        else if (marks > 50)
            grade = 7;
        else if (marks > 40)
            grade = 6;
        else if (marks > 33)
            grade = 5;
        else
            grade = 0;

    }


    // Determines Pass/Fail status for the specific subject (Implementation from Result)
    @Override
    public void passOrFail()
    {
        if (grade == 0)
            System.out.print("\tFail");
        else
            System.out.print("\tPass");
        
    }

}
