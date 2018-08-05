package graphs.DFS;

import graphs.Vertex;

public class App {

    public static void main(String[] args){
        Vertex node1 = new Vertex(1);
        Vertex node2 = new Vertex(2);
        Vertex node3 = new Vertex(3);
        Vertex node4 = new Vertex(4);
        Vertex node5 = new Vertex(5);
        Vertex node6 = new Vertex(6);
        Vertex node7 = new Vertex(7);

        node1.setAdjacentNode(node5);
        node1.setAdjacentNode(node6);
        node6.setAdjacentNode(node4);
        node4.setAdjacentNode(node3);
        node4.setAdjacentNode(node2);
        node4.setAdjacentNode(node7);

        DFS depthGraph = new DFS();
        depthGraph.printDFSGraph(node1);
    }
}
