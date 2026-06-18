package com.microservice.Binary;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }

}
public class MaxDepthOfBinaryTree {
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDepth=maxDepth(root.left);
        int righDepth=maxDepth(root.right);
        return Math.max(leftDepth,righDepth)+1;

    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        int depth=maxDepth(root);
        System.out.println(depth);
    }
}
