class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int val){
        data=val;
        left=right=null;
    }
}
class Solution{
    public TreeNode findLCA(TreeNode root,int p,int q){
        if(root==null){
            return null;
        }
        if(p<root.data && q<root.data){
            return findLCA(root.left, p, q);
        }
        if(p>root.data && q>root.data){
            return findLCA(root.right, p, q);
        }
        return root;
    }
}
public class LCA_BST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        int p=5,q=7;

        Solution sol=new Solution();
        TreeNode ans=sol.findLCA(root, p, q);
        System.out.println("The LCA of "+p+" and "+q+" is:"+ans.data);
    }
}
