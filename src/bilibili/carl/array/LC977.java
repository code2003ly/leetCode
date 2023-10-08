package bilibili.carl.array;
//977.有序数组的平方
public class LC977 {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] newNums = sortedSquares(nums);
        for(int i =0;i<newNums.length;i++){
            System.out.print(newNums[i]+" ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] newNums = new int[nums.length];
        int left = 0,right = nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(Math.abs(nums[right])>=Math.abs(nums[left])){
                newNums[i] = nums[right]*nums[right];
                right--;
            }else {
                newNums[i] = nums[left]*nums[left];
                left++;
            }
        }
        return newNums;
    }
}
