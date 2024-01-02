import java.lang.reflect.Array;
import java.util.*;
import java.util.LinkedList;
public class Graph3 {
    


// TOPOLOGICAL SORTING  USING BFS CODE(KHAN'S ALGORITHM)

// static class Edge{
//     int src;
//     int dest;

//     public Edge(int s, int d){
//         this.src = s;
//         this.dest = d;
//     }
// }

// static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//         graph[i] = new ArrayList<>();
//     }
//     graph[2].add(new Edge(2,3));

//     graph[3].add(new Edge(3,1));

//     graph[4].add(new Edge(4,0));
//     graph[4].add(new Edge(4,1));

//     graph[5].add(new Edge(5,0));
//     graph[5].add(new Edge(5,2));
// }

// public static void calcIndeg(ArrayList<Edge>graph[],int indeg[]){
//     for(int i=0; i<graph.length; i++){
//         int v = i;
//         for(int j=0; j<graph[v].size(); j++){
//             Edge e = graph[v].get(j);
//             indeg[e.dest]++;
//         }
//     }
// }
// public static void topSort(ArrayList<Edge> graph[]){
//     int indeg[] = new int[graph.length];
//     calcIndeg(graph, indeg);
//     Queue<Integer> q = new LinkedList<Integer>();

//     for(int i=0; i<indeg.length; i++){
//         if(indeg[i] == 0){
//             q.add(i);
//         }
//     }

//     //bfs
//     while(!q.isEmpty()){
//         int curr = q.remove();
//         System.out.print(curr+" ");

//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             indeg[e.dest]--;
//             if(indeg[e.dest] == 0){
//                 q.add(e.dest);
//             }
//         }
//     }
//     System.out.println();
// }


// public static void main(String[] args){
//     int V = 6;
//     ArrayList<Edge> graph[] = new ArrayList[V];
//     createGraph(graph);

//     topSort(graph);

    
// }



// QS: All PATH FROM SRC TO DEST:

// static class Edge{
//     int src;
//     int dest;

//     public Edge(int s, int d){
//         this.src = s;
//         this.dest = d;
//     }
// }

// public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0; i<graph.length; i++){
//         graph[i] = new ArrayList<>();
//     }

//     graph[0].add(new Edge(0,3));
    
//     graph[2].add(new Edge(2,3));

//     graph[3].add(new Edge(3,1));

//     graph[4].add(new Edge(4,0));
//     graph[4].add(new Edge(4,1));

//     graph[5].add(new Edge(5,0));
//     graph[5].add(new Edge(5,2));


// }

// public  static void printAllPath(ArrayList<Edge>graph[],int src , int dest,String path){
//     if(src == dest){
//         System.out.println(path+dest);
//         return;
//     }

//     for(int i=0; i<graph[src].size(); i++){
//         Edge e = graph[src].get(i);
//         printAllPath(graph, e.dest, dest, path+src);
//     }
// }


// public static void main(String[] args){
//     int V = 6;
//     ArrayList<Edge> graph[] = new ArrayList[V];
//     createGraph(graph);

//     int src = 5, dest = 1;
//     printAllPath(graph, src, dest, " ");
// }








// QS: DIJKSTRA ALGORITHM V+ELOG V 

static class Edge{
    int src;
    int dest;
    int wt;

    public Edge(int s, int d,int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}

public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
    }

    graph[0].add(new Edge(0,1,2));
    graph[0].add(new Edge(0,2,4));

    graph[1].add(new Edge(1,3,7));
    graph[1].add(new Edge(1,2,1));


    graph[2].add(new Edge(2,4,3));

    graph[3].add(new Edge(3,5,1));

    graph[4].add(new Edge(4,3,2));
    graph[4].add(new Edge(4,5,5));
}


static class pair implements Comparable<pair>{
    int n;
    int path;

    public pair(int n, int path) {
        this.n = n;
        this.path = path;
    }
    @Override
    public int compareTo(pair p2){
        return this.path - p2.path;
    }
}

public static void dijkstra(ArrayList<Edge> graph[],int src){
    int dist[] = new int[graph.length];
    for(int i=0; i<graph.length; i++){
        if(i != src){
            dist[i] = Integer.MAX_VALUE; // +infinity
        }
    }

        boolean vis[] = new boolean[graph.length];
    PriorityQueue<pair> pq = new PriorityQueue<>();
    pq.add(new pair(src,0));
    //loop
    while(!pq.isEmpty()){
        pair curr = pq.remove();
        if(!vis[curr.n]){
            vis[curr.n] = true;
            for(int i=0; i<graph[curr.n].size(); i++){
                Edge e =graph[curr.n].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(dist[u]+wt < dist[v]){
                    dist[v] = dist[u] + wt;
                    pq.add(new pair(v, dist[v]));
                }
            }
        }
    }
    for(int i=0; i<dist.length; i++){
        System.out.print(dist[i]+" ");
    }
    System.out.println();
}



public static void main(String[] args){
    int V = 6;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);

    int src = 0;
    dijkstra(graph, src);
}
































}
