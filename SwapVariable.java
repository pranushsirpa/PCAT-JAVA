Task 1: Data Types/Variables
Write a program that declares two integer variables, swaps their values without using a 
third variable, and prints the result.


public class SwapVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b; 
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}