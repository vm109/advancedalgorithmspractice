package search.dfs;

import core.LeftRightNode;

import java.util.Stack;

public class DepthFirstSearch<T> implements  IDepthFirstSearch<T>{

    @Override
    public void visitAllNodes(LeftRightNode<T> rootNode) {
        Stack<LeftRightNode<T>> depthFirstSearchStack = new Stack<>();
        depthFirstSearchStack.push(rootNode);
        while(!depthFirstSearchStack.empty()){
            LeftRightNode<T> node = depthFirstSearchStack.pop();
            node.isVisited();
            System.out.println(node.getData());
            if(node.getLeft()!=null){
                depthFirstSearchStack.push(node.getLeft());
            }
            if(node.getRight()!=null){
                depthFirstSearchStack.push(node.getRight());
            }
        }
    }
}
