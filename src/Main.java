import java.util.Scanner;

class Student {
    String studentName;
    int studentAge;
    String studentSex;
    double studentGPA;

    // Constructor to initialize the student object
    Student(String name, int age, String sex, double gpa) {
        studentName = name;
        studentAge = age;
        studentSex = sex;
        studentGPA = gpa;
    }

    // Method to display student attributes
    public void displayStudent() {
        System.out.println("Student Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Sex: " + studentSex);
        System.out.println("GPA: " + studentGPA);
    }
}

public class Main {
    public static void main(String[] args) {
        // Variable declarations
        int intVar = 10;
        double doubleVar = 5.5;
        char charVar = 'A';
        boolean boolVar = true;

        // Arithmetic operations
        int sum = intVar + 5;
        double product = doubleVar * 2.0;

        // Relational operators
        boolean greaterThan = intVar > 5;
        boolean logicalResult = boolVar && (doubleVar < 10);

        // Display results
        System.out.println("Variable Declarations:");
        System.out.println("intVar: " + intVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);

        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        System.out.println("Relational Operators:");
        System.out.println("intVar > 5: " + greaterThan);
        System.out.println("boolVar && (doubleVar < 10): " + logicalResult);

        // Triangle pattern
        System.out.println("This is a for loop code that displays a triangle made of stars:");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++)
                System.out.print(" ");
            for (int j = 1; j < i * 2; j++)
                System.out.print("*");
            System.out.println();
        }

        // Day of the week
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 to 7) to display the day of the week: ");
        int dayNumber = scanner.nextInt();
        String[] daysOfWeek = {"Invalid input", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(daysOfWeek[dayNumber]);

        // Enter student information
        System.out.println("Enter student information:");
        System.out.print("Enter student Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter student sex: ");
        scanner.nextLine();
        String sex = scanner.nextLine();
        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();

        // Create a student object and display student information
        Student student = new Student(name, age, sex, gpa);
        student.displayStudent();
    }
}
