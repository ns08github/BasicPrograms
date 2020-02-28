package Graph;

import java.util.LinkedList;
import java.util.Vector;

public class SplitWise {
    int V;
    LinkedList<Edge>[] relation;

    /*
    * (A)------>[{0,[]}]
    * (B)------>[{0,[]}]
    * (C)------>[{0,[]}]
    * (D)------>[{0,[]}]
    * */

    public SplitWise(int v) {
        this.V = v;
        this.relation=new LinkedList[v];

        for (int i=0;i<this.relation.length;i++){
            this.relation[i]=new LinkedList<>();
        }
    }
    public void addEdges(char src,char dest,int weight){
        Edge edge=new Edge(src, dest, weight);
        this.relation[src].add(edge);
    }

    public static void main(String[] args) {
        SplitWise splitWise=new SplitWise(4);
        splitWise.addEdges('A','B',30);
        splitWise.addEdges('B','C',30);
        splitWise.addEdges('C','D',30);
        splitWise.addEdges('D','E',30);
        splitWise.addEdges('E','F',30);
    }

    public static class Edge{
        char src;
        char dest;
        int weight;

        public Edge(char src, char dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

}
