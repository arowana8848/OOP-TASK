public class DivisibilityChecker {
    public static void main(String[] args) {
        int number = 55;
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("The number " + number + " is divisible by both 5 and 11.");
        } else {
            System.out.println("The number " + number + " is not divisible by both 5 and 11.");
        }
    }
}
