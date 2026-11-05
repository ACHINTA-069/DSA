class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int val){
        data=val;
        left=right=null;
    }
}
class Solution{
    public boolean isBST(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max){
            return false;
        }
        return isBST(root.left, min, root.data) 
                                && isBST(root.right, root.data, max);
    }
    public boolean checkBST(TreeNode root){
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
public class ValidBST {
    public static void main(String[]args){
         TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        Solution sol=new Solution();
        if(sol.checkBST(root)){
            System.out.println("The BST is valid");
        }
        else{
            System.out.println("The BST is not valid");

        }
    }
}
