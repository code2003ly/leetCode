package bilibili.carl.hashTable;

import java.util.HashSet;
import java.util.Set;

public class LC202 {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();
        while(n!=1&&!record.contains(n)){
            record.add(n);
            n = getNextNum(n);
        }
        return n==1;
    }
    public int getNextNum(int n){
        int ans = 0;
        while(n!=0){
            ans+=((n%10)*(n%10));
            n/=10;
        }
        return ans;
    }
}
