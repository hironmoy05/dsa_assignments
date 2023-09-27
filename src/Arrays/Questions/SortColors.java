package Arrays.Questions;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/description/
public class SortColors {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 2, 1, 1, 0};

        sortColors(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    static void swap(int[] numbers, int start, int end) {
        // swap
        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
    }

    static void sortColors(int[] numbers) {
        int start = 0;
        int mid = 0;
        int end = numbers.length - 1;

        while (mid <= end) {
            switch (numbers[mid]) {
                case 0: {
                    swap(numbers, start, mid);
                    start++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(numbers, mid, end);
                    end--;
                    break;
                }
            }
        }
    }
}
