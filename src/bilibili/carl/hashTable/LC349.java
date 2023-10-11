package bilibili.carl.hashTable;

import java.util.*;

//349.两个数组的交集
public class LC349 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] nums3 = intersection1(nums1,nums2);
        int[] nums4 = intersection2(nums1,nums2);
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
    }

    //使用hashset
    public static int[] intersection1(int[] nums1, int[] nums2) {
        if(nums1==null||nums1.length==0||nums2==null||nums2.length==0){
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resset = new HashSet<>();
        //遍历数组1
        for(int i : nums1){
            set1.add(i);
        }
        //判断数组2中的元素是否在数组1中
        for(int i :nums2){
            if(set1.contains(i)){
                resset.add(i);
            }
        }
        //将集合转成数组
        int[] arr = new int[resset.size()];
        int j =0;
        for(int i :resset){
            arr[j++] = i;
        }
        return arr;
    }
    //使用数组
    public static int[] intersection2(int[] nums1, int[] nums2) {
        int[] hash1 = new int[1010];
        int[] hash2 = new int[1010];
        //遍历数组1
        for(int  i :nums1){
            hash1[i]++;
        }
        //遍历数组2
        for(int i :nums2){
            hash2[i]++;
        }
        //将共有元素加入到列表中
        List<Integer> resList =new ArrayList<>();
        for(int i =0;i<1010;i++){
            if(hash1[i]>0&&hash2[i]>0){
                resList.add(i);
            }
        }
        //将列表中的元素放入数组并返回
        int index = 0;
        int[] arr = new int[resList.size()];
        for(int i :resList){
            arr[index++] = i;
        }
        return arr;
    }
}
