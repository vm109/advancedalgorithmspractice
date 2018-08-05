package graphs.DFS;

import graphs.Vertex;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DFS {

    public void printDFSGraph(Vertex rootVertex){
        Deque<Vertex> graphQueue = new LinkedList<>();
        graphQueue.add(rootVertex);
        while((graphQueue.size()>0)){
            Vertex presentVertex = graphQueue.remove();
            presentVertex.setVisited(true);
            List<Vertex> childrenNodes = presentVertex.getAdjacentNodesList();
            for(Vertex node : childrenNodes){
                graphQueue.addFirst(node);
            }
            System.out.println(presentVertex.getData());
        }
    }
}
