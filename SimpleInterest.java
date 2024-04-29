public class SimpleInterest {
    public static void main(String[] args) {

        double principal = 1000;
        double time = 5;
        double rate = 5;
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println((simpleInterest >= 18 ? "The simple interest is greater than or equal to 18."
                : "The simple interest is less than 18."));
    }
}
