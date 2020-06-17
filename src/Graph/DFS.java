package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private int V;
    private LinkedList<Integer> adjacent[];
    DFS(int v){
        V=v;
        adjacent=new LinkedList[v];
        for (int i=0;i<v;i++){
            adjacent[i]=new LinkedList<>();
        }
    }

    void addEdge(int v,int w){
        adjacent[v].add(w);
    }

    void TraverseDFS(int v){
        boolean visited[]=new boolean[V];
        UtilDFS(v,visited);

    }
    void UtilDFS(int v,boolean[] visited){
        visited[v]=true;
        System.out.print(v+" ");
        Iterator<Integer> iterator=adjacent[v].listIterator();
        while (iterator.hasNext()){
            int n=iterator.next();
            if (!visited[n]){
                UtilDFS(n,visited);
            }
        }
    }
    public static void main(String[] args) {
        DFS graph=new DFS(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        graph.TraverseDFS(1);
    }
}
