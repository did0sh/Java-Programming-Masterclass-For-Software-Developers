package section8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the count of numbers: ");
        int count = scanner.nextInt();
        int[] numbers = readIntegers(count);
        System.out.println("The minimum integer is: " + findMin(numbers));
    }

    private static int[] readIntegers(int count){
        System.out.println("Enter " + count + " numbers:");
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int findMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }
}
