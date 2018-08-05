package lists;

import lists.linked.RemoveFunctionForLinkedList;

public class LinkedList  extends RemoveFunctionForLinkedList {

    public Node createStringLinkedList(String[] data){
        StringNode strRootNode = new StringNode();
        StringNode strTempNode =  strRootNode;
        for(String inputValue: data){
            strTempNode.setData(inputValue);
            strTempNode.setNextNode(new StringNode());
            strTempNode = strTempNode.getNextNode();
        }
        return strRootNode;
    }

    public Node creatIntegerLinkedList(int[] data){
        IntNode intRootNode = new IntNode();
        IntNode intTempNode = intRootNode;
        for(int inputValue: data){
            intTempNode.setData(inputValue);
            intTempNode.setNext(new IntNode());
            intTempNode = intTempNode.getNext();
        }
        return intRootNode;
    }

    public void print(Node rootNode){
        try{
            StringNode strRootNode = (StringNode)rootNode;
            StringNode tempNode = strRootNode;
            while(tempNode.getNextNode()!=null){
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNextNode();
            }
        }catch(ClassCastException e){
            IntNode introotNode = (IntNode)rootNode;
            IntNode tempNode = introotNode;
            while(tempNode.getNext()!=null){
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNext();
            }
        }
    }


}
