package Array;

public class ReversalOfArray {
    public static void main(String[] args) {
        ReversalOfArray obj = new ReversalOfArray();
        Utils utils = new Utils();
        int[] arr = {55, 22, 77, 65, 40, 33, 97, 88};
        utils.print(arr);
        int[] rev = obj.reversalOfArray(arr);
        utils.print(rev);
    }

    public int[] reversalOfArray(int[] arr) {
        System.out.println();
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}
