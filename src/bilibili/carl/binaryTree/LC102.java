package bilibili.carl.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//102.二叉树的层序遍历
public class LC102 {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        if(root==null){
            return resList;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> itemList = new ArrayList<>();
            int len = que.size();
            while(len>0){
                TreeNode tempNode = que.poll();
                itemList.add(tempNode.val);

                if(tempNode.left!=null){
                    que.offer(tempNode.left);
                }
                if(tempNode.right!=null){
                    que.offer(tempNode.right);
                }
                len--;
            }
            resList.add(itemList);
        }
        return resList;
    }
}
