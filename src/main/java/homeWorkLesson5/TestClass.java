package homeWorkLesson5;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator for fist number: ");
        int numeratorOfFirsNumber = scanner.nextInt();
        System.out.print("Enter denominator for first number: ");
        int denominatorOfFirsNumber = scanner.nextInt();
        Fraction FirstNumber = new Fraction(numeratorOfFirsNumber, denominatorOfFirsNumber);

        System.out.println();

        System.out.print("Enter numerator for second number: ");
        int numeratorOfSecondNumber = scanner.nextInt();
        System.out.print("Enter denominator for second number: ");
        int denominatorOfSecondNumber = scanner.nextInt();
        Fraction secondNumber = new Fraction(numeratorOfSecondNumber, denominatorOfSecondNumber);

        System.out.println();
        System.out.println("The first and second fraction are equals: " + FirstNumber.equals(secondNumber));
        System.out.println();

        System.out.print("Enter numerator for third number: ");
        int numeratorOfThirdNumber = scanner.nextInt();
        System.out.print("Enter denominator for third number: ");
        int denominatorOfThirdNumber = scanner.nextInt();
        Fraction thirdNumber = new Fraction(numeratorOfThirdNumber, denominatorOfThirdNumber);

        System.out.println();
        System.out.println("The third and second fraction are equals: " + thirdNumber.equals(secondNumber));
    }
}
