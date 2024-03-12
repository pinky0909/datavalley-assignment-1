java
public class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Adding two integers
        int sum1 = math.add(5, 3);
        System.out.println("Sum of two integers: " + sum1);

        // Adding three doubles
        double sum2 = math.add(2.5, 3.7, 1.8);
        System.out.println("Sum of three doubles: " + sum2);

        // Concatenating two strings
        String result = math.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + result);
    }
}


