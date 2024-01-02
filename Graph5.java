import java.util.*;
import java.util.LinkedList;

public class Graph5 {
    

// CHEAPEST FLIGHTS WITHIN K STOPS:

// static class Edge{
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s,int d, int w){
//         this.src = s;
//         this.dest = d;
//         this.wt = w;
//     }
// }

// public static void createGraph(int flights[][],ArrayList<Edge>graph[]){
//     for(int i=0; i<graph.length; i++){
//         graph[i] = new ArrayList<>();

//     }

//     for(int i=0; i<flights.length; i++){
//         int src = flights[i][0];
//         int dest = flights[i][1];
//         int wt = flights[i][2];

//         Edge e = new Edge(src, dest, wt);
//         graph[src].add(e);
//     }
// }

// static class info{
//     int v;
//     int cost;
//     int stops;

//     public info(int v, int c, int s){
//         this.v = v;
//         this.cost = c;
//         this.stops = s;
//     }
// }
// public static int cheapestFlight(int n, int flights[][], int src, int dest, int k){
//     ArrayList<Edge> graph[] = new ArrayList[n];
//     createGraph(flights, graph);

//     int dist[] = new int[n];
//     for(int i=0; i<n; i++){
//         if(i != src){
//             dist[i] = Integer.MAX_VALUE;
//         }
//     }

//     Queue<info> q = new LinkedList<>();
//     q.add(new info(src,0,0));

//     while(!q.isEmpty()) {
//         info curr = q.remove();
//         if(curr.stops > k){
//             break;
//         }

//         for(int i=0; i<graph[curr.v].size(); i++){
//             Edge e = graph[curr.v].get(i);
//             int u = e.src;
//             int v = e.dest;
//             int wt = e.wt;

//             if(curr.cost+wt < dist[v] && curr.stops <= k) {
//                 dist[v] = curr.cost+wt;
//                 q.add(new info(v, dist[v],curr.stops+1));
//             }
//         }
//     }

//     //destination
//     if(dist[dest] == Integer.MAX_VALUE){
//         return -1;
//     }else{
//         return dist[dest];
//     }

// }
// public static void main(String[] args){
//     int n = 4;
//     int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
//     int src = 0, dest = 3, k = 1;

   
// }


// CONNECTING CITIES WITH MIN COST:

// static class Edge implements Comparable<Edge>{
//     int dest;
//     int cost;

//     public Edge(int d, int c){
//         this.dest = d;
//         this.cost = c;
//     }
//     @Override
//     public int compareTo(Edge e2){
//         return this.cost-e2.cost;
//     }
// }


// // prims algorithm:
// public static int connectCities(int cities[][]){
//     PriorityQueue<Edge> pq = new PriorityQueue<>();
//     boolean vis[] = new boolean[cities.length];

//     pq.add(new Edge(0,0));
//     int finalCost = 0;

//     while(!pq.isEmpty()){
//         Edge curr = pq.remove();
//         if(!vis[curr.dest]){
//             vis[curr.dest] = true;
//             finalCost += curr.cost;

//             for(int i=0; i<cities[curr.dest].length; i++){
//                 if(cities[curr.dest][i] != 0){
//                     pq.add(new Edge(i, cities[curr.dest][i]));
//                 }
//             }
//         }
//     }
//     return finalCost;
// }

//  public static void main(String[] args) {
//     int cities[][] = {{0,1,2,3,4},
//                     {1,0,5,0,7},
//                     {2,5,0,0},
//                     {3,0,6,0,0},
//                     {4,7,0,0,0}};

//                     System.out.println(connectCities(cities));
// }




//DISJOINT SET UNION:

// static int n = 7;
// static int par[] = new int[n];
// static int rank[] = new int[n];

// public static void init(){
//     for(int i=0; i<n; i++){
//         par[i] = i;
//     }
// }
// public static int find(int x){
//     if(x == par[x]){
//         return x;
//     }
//     return par[x] =  find(par[x]);
// }

// public static void union(int a,int b){
//     int parA = find(a);
//     int parB = find(b);

//     if(rank[parA] == rank[parB]){
//         par[parB] = parA;
//         rank[parA]++;
//     }else if(rank[parA] < rank[parB]){
//         par[parA] = parB;
//     }else{
//         par[parB] = parA;
//     }
// }


// public static void main(String[] args) {
// init();
// union(1,3);
// System.out.println(find(3));
// union(2,4);
// union(3,6);
// union(1,4);
// System.out.println(find(3));
// System.out.println(find(4));
// union(1, 5);

// }



// KRUSKAL ALGORITHM;
static class Edge implements Comparable<Edge>{
    int src;
    int dest;
    int wt;

    public Edge(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
    }


@Override
public int compareTo(Edge e2){
    return this.wt - e2.wt;
}
}

static void createGraph(ArrayList<Edge>edges){
    edges.add(new Edge(0,1,10));
    edges.add(new Edge(0,2,15));
    edges.add(new Edge(0,3,30));
    edges.add(new Edge(0,3,40));
    edges.add(new Edge(0,3,50));

}

static int n = 4;
static int par[] = new int[n];
static int rank[] = new int[n];

public static void init(){
    for(int i=0; i<n; i++){
        par[i] = i;
    }
}

public static int find(int x){
    if(par[x] == x){
        return x;
    }

    return par[x] = find(par[x]);
}

public static void union(int a, int b){
    int parA = find(a);
    int parB = find(b);

    if(rank[parA] == rank[parB]){
        par[parB] = parA;
        rank[parA]++;
    }else if(rank[parA] < rank[parB]){
        par[parA] = parB;
    }else{
        par[parB] = parA;
    }
}

public static void kruskalMST(ArrayList<Edge>edges, int V){
    init();
    Collections.sort(edges);
    int mstCost = 0;
    int count = 0;
    
    for(int i=0; count<V-1; i++){
        Edge e = edges.get(i);
        //(src,dest ,wt)

        int parA = find(e.src);
        int parB = find(e.dest);
        if(parA != parB){
            union(e.src, e.dest);
            mstCost += e.wt;
            count++;
        }
    }
    System.out.println(mstCost);
}


public static void main(String[] args){
    int V = 4;
    ArrayList<Edge> edges = new ArrayList<Edge>();
    createGraph(edges);
    kruskalMST(edges, V);
}










}
