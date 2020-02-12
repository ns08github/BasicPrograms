package Array;

public class FirstSecondThirdMax {
    public static void main(String[] args) {
        Utils utils = new Utils();
        FirstSecondThirdMax obj = new FirstSecondThirdMax();
        int[] arr = {55, 22, 77, 65, 40, 33, 97, 88};

        utils.print(arr);
        obj.findFirstSecondThirdMax(arr);
    }

    public void findFirstSecondThirdMax(int[] arr) {
        System.out.println();
        int first = 0, second = 0, third = 0;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        System.out.println(first + "," + second + "," + third);
    }
}
