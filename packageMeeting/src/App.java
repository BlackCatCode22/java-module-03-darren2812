import p1.Student;

public class App {
    public static void main(String[] args) {
        // introduction
        System.out.println("Welcome to my OOP Demo File");
        // creating an instance of the Student class
        Student myStudent = new Student();
        // assigning class variables
        myStudent.firstName = "Jim";
        myStudent.lastName = "Halpert";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 25;
        myStudent.onProbation = false;
        // output message to the console
        System.out.println("These are the student's attributes:");
        System.out.println("First name: " + myStudent.firstName);
        System.out.println("Last name: " + myStudent.lastName);
        System.out.println("Major: " + myStudent.major);
        System.out.println("GPA: " + myStudent.gpa);
        System.out.println("Age: " + myStudent.age);
        // if statement to print out whether student is on probation or not
        if(myStudent.onProbation == true){
            System.out.println("Student is not on probation.");
        }
        else{
            System.out.println("Student is on probation.");
        }
    }
};