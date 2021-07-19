package red.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Daniil Shreyder
 * Date: 18.07.2021
 */

public class Quicksort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        while (scanner.hasNext())
            input.add(scanner.nextInt());

        System.out.println("Input: " + Arrays.toString(input.toArray()));
        int[] output = quicksort(input.stream().mapToInt(Integer::intValue).toArray());
        int[] sanity_check = input.stream().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println("Output: " + Arrays.toString(output));
        System.out.println("Vs sorted: " + Arrays.toString(sanity_check));
        System.out.println("The algorithm is correct? " + Arrays.equals(output, sanity_check));
    }

    public static int[] quicksort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivot = arr[arr.length / 2];
        arr[arr.length / 2] = arr[arr.length - 1];
        arr[arr.length - 1] = pivot;

        int i = -1;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
            }
        }

        arr[arr.length - 1] = arr[i + 1];
        arr[i + 1] = pivot;
        System.arraycopy(
                quicksort(Arrays.stream(arr).limit(i + 1).toArray()),
                0,
                arr,
                0,
                i + 1);

        System.arraycopy(
                quicksort(Arrays.stream(arr).skip(i + 2).toArray()),
                0,
                arr,
                i + 2,
                arr.length - (i + 2));

        return arr;
    }
}
