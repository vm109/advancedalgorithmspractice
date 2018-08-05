package lists;

public class MainApp {
    public static void main(String[] args) throws Exception {
        LinkedList lk = new LinkedList();
        String[] data = {"one","two","three","four","five","six"};
        Node rootNode = lk.createStringLinkedList(data);
        lk.print(rootNode);
        int[] intData = {1,2,3,4,5,6};
        Node rootIntNode = lk.creatIntegerLinkedList(intData);
        lk.print(rootIntNode);

        rootNode=   lk.removeNodeFromStringLinkedList((StringNode) rootNode, "four");

        lk.print(rootNode);
        System.out.println("------");
       rootNode= lk.removeNodeFromStringLinkedList((StringNode) rootNode,"one");
        lk.print(rootNode);
        System.out.println("------");
        rootNode=   lk.removeNodeFromStringLinkedList((StringNode) rootNode,"six");
        lk.print(rootNode);

    }
}
