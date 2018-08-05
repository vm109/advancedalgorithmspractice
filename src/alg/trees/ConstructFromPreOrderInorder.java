package alg.trees;

import alg.TreeNode;

import java.util.*;

/*
Creating a tree from the preorder and Inorder sequences
Preorder - Starts from the root,
Inorder - Starts from the Left child on the leaf
 */
public class ConstructFromPreOrderInorder {

    private List<Integer> inorder = new ArrayList<>();
    private List<Integer> preorderList = new ArrayList<>();

  int index = -1;

    private TreeNode root = new TreeNode();
    private TreeNode temp = root;

    public void setInorder(List<Integer> inorder) {
        this.inorder = inorder;
    }

    public void setPreorder(List<Integer> preorder) {
        this.preorderList = preorder;
    }

    public void createTree( TreeNode parent, List<Integer> inorderList){

        if(inorderList.size()==1){
            parent.setData(inorderList.get(0));
            index++;
        }
       else if(inorderList.size()>1 && index<7) {
           index++;
           parent.setData(preorderList.get(index));

           int indexBreaker = 0;
           for (int value : inorderList) {
               if (value == preorderList.get(index)) {
                   break;
               }
               indexBreaker++;
           }
           List<Integer> leftTree = inorderList.subList(0, indexBreaker);
           List<Integer> rightTree = new ArrayList<>();
           if (indexBreaker+1<=inorderList.size()) {
               rightTree = inorderList.subList(indexBreaker + 1, inorderList.size());
           }
            parent.setLeft(new TreeNode());
           parent.setRight(new TreeNode());

           createTree(parent.getLeft(), leftTree);
           createTree(parent.getRight(), rightTree);
       }

    }

    public static void main(String[] args){
        ConstructFromPreOrderInorder cp = new ConstructFromPreOrderInorder();
        Integer[] inOrderArray = {3, 1, 4, 0, 5, 2, 6 };
        Integer[] preorderarray = {0,1, 3, 4, 2, 5, 6 };
        List<Integer> preOrder = Arrays.asList(preorderarray);
        List<Integer> inOrder = Arrays.asList(inOrderArray);
        cp.setInorder(inOrder);
        cp.setPreorder(preOrder);
        cp.createTree(cp.root,inOrder);
    }

}
