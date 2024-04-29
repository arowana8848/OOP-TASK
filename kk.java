import java.util.Scanner;

public class kk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a grade (A, B, C, D, or F): ");
        String grade = scanner.next().toUpperCase();
        double gpa = 0.0;
        switch (grade) {
            case "A":
                gpa = 4.0;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "D":
                gpa = 1.0;
                break;
            case "F":
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered. Please enter a valid grade (A, B, C, D, or F).");
                return;
        }
        System.out.println("The GPA for grade " + grade + " is: " + gpa);
        scanner.close();
    }
}
