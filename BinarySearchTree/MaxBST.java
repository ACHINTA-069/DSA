

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int val){
        data=val;
        left=right=null;
    }
}
class Solution{
    public TreeNode finrmax(TreeNode root){
        if(root==null)
            return null;
        if(root.right==null){
            return root;
        }
        return finrmax(root.right);
    }
}
public class MaxBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        Solution sol=new Solution();
        TreeNode ans=sol.finrmax(root);
        System.out.println("The Max root is:"+ans.data);
    }
}
