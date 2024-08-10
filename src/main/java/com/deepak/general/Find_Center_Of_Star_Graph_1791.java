package com.deepak.general;

public class Find_Center_Of_Star_Graph_1791 {

    public int findCenter(int[][] edges) {
        int firstNodeOfFirstEdge = edges[0][0];
        int secondNodeOfFirstEdge = edges[0][1];

        int firstNodeOfSecondEdge = edges[1][0];
        int secondNodeOfSecondEdge = edges[1][1];

        if(firstNodeOfFirstEdge == firstNodeOfSecondEdge || firstNodeOfFirstEdge == secondNodeOfSecondEdge) {
            return firstNodeOfFirstEdge;
        } else {
            return secondNodeOfFirstEdge;
        }
    }
}
