package com.microservice.graph;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val=val;
    }
}
public class Bfs {
    public static List<List<TreeNode>> bfs(TreeNode root){
        List<List<TreeNode>> result=new ArrayList<>();
        if(root==null){
            return result;

        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            List<TreeNode> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current= queue.poll();
                level.add(current);
                if(current.left!=null)
                    queue.offer(current.left);
                if(current.right!=null)
                    queue.offer(current.right);



            }
            result.add(level);


        }
        return result;

    }
    public static void main(String[] args) {
        TreeNode node=new TreeNode(3);
        node.left=new TreeNode(9);
        node.right=new TreeNode(20);
        node.right.left=new TreeNode(15);
        node.right.right=new TreeNode(7);
        List<List<TreeNode>> result=bfs(node);
        for(List<TreeNode> level:result){
            for(TreeNode n:level){
                System.out.println(n.val);
            }

        }
        System.out.println();


    }
}
