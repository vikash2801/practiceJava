package GraphConcept;
import java.util.*;

public class BFS {
	
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
		
		public static void bfs(ArrayList<Edge> graph[], int start, boolean vis[]) {
			
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(start);
			
			while(!q.isEmpty()) {
				int curr = q.remove();
						
				if(vis[curr] == false) {;
					System.out.print(curr + " ");
					vis[curr] = true;
					
					//adding neighbours to queue
					for(int i=0; i<graph[curr].size(); i++) {
						Edge e = graph[curr].get(i);
							if(vis[e.dest] == false) {
								q.add(e.dest);
							}			
					}
				}
			}
		}
		
		
		
		public static void main(String args[]) {
			int V = 7;
			ArrayList<Edge> graph[] = new ArrayList[V];
			
			createGraph(graph);
						
			//boolean array to check whether vertex processed or not			
			  boolean visited[] = new boolean[V];
			 //BFS search 
			  for(int i=0; i<V; i++) { 
			  	if(visited[i] == false) { 
			  		bfs(graph,i,visited); 
			  	} 
			 }
			 
			
		}
}
