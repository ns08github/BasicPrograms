package Array;

public class TwoSumLeetCode {

        public static void main(String[] args) {
            TwoSumLeetCode obj=new TwoSumLeetCode();
            int[] nums={2,7,11,15};
            int target=9;
            int[] found=obj.twoSum(nums,target);

        }

        public int[] twoSum(int[] nums, int target) {

            int[] found=new int[2];
            int left=0;
            /*int right=a.length-1;
            for(int i=0;i<a.length;i++){
                if(a[left]+a[right]==target){
                    found[0]=left;
                    found[1]=right;
                    return found;
                }else if(a[left]+a[right]>target){
                    right--;
                }else if(a[left]+a[right]<target){
                    left++;
                }
            }*/
            return found;
        }
}
