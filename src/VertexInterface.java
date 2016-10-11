import java.util.ArrayList;

public interface VertexInterface {
	
	//Vertex is identified by its index
	public int getIndex(); 
	public int setIndex();
	
	//Returns list of successors
	public ArrayList<VertexInterface> successors();

}
