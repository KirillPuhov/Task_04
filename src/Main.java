//Дано натуральное k. Напечатать k-ую цифру последовательности 12345678910111213…, в
//которой выписаны подряд все натуральные числа. Строки и массивы не использовать.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        getNum(getK(scan));
    }

    private static int getK(Scanner scan){
        System.out.print("Введите натуральное число к: ");
        int k = scan.nextInt();

        return k;
    }

    private static void getNum(int k){
        int result;

        int i = 0;
        int j = 0;
        int i1;

        while(j < k){
            i++;
            i1=i;
            while (i1 > 0){
                j++;
                i1 /= 10;
            }
        }

        while(j > k){
            i /= 10;
            j--;
        }

        result = i % 10;

        System.out.printf("k-aя цифра: %d\n", result);
    }
}