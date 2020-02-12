package Array;

/**
 *
 * Example:
 * Input:
 * 2
 * 5
 * -8 2 3 -6 10
 * 2
 * Output:
 * -8 0 -6 -6
 */
public class LargestNegativeInEveryWindowSize {
    public static void main(String[] args) {
        LargestNegativeInEveryWindowSize obj = new LargestNegativeInEveryWindowSize();
        int[] a = {-8, 2, 3, -6, 10};
        int k = 2;
        for (int i = 0; i <= a.length - k; i++) {
            int min = 0;
            min = obj.findDiff(k,i,min,a);
            System.out.println(min);
        }

    }


    public int findDiff(int diff,int i,int min,int[] a) {
        int index=Math.abs(i+(diff-1));
        if (diff == 0) {
            return min;
        } else {
            if (a[index]<min) {
                if(index==i){
                    return a[index];
                }else{
                    min=a[index];
                }
            }
            diff--;
            return findDiff(diff,i,min,a);
        }
    }
}
