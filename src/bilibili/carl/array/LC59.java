package bilibili.carl.array;
//59.螺旋矩阵||
public class LC59 {
    public static void main(String[] args) {
        int n =2;
        int[][] nums = generateMatrix(n);
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int count =1;//要存的数
        int start = 0;//开始点
        int loop =0;//控制循环次数同时充当边界值
        int i,j;
        while(loop++<n/2){
            //对第一行赋值(第一行最后一个元素不赋值)
            for(j =start;j<n-loop;j++){
                nums[start][j] = count++;
            }
            //对最后一列赋值
            for(i = start;i<n-loop;i++){
                nums[i][j] = count++;
            }
            //对最后一行赋值
            for(;j>=loop;j--){
                nums[i][j]=count++;
            }
            //第一列赋值
            for(;i>=loop;i--){
                nums[i][j] = count++;
            }
            //开始下一次循环，重置出发点
            start++;
        }
        //如果n为奇数，要补充中间的的那个点
        if(n%2==1){
            nums[start][start] = count;
        }
        return nums;
    }
}
