package bilibili.carl.array;
//长度最小的子数组
public class LC209 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSubArrayLen(target,nums);
        System.out.println(ans);

    }

    public static int minSubArrayLen(int target, int[] nums) {
        int j =0;
        int sum =0;
        int result = Integer.MAX_VALUE;
        for(int i =0;i< nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                int temp = i-j+1;
                result = Math.min(temp,result);
                sum-=nums[j];
                j++;
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }
}
