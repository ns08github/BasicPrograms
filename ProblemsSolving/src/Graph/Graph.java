package Graph;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A graph is an array of adjacency lists.
 * Size of array will be V (number of vertices in graph)
 */
public class Graph {
    // number of vertices
    int V;
    // list of adjacent vertices
    LinkedList<Integer>[] adjacencyList;

    public Graph(int v) {
        // number of vertices
        this.V = v;
        // create the vertices of the graph as a linkedlist to be attached to
        // the other vertices (adjacent vertices list)

        this.adjacencyList = new LinkedList[v+1];

        // sorted the vertices
        for (int i = 1; i <adjacencyList.length; i++) {
            this.adjacencyList[i] = new LinkedList<>();
        }
    }

    /* Adding edges to the graph from source to destination */
    public void addEdges(int source,int destination){
        // from source to destination
        this.adjacencyList[source].add(destination);
        // since it's the undirected graph destination to source is also
        this.adjacencyList[destination].add(source);
    }

    /*printing the adjacency list of the graph */
    public void print(Graph graph){
        /* iterate up to all the vertices*/
        for (int i=1;i<=graph.V;i++){
            System.out.print("head - ");
            System.out.print(i);
            for(Integer list:graph.adjacencyList[i]){
                System.out.print(" -> "+list);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
        *  (0)* * * *(1)
        *  *        * *
        *  *       *  *  *
        *  *      *   *   *
        *  *     *    *    (2)
        *  *    *     *   *
        *  *   *      *  *
        *  *  *       *
        *  (4)* * * *(3)
        *
        *
        * for this graph we are having 5 vertices and 7 edges, so here we
        * first add the vertices to the graph and then create the edges
        * */
        //Graph graph=new Graph(5);
        /* after this graph object created with 5 vertices with their
        adjacent list linked to the each vertices
        0   ->[]
        1   ->[]
        2   ->[]
        3   ->[]
        4   ->[]
        */

//        graph.addEdges(0,1);
//        graph.addEdges(0,4);
//        graph.addEdges(1,2);
//        graph.addEdges(1,3);
//        graph.addEdges(1,4);
//        graph.addEdges(2,3);
//        graph.addEdges(3,4);
//
//        graph.print(graph);


        Graph graph1=new Graph(6);
        graph1.addEdges(1,2);
        graph1.addEdges(1,3);
        graph1.addEdges(2,4);
        graph1.addEdges(2,5);
        graph1.addEdges(3,5);
        graph1.addEdges(4,5);
        graph1.addEdges(4,6);
        graph1.addEdges(5,6);

        ArrayList<Integer> visited = new ArrayList<>();
        visited = graph1.findBFS(visited, graph1, 1);
        visited.forEach((n) -> System.out.println(n));
    }

    public ArrayList findBFS(ArrayList visited, Graph graph, int currentNode) {
        if (visited.size() == graph.V) {
            return visited;
        } else {
            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                for (Integer node : graph.adjacencyList[currentNode]) {
                    findBFS(visited, graph, node);
                }
            }
            return visited;
        }
    }
}
