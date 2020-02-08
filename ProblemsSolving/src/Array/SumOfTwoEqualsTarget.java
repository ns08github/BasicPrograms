package Array;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Sum of two number in an array equals to the target value
 * ex   -
 * input    -   [2,1,4,3,6,9], target=9;
 * output   -   [3,4]
 */
public class SumOfTwoEqualsTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumOfTwoEqualsTarget obj = new SumOfTwoEqualsTarget();
        System.out.println("Enter the length of array");
        int len = scanner.nextInt();
        int[] a = new int[len];
        System.out.println("Enter the element of array");
        for (int i = 0; i < len; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter target");
        int target = scanner.nextInt();
        obj.print(a);
        obj.findSumEqualTarget(a, target);
    }

    public void print(int[] a) {
        System.out.println();
        for (Integer element : a) {
            System.out.print(element + ",");
        }
    }

    public void findSumEqualTarget(int[] a, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int diff = Math.abs(a[i] - target);
            map.put(diff, i);
        }
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                System.out.println();
                System.out.println("[" + i + "," + map.get(a[i]) + "]");
                return;
            }
        }
    }
}
