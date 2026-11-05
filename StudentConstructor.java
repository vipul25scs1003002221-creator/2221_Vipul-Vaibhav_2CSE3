class Student {
    int studentID;
    String studentName;
    String course;
    int age;

    // Default Constructor
    Student() {
        studentID = 101;
        studentName = "Vipul";
        course = "CSE AIML";
        age = 20;
    }

    // Parameterized Constructor
    Student(int id, String name, String c, int a) {
        studentID = id;
        studentName = name;
        course = c;
        age = a;
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
        System.out.println("-------------------");
    }
}

public class StudentConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(102, "Rahul", "CSE", 21);

        System.out.println("Default Constructor:");
        s1.displayDetails();

        System.out.println("Parameterized Constructor:");
        s2.displayDetails();
    }
}
