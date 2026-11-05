// Parent Class
class Person {
    String name;
    int age;
    String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

// Child Class
class Student extends Person {
    int studentID;
    String course;

    Student(String name, int age, String email,
            int studentID, String course) {
        super(name, age, email);
        this.studentID = studentID;
        this.course = course;
    }

    void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
    }
}

// Main Class
public class SingleInheritance {
    public static void main(String[] args) {
        Student s1 = new Student(
            "Vipul", 20, "vipul@gmail.com",
            101, "CSE AIML"
        );

        System.out.println("Student Details:");
        s1.displayStudentDetails();
    }
}
