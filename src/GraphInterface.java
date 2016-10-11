import java.util.ArrayList;

public interface GraphInterface {
	
	//Returns the weight of the arc (x,y)
	public int weight(VertexInterface x, VertexInterface y);
	
	//Return list of vertices in the graph
	public ArrayList<VertexInterface> getVertices(); 
	
	//Returns number of vertices
	public int size();

}
