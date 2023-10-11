package bilibili.carl.hashTable;
//242.有效的字母异位词
public class LC242 {
    public static void main(String[] args) {

    }
    //s,t只包含小写字母
    public boolean isAnagram(String s, String t) {
        //将字符串s映射成哈希表
        int[] hash = new int[26];
        for(int i =0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        //字符串t比较
        for(int i =0;i<t.length();i++){
            hash[t.charAt(i)-'a']--;
        }
        //遍历哈希表看是否都为0
        for(int i =0;i<hash.length;i++){
            if(hash[i]!=0) return false;
        }
        return true;
    }
}
