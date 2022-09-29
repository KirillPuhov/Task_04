//Дано натуральное k. Напечатать k-ую цифру последовательности 12345678910111213…, в
//которой выписаны подряд все натуральные числа. Строки и массивы не использовать.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        printNumber(getK(scan));
    }

    private static int getK(Scanner scan){
        System.out.print("Введите натуральное число к: ");
        int k = scan.nextInt();

        return k;
    }

    private static void printNumber(int k){
        int result;

        int numberCounter = 0;
        int digitCounter = 0;

        int numberCounterClone;

        while(digitCounter < k){

            numberCounter++;
            numberCounterClone =numberCounter;

            while (numberCounterClone > 0){
                digitCounter++;
                numberCounterClone /= 10;
            }
        }

        while(digitCounter > k){
            numberCounter /= 10;
            digitCounter--;
        }

        result = numberCounter % 10;

        System.out.printf("k-aя цифра: %d\n", result);
    }
}