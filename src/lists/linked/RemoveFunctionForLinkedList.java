package lists.linked;

import lists.LinkedList;
import lists.StringNode;

public class RemoveFunctionForLinkedList {

    public StringNode removeNodeFromStringLinkedList(StringNode rootNode,String dataToBeRemoved) throws Exception {
        StringNode strTempNode = rootNode;
        StringNode nodeBeforeRequestedRemovalNode = null;
        if(rootNode.getData().equalsIgnoreCase(dataToBeRemoved)){
            rootNode = strTempNode.getNextNode();
            return rootNode;
        }
        while(strTempNode.getNextNode()!=null ){
            if(strTempNode.getNextNode().getData().equalsIgnoreCase(dataToBeRemoved)){
                nodeBeforeRequestedRemovalNode = strTempNode;
                break;
            }else {
                strTempNode = strTempNode.getNextNode();
            }
        }
        if(nodeBeforeRequestedRemovalNode.getNextNode()!=null && nodeBeforeRequestedRemovalNode.getNextNode().getNextNode()!=null) {
            nodeBeforeRequestedRemovalNode.setNextNode(nodeBeforeRequestedRemovalNode.getNextNode().getNextNode());
        }else{
            nodeBeforeRequestedRemovalNode.setNextNode(null);
        }
        return rootNode;
    }
}
