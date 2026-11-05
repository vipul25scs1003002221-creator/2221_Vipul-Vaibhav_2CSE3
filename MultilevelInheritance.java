// Parent Class
class Employee {
    int employeeID;
    String employeeName;
    double basicSalary;

    Employee(int id, String name, double salary) {
        employeeID = id;
        employeeName = name;
        basicSalary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Child Class
class Manager extends Employee {
    String department;
    int teamSize;

    Manager(int id, String name, double salary,
            String department, int teamSize) {
        super(id, name, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

// Grandchild Class
class ProjectManager extends Manager {
    String projectName;
    int projectDuration;

    ProjectManager(int id, String name, double salary,
                   String department, int teamSize,
                   String projectName, int projectDuration) {
        super(id, name, salary, department, teamSize);
        this.projectName = projectName;
        this.projectDuration = projectDuration;
    }

    void displayProjectManagerDetails() {
        displayManagerDetails();
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Duration: "
                           + projectDuration + " months");
    }
}

// Main Class
public class MultilevelInheritance {
    public static void main(String[] args) {
        ProjectManager p1 = new ProjectManager(
            101, "Vipul", 50000,
            "IT", 10, "AI Development", 12
        );

        System.out.println("Project Manager Details:");
        p1.displayProjectManagerDetails();
    }
}
