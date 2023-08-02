package GraphConcept;
import java.util.*;

public class DFS{
	
	static class Edge{
		int src;
		int dest;
		
		public Edge(int start, int end){
			src = start;
			dest = end;
		}
	}
	public static void createGraph(ArrayList<Edge> graph[]) {
		
		
		for(int i=0; i<graph.length; i++) { 
		  graph[i] = new ArrayList<>(); 
		}
		 
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,4));
		
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,5));
		
		graph[4].add(new Edge(4,2));
		graph[4].add(new Edge(4,3));
		graph[4].add(new Edge(4,5));
		
		graph[5].add(new Edge(5,3));
		graph[5].add(new Edge(5,4));
		graph[5].add(new Edge(5,6));
		
		graph[6].add(new Edge(6,5));
		
		
	}
		
	public static void dfs(ArrayList<Edge> graph[],int start, boolean vis[]) {
		if(vis[start]==true) {
			return;
		}
		System.out.print(start + " ");
		vis[start] = true;
		
		for(int i=0; i<graph[start].size(); i++) {
			Edge e = graph[start].get(i);
			if(vis[e.dest] == false) {
				dfs(graph,e.dest,vis);
			}
		}
	}
	
	
	public static void main(String args[]) {
		int V = 7;
		ArrayList<Edge> graph[] = new ArrayList[V];
		
		createGraph(graph);
		boolean visited[] = new boolean[V];
		//DFS search
		dfs(graph,0,visited);
		
	}
}
