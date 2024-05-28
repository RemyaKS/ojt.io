public class Student {
    private String studentId;
    private String name;
    private int age;
    private double grades;
    public Student(String studentId, String name, int age, double grades) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grades = grades;
    }
    public void updateGrades(double newGrades) {
        if (isValidGrade(newGrades)) {
            this.grades = newGrades;
            System.out.println("Grades updated to: " + this.grades);
        } else {
            System.out.println("Invalid grade value. Grades should be between 0 and 100.");
        }
    }
    public void displayDetails() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Age: " + age + ", Grades: " + grades);
    }
    private boolean isValidGrade(double grade) {
        return grade >= 0 && grade <= 100;
    }
    public static void main(String[] args) {
        Student student = new Student("101", "Niha", 24, 75.5);
        student.displayDetails();
        student.updateGrades(90);
        student.displayDetails();
        student.updateGrades(110);
        student.displayDetails();
    }
}
