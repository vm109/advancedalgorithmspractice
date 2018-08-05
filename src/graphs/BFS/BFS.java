package graphs.BFS;

import graphs.Vertex;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public void printAllNodesInGraph(final Vertex root){

        Queue<Vertex> bfsTraversingQueue = new LinkedList<>();

        bfsTraversingQueue.add(root);

        while (bfsTraversingQueue.size()>0){
          Vertex  nextElementInGraph = bfsTraversingQueue.remove();
          System.out.println(nextElementInGraph.getData());
          if (!nextElementInGraph.isVisited()){
              root.setVisited(true);
              List<Vertex> listOfChildren = nextElementInGraph.getAdjacentNodesList();
              for(Vertex childrenNode : listOfChildren){
                  bfsTraversingQueue.add(childrenNode);
              }
          }
        }
    }
}
