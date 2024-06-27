//Minimum Size Subarray Sum.
public class question23 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(nums, target));
    }
    public static int minSubArrayLen(int[] nums, int target) {
        int sum=0;
        int min=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
           min = Math.min(min,i-start+1);
           sum-=nums[start];
           start++;
            }
}
return min==0?0:min;
}
}
