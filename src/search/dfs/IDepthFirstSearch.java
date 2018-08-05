package search.dfs;

import core.LeftRightNode;

public interface IDepthFirstSearch<T> {
    void visitAllNodes(LeftRightNode<T> rootNode);
}
