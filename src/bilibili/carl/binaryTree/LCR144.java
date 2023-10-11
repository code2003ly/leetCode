package bilibili.carl.binaryTree;
//LCR144.翻转二叉树
public class LCR144 {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode mirrorTree(TreeNode root) {
        reverseNode(root);
        return root;
    }
    public void reverseNode(TreeNode node){
        if(node==null){
            return;
        }
        //交换节点
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
        reverseNode(node.left);
        reverseNode(node.right);
    }
}
