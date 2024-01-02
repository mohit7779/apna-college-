import java.util.*;
public class Graph4 {
    


// // BELLMANFORD ALGORITHM:
// static class Edge{
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s, int d, int w){
//         this.src = s;
//         this.dest = d;
//         this.wt = w;
//     }
// }

// public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//         graph[i] = new ArrayList<>();
//     }
    
// graph[0].add(new Edge(0,1,2));
// graph[0].add(new Edge(0,2,4));

// graph[1].add(new Edge(1,2,-4));

// graph[2].add(new Edge(2,3,2));

// graph[3].add(new Edge(3,4,4));

// graph[4].add(new Edge(4,1,-1));

// }

// public static void createGraph2(ArrayList<Edge> graph){
    
// graph.add(new Edge(0,1,2));
// graph.add(new Edge(0,2,4));
// graph.add(new Edge(1,2,-4));
// graph.add(new Edge(2,3,2));
// graph.add(new Edge(3,4,4));
// graph.add(new Edge(4,1,-1));

// }

// public static void bellmanFord(ArrayList<Edge>graph,int src,int V){
//     int dist[] = new int[V];
//     for(int i=0; i<dist.length; i++){
//         if(i != src){
//             dist[i] = Integer.MAX_VALUE;
//         }
//     }
//     for(int i=0; i<V-1; i++){
//         //rdges O(E)
//        for(int j=0; j<graph.size(); j++){
//                 Edge e = graph.get(j);
//                 //u, v , wt
//                 int u = e.src;
//                 int v = e.dest;
//                 int wt = e.wt;

//                 //relaxation
//                 if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
//                     dist[v] = dist[u] = wt;
//                 }
//             }
//         }

    
//     // print
//     for(int i=0; i<dist.length; i++){
//         System.out.print(dist[i]+" ");
//     }
//     System.out.println();

// }

// public static void main(String[] args){
//     int V = 5;
//     // ArrayList<Edge> graph[] = new ArrayList[V];
//     ArrayList<Edge> graph = new ArrayList<Edge>();
//     createGraph2(graph);
//     bellmanFord(graph, 0, V);
// }


// PRIME ALGORITHM:
static class Edge{
    int src;
    int dest;
    int wt;

    public Edge(int s, int d, int w){
        this.dest = d;
        this.src = s;
        this.wt = w;
    }
}

public static void createGraph(ArrayList<Edge>graph[]){
    for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
    }

    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 15));
    graph[0].add(new Edge(0, 3, 30));

    graph[1].add(new Edge(0, 0, 10));
    graph[1].add(new Edge(0, 3, 40));

    graph[2].add(new Edge(0, 0, 15));
    graph[2].add(new Edge(0, 3, 50));

    graph[0].add(new Edge(0, 1, 40));
    graph[0].add(new Edge(0, 2, 50));

}
static class pair implements Comparable<pair>{
    int v;
    int cost;

    public pair(int v, int c) {
        this.cost = c;
        this.v = v;
    }
    @Override
    public int compareTo(pair p2){
        return this.cost - p2.cost;
    }
}

public static void primsMst(ArrayList<Edge> graph[]){
    boolean vis[] = new boolean[graph.length];
    PriorityQueue<pair> pq = new PriorityQueue<>();
    pq.add(new pair(0,0));
    int finalCost = 0;

    while(!pq.isEmpty()){
        pair curr = pq.remove();
        if(!vis[curr.v]){
            vis[curr.v] = true;
            finalCost += curr.cost;

            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                pq.add(new pair(e.dest, e.wt));
            }
        }
    }
    System.out.println("finalCost: " + finalCost);
}

public static void main(String[] args){
    int V = 4;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    primsMst(graph);
}








}
