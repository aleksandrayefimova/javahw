package hw1;

import java.util.Scanner;
public class MathOperations {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Sum(num1, num2);
        Sub(num1, num2);
        Mul(num1, num2);
        Div(num1, num2);
    }
    public static void Sum(int num1, int num2) {
        int value = num1 + num2;
        System.out.println(value);
    }
    public static void Sub(int num1, int num2) {
        int value = num1 - num2;
        System.out.println(value);
    }
    public static void Mul(int num1, int num2) {
        int value = num1 * num2;
        System.out.println(value);
    }
    public static void Div(int num1, int num2) {
        int value = num1 / num2;
        System.out.println(value);
    }
}
