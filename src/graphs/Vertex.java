package graphs;

import java.util.LinkedList;

public class Vertex {
    private int data;
    private boolean visited;
    private LinkedList<Vertex> adjacentNodesList;

    public Vertex(int data){
        this.data = data;
        this.adjacentNodesList = new LinkedList<>();
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public LinkedList<Vertex> getAdjacentNodesList() {
        return adjacentNodesList;
    }

    public void setAdjacentNode(Vertex adjacentNodesList) {
        this.adjacentNodesList.add(adjacentNodesList);
    }
}
