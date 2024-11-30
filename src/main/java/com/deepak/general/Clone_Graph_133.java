package com.deepak.general;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Clone_Graph_133 {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> visistedMap = new HashMap<>();
        Queue<Node> queue  = new LinkedList<>();

        queue.add(node);
        visistedMap.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            for (Node neighbour : currentNode.children) {
                if (!visistedMap.containsKey(neighbour)) {
                    visistedMap.put(neighbour, new Node(neighbour.val));
                    queue.add(neighbour);
                }
                visistedMap.get(currentNode).children.add(visistedMap.get(neighbour));
            }
        }
        return visistedMap.get(node);
    }
}
