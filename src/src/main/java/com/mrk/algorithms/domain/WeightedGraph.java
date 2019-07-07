package com.mrk.algorithms.domain;

import java.util.LinkedList;

public class WeightedGraph {

    static class Edge{
        String origin;
        String destination;
        Integer indexOrigin;
        Integer indexDestination;
        Integer weight;

        public Edge(String origin, String destination, Integer weight, Integer indexOrigin, Integer indexDestination) {
            this.origin = origin;
            this.destination = destination;
            this.weight = weight;
            this.indexDestination = indexDestination;
            this.indexOrigin = indexOrigin;
        }
    }

    static class graph{
        int quantOfVertexs;
        LinkedList<Edge> [] adjacencyList;

        public graph(Integer quantOfVertex){
            this.quantOfVertexs = quantOfVertex;
            this.adjacencyList = new LinkedList[quantOfVertex];
            for(int index = 0; index < quantOfVertex; index++){
                adjacencyList[index] = new LinkedList<>();
            }
        }

        public void addEdge(Integer indexOrigin, Integer indexDEstination,
                            String origin, String destination, Integer weight){
            Edge edge = new Edge(origin, destination, weight, indexOrigin, indexDEstination);
            this.adjacencyList[indexOrigin].addFirst(edge);
        }

        public void mapGraphEntry(){
            for(int index = 0; index < this.quantOfVertexs; index++ ){
                LinkedList<Edge> list = this.adjacencyList[index];
                for(Edge edge : list){
                    System.out.println("NOde " + edge.origin + " is connected to " + edge.destination + " with weight " +  edge.weight);
                }
            }
        }
    }

}
