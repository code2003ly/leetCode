package bilibili.carl.greedy;

import java.util.Arrays;

//455.分发饼干
public class LC455 {
    public static void main(String[] args) {
        int[] g= {1,2};
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index =0;
        int count=0;
        for(int i =0;i<s.length&&index<g.length;i++){
            if(s[i]>=g[index]){
                count++;
                index++;
            }
        }
        return count;
    }
}
