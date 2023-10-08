package bilibili.carl.linkedList;

import java.util.Scanner;

//19.删除链表的倒数第n个数
public class LC19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x2 = sc.nextInt();
        long y2 = sc.nextInt();
        long z2 = sc.nextInt();
        long m = sc.nextInt();
        //边界判断的点
        long x1=1,y1=1,z1=1;
        //计算最初的的体积
        long initVolume = x2 * y2 * z2;
        //改变后的体积
        long afterVolume;
        //输入m次操作
        while (m-- > 0) {
            long op = sc.nextInt();
            long k = sc.nextInt();
            if (op == 1) {
                //切到了蛋糕
                if(k>=x1){
                    afterVolume = initVolume-((k-x1+1)*(y2-y1+1)*(z2-z1+1));
                    //判断剩下的体积是不是负数
                    if(afterVolume>0) System.out.println(afterVolume);
                    else System.out.println(0);
                    //体积和坐标变化
                    initVolume = afterVolume;
                    x1 = k+1;
                //没有切到蛋糕
                }else {
                    System.out.println(initVolume);
                }
            } else if (op == 2) {
                if(k>=y1){
                    afterVolume = initVolume-((x2-x1+1)*(k-y1+1)*(z2-z1+1));
                    //判断剩下的体积是不是负数
                    if(afterVolume>0) System.out.println(afterVolume);
                    else System.out.println(0);
                    //体积和坐标变化
                    initVolume = afterVolume;
                    y1 = k+1;
                    //没有切到蛋糕
                }else {
                    System.out.println(initVolume);
                }
            } else if (op == 3) {
                if(k>=z1){
                    afterVolume = initVolume-((x2-x1+1)*(y2-y1+1)*(k-z1+1));
                    //判断剩下的体积是不是负数
                    if(afterVolume>0) System.out.println(afterVolume);
                    else System.out.println(0);
                    //体积和坐标变化
                    initVolume = afterVolume;
                    z1 = k+1;
                    //没有切到蛋糕
                }else {
                    System.out.println(initVolume);
                }
            }

        }
    }
}
