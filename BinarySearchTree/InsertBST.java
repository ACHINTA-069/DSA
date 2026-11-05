

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int val){
        data=val;
        left=right=null;
    }
}
class Solution{
    static void inorder(TreeNode root) {
    if (root == null) return;

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
    public TreeNode insurtBST(TreeNode root,int value){
        if(root==null) return new TreeNode(value);
        
        if(root.data>value){
            root.left=insurtBST(root.left, value);    
        }
        else{
            root.right=insurtBST(root.right, value);
        }
        return root;
    }
}
public class InsertBST {
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        Solution sol=new Solution();
        sol.insurtBST(root, 5);
        sol.inorder(root);
    }
}
