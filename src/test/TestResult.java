
package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть початок діапазону: ");
        int start = scanner.nextInt();
        
        System.out.print("Введіть кінець діапазону: ");
        int end = scanner.nextInt();
        
        String result = Exercise.findPrimes(start, end);
        System.out.println("Прості числа в діапазоні від " + start + " до " + end + ": " + result);
        
        scanner.close();
    }
}
