import java.lang.reflect.Array;
import java.util.*;
import java.util.LinkedList;
public class Graph2 {
    


//CYCLE DETECTION
// static class Edge{
//     int src;
//     int dest;

//     public Edge(int s,int d) {
//         this.src = s;
//         this.dest = d;
//     }
// }

//     static void createGraph(ArrayList<Edge> graph[]){
//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0,1));
//         graph[0].add(new Edge(0,2));
//         graph[0].add(new Edge(0,3));

//         graph[1].add(new Edge(1,0));
//         graph[1].add(new Edge(1,2));

//         graph[2].add(new Edge(2,0));
//         graph[2].add(new Edge(2,1));

//         graph[3].add(new Edge(3,0));
//         graph[3].add(new Edge(3,4));

//         graph[4].add(new Edge(4,3));
//     }

//     public static boolean detectCycle(ArrayList<Edge>[] graph){
//         boolean vis[] = new boolean[graph.length];
//         for(int i=0; i<graph.length; i++){
//             if(!vis[i]){
//                 if(detectCycleUtil(graph,vis,i,-1)){
//                     return true;
//                     // cycle exists in one of the parts
//                 }
//             }
//         }
//         return false;
//     }
//     public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean vis[], int curr,int parent){
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             if(!vis[e.dest] && detectCycleUtil(graph,vis,e.dest,curr)){
//                 return true;
//             }
//             //case1
//             else if(vis[e.dest] && e.dest != parent){
//                 return true;
//             }
//             //case2 -> do nothing -> continue
//         }
//         return false;
//     }

    // public static void main(String[] args) {
    //     /*
    //      *                 0--------------3
    //      *               / |              |
    //      *              /  |              |
    //      *             /   |              |
    //      *            1    |              |
    //      *             \   |              4
    //      *               \ |
    //      *                 2
    //      */


    //     int V = 5;
    //     ArrayList<Edge> graph[] = new ArrayList[V];
    //     createGraph(graph);

    //     System.out.println(detectCycle(graph));


    // }


// ISBIPARTITE graph:    O(V+E)

// static class Edge{
//     int src;
//     int dest;

//     public  Edge(int s, int d){
//         this.src = s;
//         this.dest = d;
//     }
// }


// static void createGraph(ArrayList<Edge>[] graph){

//     for(int i=0; i<graph.length; i++){
//         graph[i] = new ArrayList<>();
//     }

//     graph[0].add(new Edge(0,1));
//     graph[0].add(new Edge(0,2));

//     graph[1].add(new Edge(1,0));
//     graph[1].add(new Edge(1,3));

//     graph[2].add(new Edge(2,0));
//     graph[2].add(new Edge(2,4));

//     graph[3].add(new Edge(3,1));
//     // graph[3].add(new Edge(3,4));

//     graph[4].add(new Edge(4,2));
//     // graph[4].add(new Edge(4,3));

// }

// public static boolean isBipartite(ArrayList<Edge>[] graph){
//     int col[] = new int[graph.length];
//     for(int i=0; i<col.length; i++){
//         col[i] = -1;  // no color
//     }

//         Queue<Integer> q = new LinkedList<>();

//         for(int i=0; i<graph.length; i++){
//             if(col[i] == -1){  //BFS
//                 q.add(i);
//                 col[i] = 0; // yellow
//                 while(!q.isEmpty()){    
//                     int curr = q.remove();
//                     for(int j=0; j<graph[curr].size(); j++){
//                         Edge e = graph[curr].get(j); // e.dest
//                         if(col[e.dest] == -1){
//                             int nextCol = col[curr] == 0 ? 1 : 0;
//                             col[e.dest] = nextCol;
//                             q.add(e.dest);
//                         }else if(col[e.dest] == col[curr]){
//                             return false;  // NOT BIPARTITE
//                         }
//                     }
//                 }
//             }
//         }

//         return true;
// }

//     public static void main(String[] args) {
//         /*
//          *               0------2
//          *              /       /
//          *             /       /
//          *            /       /
//          *           1       4
//          *            \     /
// *                      \   /
//          *               3
//          *              false
//          *      
//          */    
        
//         int V = 5;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         System.out.println(isBipartite(graph));



//     }







    // ISCYCLE GRAPH:
    // static class Edge{
    //     int src;
    //     int dest;
    
    //     public  Edge(int s, int d){
    //         this.src = s;
    //         this.dest = d;
    //     }
    // }
    
    
    // static void createGraph(ArrayList<Edge>[] graph){      // true -> NO CYCLE
    
    //     for(int i=0; i<graph.length; i++){
    //         graph[i] = new ArrayList<>();
    //     }
    
    //     graph[0].add(new Edge(0,2));
    
    //     graph[1].add(new Edge(1,0));
    
    //     graph[2].add(new Edge(2,3));
    
    //     graph[3].add(new Edge(3,0));
    
    
    // }

        // GRAPH -> 2
//     static void createGraph(ArrayList<Edge>[] graph){      // false -> NO CYCLE
    
//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
    
//         graph[0].add(new Edge(0,1));
    
//         graph[0].add(new Edge(1,2));
    
//         graph[1].add(new Edge(2,3));
    
//         graph[2].add(new Edge(2,3));
    
    
//     }

//     public static boolean isCycle(ArrayList<Edge>[] graph){
//         boolean vis[] = new boolean[graph.length];
//         boolean stack[] = new boolean[graph.length];

//         for(int i=0; i<graph.length; i++){
//             if(!vis[i]){
//                 if(isCycleUtil(graph, i, vis, stack)){
//                     return true;
//                 }
//             }

//         }
//         return false;
//     }

//     public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr, boolean vis[], boolean stack[]){
//         vis[curr] = true;
//         stack[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             if(stack[e.dest]){
//                 return true;
//             }
//             if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
//                 return true;
//             }
//         }
//         stack[curr] = false;
//         return false;
//     }
// public static void main(String[] args){
    
//         int V = 4;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         System.out.println(isCycle(graph));
// }




static class Edge{
    int src;
    int dest;

    public Edge(int s, int d){
        this.src = s;
        this.dest = d;
    }
}



static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
    }

    graph[2].add(new Edge(2,3));

    graph[3].add(new Edge(3,1));

    graph[4].add(new Edge(4,0));

    graph[4].add(new Edge(4,1));

    graph[5].add(new Edge(5,0));

    graph[5].add(new Edge(5,2));

}

public static void topSort(ArrayList<Edge> graph[]){
    boolean vis[] = new boolean[graph.length];
    Stack<Integer> s = new Stack<>();

    for(int i=0; i<graph.length; i++){
        if(!vis[i]){
            topSortUtil(graph,i,vis,s);
        }
    }

    while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
    }
}

public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer>s){
    vis[curr] = true;

    for(int i=0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if(!vis[e.dest]){
            topSortUtil(graph, e.dest, vis, s);
        }
    }

    s.push(curr);
}
public static void main(String[] args){
    int V = 6;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);

    topSort(graph);
}





}
