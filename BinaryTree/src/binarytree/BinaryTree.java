
package binarytree;

import java.util.*;

class TreeNode{ //Node Class
    public int data;
    public TreeNode leftChild;
    public TreeNode rightChild;
    public void displayNode(){
        System.out.print(" "+data+" ");
    }
}

class Tree{ //Tree Class
    private TreeNode root;
    public Tree(){
        root=null;
    }
    
    public TreeNode getRoot(){
        return root;
    }
    
    public void preOrder(TreeNode localRoot){ //Navigating the tree preOrder
        if(localRoot != null){
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
    
    public void inOrder(TreeNode localRoot){ //Navigating the tree inOrder
        if(localRoot != null){
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);  
        }
    }
    
    public void postOrder(TreeNode localRoot){ //Navigating the tree postOrder
        if(localRoot != null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }
    
    public void insert(int newdata){ //The method of adding a node
        TreeNode newNode = new TreeNode();
        newNode.data=newdata;
        
        if(root==null)
            root = newNode;
        else{
            TreeNode current = root;
            TreeNode parent;
            while(true){
                parent = current;
                if(newdata < current.data)
                    current = current.leftChild;
                if(current == null){
                    parent.leftChild = newNode;
                    return;
                }
                else{
                    current = current.rightChild;
                    if( current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }//end while
        }//end else not root
    }//end insert
}//class Tree

public class BinaryTree {

    public static void main(String[] args) {
        
        Tree theTree = new Tree();
        
        //A total of 10 number placements.
        System.out.print("Numbers: ");
        for(int i = 0; i < 10; ++i){
            int number = (int)(Math.random()*100);
            System.out.print(number+" ");
            theTree.insert(number);
        };
        
        System.out.print("\n Navigating the tree InOrder : ");
        theTree.inOrder(theTree.getRoot());
        System.out.print("\n Navigating the tree PreOrder :");
        theTree.preOrder(theTree.getRoot());
        System.out.print("\n Navigating the tree PostOrder :");
        theTree.postOrder(theTree.getRoot());
        
    }
    
}
