package Graph;

import java.util.LinkedList;

/*
 * Weighted graph is the collection of number of vertices and the list of
 * adjacent relation to that node i.e. the list of objects of edges here*/
public class WeightedGraph {
    // no of vertices
    int V;
    // list of edges as the adjacentList
    LinkedList<Edge>[] adjacentList;

    public WeightedGraph(int v) {
        this.V = v;
        // this makes the number adjacent list as the number of vertices
        this.adjacentList = new LinkedList[v];
        for (int i = 0; i < this.adjacentList.length; i++) {
            // this create a new linkedList (all adjacent list ) attached to
            // all the edges
            /*
             * 0   ->[]
             * 1   ->[]
             * 2   ->[]
             * 3   ->[]
             * 4   ->[]
             * */
            this.adjacentList[i] = new LinkedList<Edge>();
        }
    }

    public void addEdges(int src,int dest,int weight){
        Edge edge= new Edge(src, dest, weight);
        this.adjacentList[src].add(edge);
    }

    public static void main(String[] args) {
        /*
         *  (0)* * * [5]* * * >(1)
         *  *                * ^  *
         *  *             *    *   [30]
         *  *           *      *     * >
         * [8]       [10]     [15]     * (2)
         *  *       *          *     *
         *  *    *             *   [20]
         *  > <                * <
         *  (4)* * * [20] * * >(3)
         */
        WeightedGraph weightedGraph = new WeightedGraph(5);
        weightedGraph.addEdges(0,1,5);
        weightedGraph.addEdges(0,4,8);
        weightedGraph.addEdges(1,2,30);
        weightedGraph.addEdges(1,4,10);
        weightedGraph.addEdges(2,3,20);
        weightedGraph.addEdges(3,1,15);
        weightedGraph.addEdges(4,3,20);
    }

    /* Edges contains the source, destination and weight for that relation*/
    class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
}

