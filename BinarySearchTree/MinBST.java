



class TreeNode{
    int data;
    TreeNode left,right;

    public TreeNode(int val) {
        data=val;
        left=right=null;
    }
}
class Solution{
    public TreeNode findmin(TreeNode root){
        if(root==null)
            return null;
        if(root.left==null)
            return root;
        return findmin(root.left);
    }
}
public class MinBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution sol=new Solution();
        TreeNode ans=sol.findmin(root);
        System.out.println("The Min value is:"+ans.data);
    }
}
