class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int val){
        data=val;
        left=right=null;
    }
}
class Solution{
    public TreeNode searchBST(TreeNode root,int target){
        if(root!=null&&root.data!=target){
            if(root.data>target){
                return searchBST(root.left, target);
            }
            else{
                return searchBST(root.right, target);
            }
        }
        return root;
    }
}
class SearchBST{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int target=3;

        Solution sol=new Solution();
        TreeNode a1=sol.searchBST(root, target);
        if(a1!=null){
            System.out.println("Result Found:"+a1.data);}
        else{
            System.out.println("Result is not present....");
        }
    }
}