package Project;

public class RunFile {
    public static void main(String[] args) {

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


        // Generating final report of the students
        s1.generateReport();
        s2.generateReport();
    }
}
