package lists;

public class StringNode  implements Node{
    private String data;
    private StringNode nextNode;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public StringNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(StringNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public Node getRootNode() {
        return this;
    }
}
