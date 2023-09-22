public class StudentRunner {
    public static void main(String[] args) {
        Student gavin = new Student("Gavin", 11, 99.92);
        gavin.introduce();
        gavin.printStudentInfo();

        Student charlie = new Student("Charlie", 8, 64.3);
        charlie.introduce();
        charlie.printStudentInfo();
    }

}
