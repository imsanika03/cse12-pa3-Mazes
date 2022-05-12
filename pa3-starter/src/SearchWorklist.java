/*
 * Class to implement SearchWorklist as a Stack and a Queue.
 * You can use any built-in Java collections for this class.
 */
import java.util.*; 
class StackWorklist implements SearchWorklist {

	Stack<Object> s = new Stack<>();  
	@Override
	public void add(Square c) {
		// TODO Auto-generated method stub
		s.push(c); 
		
	}

	@Override
	public Square remove() {
		// TODO Auto-generated method stub
		return (Square) s.pop(); 
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return s.size() == 0;
	}
	
	
}

class QueueWorklist implements SearchWorklist {
	
	Queue<Square> s = new LinkedList<Square>(); 

	@Override
	public void add(Square c) {
		s.add(c); 
		
	}

	@Override
	public Square remove() {
		// TODO Auto-generated method stub
		return s.remove();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return s.size() == 0;
	}

}

public interface SearchWorklist {
	void add(Square c);
	Square remove();
	boolean isEmpty();
}
