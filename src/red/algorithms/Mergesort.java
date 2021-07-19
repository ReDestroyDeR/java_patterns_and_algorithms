package red.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Mergesort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        while (scanner.hasNext())
            input.add(scanner.nextInt());

        System.out.println("Input: " + Arrays.toString(input.toArray()));
        int[] output = mergesort(input.stream().mapToInt(Integer::intValue).toArray());
        int[] sanity_check = input.stream().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println("Output: " + Arrays.toString(output));
        System.out.println("Vs sorted: " + Arrays.toString(sanity_check));
        System.out.println("The algorithm is correct? " + Arrays.equals(output, sanity_check));
    }

    public static int[] mergesort(int[] arr) {
        if (arr.length <= 1)
            return arr;

        int[] left = mergesort(Arrays.stream(arr).limit(arr.length / 2 - 1).toArray());
        int[] right = mergesort(Arrays.stream(arr).skip(arr.length / 2 - 1).toArray());

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] global = new int[left.length + right.length];

        int l = 0;
        int r = 0;
        for (int i = 0; i < global.length - 1; i++) {
            if (r < right.length && right[r] <= left[l]) {
                global[i] = right[r];
                r++;
            } else {
                global[i] = right[l];
                l++;
            }
        }

        return global;
    }
}
