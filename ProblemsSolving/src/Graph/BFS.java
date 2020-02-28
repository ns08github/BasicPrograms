package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    int V;
    LinkedList<Integer>[] adjacent;

    public BFS(int v) {
        this.V = v;
        this.adjacent = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            this.adjacent[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS(4);
        bfs.addEdges(0, 1);
        bfs.addEdges(0, 2);
        bfs.addEdges(1, 2);
        bfs.addEdges(2, 0);
        bfs.addEdges(2, 3);
        bfs.addEdges(3, 3);


        ArrayList<Integer> visited = new ArrayList<>();
        visited=bfs.findBFSUsingQueue(2,bfs);
        //visited = bfs.findBFS(visited, bfs, 2);
        visited.forEach((n) -> System.out.println(n));
    }

    public void addEdges(int src, int dest) {
        this.adjacent[src].add(dest);
    }

    public ArrayList findDFS(ArrayList visited, BFS graph, int currentNode) {
        if (visited.size() == graph.V) {
            return visited;
        } else {
            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                for (Integer node : graph.adjacent[currentNode]) {
                    findDFS(visited, graph, node);
                }
            }
            return visited;
        }
    }

    public ArrayList findBFSUsingQueue(int node,BFS graph){
        ArrayList<Integer> arr=new ArrayList<>();
        boolean visited[]=new boolean[graph.V];
        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(node);
        visited[node]=true;
        while (queue.size()!=0){
            // fetch element from queue
            int e=queue.poll();
            arr.add(e);
            Iterator<Integer> itr=graph.adjacent[e].listIterator();
            while (itr.hasNext()){
                int next=itr.next();
                if(!visited[next]){
                    visited[next]=true;
                    queue.add(next);
                }
            }
        }
        return arr;
    }

}
