import java.util.ArrayList;

public class Dijkstra {
	
	private final int inf = Integer.MAX_VALUE;
	
	public PreviousInterface dijkstra(GraphInterface g, VertexInterface r, ASetInterface a, PiInterface pi, PreviousInterface previous){
		
		
		a.add(r);
		VertexInterface pivot = r;
		
		pi.setPi(pivot, 0);
		
		ArrayList<VertexInterface> v = g.getVertices();
		
		for(VertexInterface x: v){
			if(!a.isIn(x))
				pi.setPi(x, inf);
		}
		
		int n = g.size();
		
		for(int i=0; i < n; i++){
			for(VertexInterface x: pivot.successors()){
				if(!a.isIn(x)){
					if (pi.getPi(pivot)+g.weight(pivot, x) < pi.getPi(x)){
						pi.setPi(x, pi.getPi(pivot)+g.weight(pivot, x));
						previous.setPrevious(x, pivot);
					}
				}
			}
			int min = inf;
			for(VertexInterface x: v){
				if(!a.isIn(x)){
					if(pi.getPi(x)<min){
						min = pi.getPi(x);
						pivot = x;
					}
				}
					
			}
			a.add(pivot);
			
		}
		
		return previous;
	}

}
