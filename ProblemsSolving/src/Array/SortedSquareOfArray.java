package Array;


import java.util.Scanner;

/*
 * Create a program for created the square of all element of a
 * sorted array in sorted form.
 *
 * ex    -   input   -   [-6,-4,1,2,5]
 * op    -   output  -   [1,4,16,25,36]
 *
 * */
public class SortedSquareOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedSquareOfArray obj = new SortedSquareOfArray();
        System.out.println("Enter the length of array");
        int len = scanner.nextInt();
        int[] a = new int[len];
        System.out.println("Enter the element of array");
        for (int i = 0; i < len; i++) {
            a[i] = scanner.nextInt();
        }
        obj.print(a);
        int[] new_a = obj.squareOfArrayWithSorting(a);
        obj.print(new_a);
    }

    public void print(int[] a) {
        System.out.println();
        for (Integer element : a) {
            System.out.print(element + ",");
        }
    }

    public int[] squareOfArrayWithSorting(int[] a) {
        int len = a.length;
        int[] temp = new int[len];
        int left = 0;
        int right = len - 1;
        int j = len - 1;
        for (int i = 0; i < len; i++) {
            if (Math.abs(a[left]) >= a[right]) {
                temp[j - i] = a[left] * a[left];
                left++;
            } else if (Math.abs(a[left]) < a[right]) {
                temp[j - i] = a[right] * a[right];
                right--;
            }
        }

        return temp;
    }
}
