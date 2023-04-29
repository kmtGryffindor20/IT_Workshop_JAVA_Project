package Project;

public class Student extends Person implements Result, CoCurricular{
    
    // Roll No of the student
    private long rollNo;
    // Branch of the student
    private String branch;
    // Year of study of the student
    private int year;
    // CGPA of the student
    private float cgpa;
    // NonAcademic activity of student
    private boolean isMusicActive = false;
    private boolean isSportActive = false;

    Subject subjects[] = new Subject[3];


    // Setters for the private details of the student
    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // Constructor to create a person who is a student
    Student(String name, int age, String gender, String dob, Person professors[], int marks[])
    {
        super(name, age, gender, dob);
        setSubjects(professors, marks);
    }


    // Sets the subjects and professors the student is taking
    private void setSubjects(Person professors[], int marks[])
    {
        for(int i = 0; i < 3; i++)
        {
            Subject sub = new Subject();
            sub.course = professors[i].course;
            sub.professor = professors[i];
            sub.credits = 10;
            sub.marks = marks[i];
            subjects[i] = sub;
        }
    }

    // Result Interface Overrides


    // Calculates the final CGPA of the student (Implementation from Result)
    @Override
    public void calculateCGPA()
    {
        float totalPossibleScore = 0;
        float achievedScore = 0;

        // Score for all subjects
        for (int i = 0; i < subjects.length; i++) 
        {
            totalPossibleScore += subjects[i].credits * 10;
            subjects[i].calculateCGPA();
            achievedScore += subjects[i].grade * subjects[i].credits;
        }

        // Grace Marks

        if(isSportActive && (totalPossibleScore-achievedScore) > sportsGrace)
        {
            System.out.println("Sports Grace Given");
            achievedScore += sportsGrace;
        }
        if(isMusicActive && (totalPossibleScore-achievedScore) > musicGrace)
        {
            System.out.println("Music Grace Given");
            achievedScore += musicGrace;
        }

        // Final CGPA rounded to 2 decimal digits
        cgpa = (float)(Math.round(achievedScore/totalPossibleScore * 1000)/100.0);
    }


    // Determines whether the student has passed or failed the semester (Implementation from Result)
    @Override
    public void passOrFail()
    {
        if(cgpa > 5)
            System.out.println("Passed Semester");
        else
            System.out.println("Failed Semester");
    }
    

    // Generates the complete report for the student (Implementation from Result)
    @Override
    public void generateReport()
    {
        this.getPerson();
        System.out.println("Roll. No: " + this.rollNo);
        System.out.println("Branch: " +this.branch);
        System.out.println("Year: " + this.year);
        System.out.println("Subjects: ");
        System.out.println("Course\tProfessor\tCredits\tMarks\tGrade\tPass/Fail");
        for (int i = 0; i < subjects.length; i++) {
            subjects[i].generateReport();
            System.out.println();
        }

        calculateCGPA();

        System.out.println("CGPA: " + cgpa);
        passOrFail();
        System.out.println();
    }


    // CoCurricular Interface Overrides

    // Sets whether student plays music or not (Implementation from CoCurricullar)
    @Override
    public void playsMusic(boolean music)
    {
        if(music)
            isMusicActive = true;
    }

    // Sets whether student plays any sport or not (Implementation from CoCurricullar)
    @Override
    public void playsSports(boolean sport)
    {
        isSportActive = true;
    }


}
