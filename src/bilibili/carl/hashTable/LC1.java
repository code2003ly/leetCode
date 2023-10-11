package bilibili.carl.hashTable;

import java.util.HashMap;
import java.util.Map;

//1.两数之和
public class LC1 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            if(nums==null||nums.length==0){
                return ans;
            }
            Map<Integer,Integer> map = new HashMap<>();
            for(int i =0;i< nums.length;i++){
                int temp = target-nums[i];
                if(map.containsKey(temp)){
                    ans[1] = i;
                    ans[0] = map.get(temp);
                    break;
                }
                map.put(nums[i],i);
            }
            return ans;
        }
    }
}
