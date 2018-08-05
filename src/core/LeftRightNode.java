package core;

public class LeftRightNode<T> {
    private T data;
    private LeftRightNode left;
    private LeftRightNode right;
    private boolean visited;
    public LeftRightNode(T data){
        this.data = data;
    }
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LeftRightNode getLeft() {
        return left;
    }

    public void setLeft(LeftRightNode left) {
        this.left = left;
    }

    public LeftRightNode getRight() {
        return right;
    }

    public void setRight(LeftRightNode right) {
        this.right = right;
    }
}
