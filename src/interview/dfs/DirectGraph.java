package interview.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DirectGraph {
    
    int vertice;
    
    Map<Integer, ArrayList<Integer>> adjacents;
    
    public DirectGraph(int v) {
        vertice = v;
        adjacents = new HashMap<Integer, ArrayList<Integer>>(v);
    }
    
    public void addEdge(int v, int w) {
        ArrayList<Integer> edges = adjacents.get(v);
        if (edges != null) {
            edges.add(w);
        } else {
            edges = new ArrayList<Integer>();
            edges.add(w);
            adjacents.put(v, edges);
        }
    }
    
    public void DFS(int v) {
        boolean[] visited = new boolean[vertice];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < vertice; i++) {
            if (!visited[i])
            DFSUtils(i, visited);
        }
        
    }
    
    private void DFSUtils(int v, boolean[] visited) {
        System.out.println(v);
        visited[v] = true;
        for (int w : adjacents.get(v)) {
            if (!visited[w])
                DFSUtils(w, visited);
        }
        
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        DirectGraph g = new DirectGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        System.out.println("Following is Depth First Traversal (starting from vertex 2)");
        g.DFS(2);
     
    }

}
