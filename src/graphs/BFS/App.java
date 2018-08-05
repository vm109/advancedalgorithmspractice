package graphs.BFS;

import graphs.Vertex;

public class App {
    public static void main(String[] args){
        Vertex node1 = new Vertex(1);
        Vertex node2 = new Vertex(2);
        Vertex node3 = new Vertex(3);
        Vertex node4 = new Vertex(4);
        Vertex node5 = new Vertex(5);
        Vertex node6 = new Vertex(6);

        node1.setAdjacentNode(node3);
        node1.setAdjacentNode(node4);
        node3.setAdjacentNode(node2);
        node4.setAdjacentNode(node5);
        node4.setAdjacentNode(node6);

        BFS bfs = new BFS();
        bfs.printAllNodesInGraph(node1);
    }
}
