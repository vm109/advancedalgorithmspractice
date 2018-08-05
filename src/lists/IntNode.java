package lists;

public class IntNode implements Node{
    private int data;
    private IntNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    @Override
    public IntNode getRootNode() {
        return this;
    }
}
