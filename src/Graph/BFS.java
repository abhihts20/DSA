package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    private int V;
    private LinkedList<Integer> adjacent[];
    BFS(int v){
        V=v;
        adjacent=new LinkedList[v];
        for (int i=0;i<v;i++){
            adjacent[i]=new LinkedList<>();
        }
    }

    void addEdge(int v,int w){
        adjacent[v].add(w);
    }

    void TraverseBFS(int s){
        boolean[] visited=new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while (queue.size()!=0){
            s=queue.poll();
            System.out.print(s+" ");

            Iterator<Integer> iterator=adjacent[s].listIterator();
            while (iterator.hasNext()){
                int n=iterator.next();
                if (!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        BFS graph=new BFS(4);
        graph.addEdge(0,1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        graph.TraverseBFS(1);
    }
}
