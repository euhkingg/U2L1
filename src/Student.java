// Cat class definition
public class Student {

    // instance variables
    private String name;
    private int grade;
    private double Avg;

    // constructor
    public Student(String studentName, int studentGrade, double gradeAvg) {
        name = studentName;
        grade = studentGrade;
        Avg = gradeAvg;
    }
    // method that introduces the Stuedent
    public void introduce() {
        boolean younger = grade < 9;
        if (younger) {
            System.out.println("Hello my name is " + name + " and I am not in High School");
        } else {
            System.out.println("Hello my name is " + name + " and I am in High School");
        }
    }

    // method that prints Student info
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Overall Grade Average: " + Avg);
    }
}