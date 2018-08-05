package search.dfs;

import core.LeftRightNode;

public class DfsApp {
    public static void main(String[] args){
        DepthFirstSearch<String> dfs = new DepthFirstSearch<>();
        LeftRightNode<String> root = new LeftRightNode<>("root");
        LeftRightNode<String> a = new LeftRightNode<>("a");
        LeftRightNode<String> b = new LeftRightNode<>("b");
        LeftRightNode<String> aa = new LeftRightNode<>("aa");
        LeftRightNode<String> ab = new LeftRightNode<>("ab");
        LeftRightNode<String> ba = new LeftRightNode<>("ba");
        LeftRightNode<String> bc = new LeftRightNode<>("bc");
        root.setLeft(a);
        root.setRight(b);
        a.setLeft(aa);
        a.setRight(ab);
        b.setLeft(ba);
        b.setRight(bc);
        dfs.visitAllNodes(root);
    }
}
