import java.util.ArrayList;

/* Class to implement a Maze solver */

public abstract class MazeSolver {
	
	
	
	public static Square solve(Maze maze, SearchWorklist wl) {
		wl = new StackWorklist(); 
		Square current = maze.start; 
		wl.add(current);
		
		while(!wl.isEmpty()) {
			current = wl.remove(); 
			if (current.equals(maze.finish)) {
				return current; 
			} else {
				ArrayList<Square> neighbors = new ArrayList<>(); 
				int crow = current.getRow(); 
				int ccol = current.getCol();
				int rbound = maze.contents.length; 
				int cbound = maze.contents[0].length; 
				
				Square left = maze.contents[crow][ccol-1]; //edit code for no negative/out of bounds index
				Square right = maze.contents[crow][ccol+1]; 
				Square up = maze.contents[crow+1][ccol]; 
				Square down = maze.contents[crow-1][ccol]; 
				
				if (crow < rbound) {
					neighbors.add(up); 
					
				}
				
				if (crow > 0) {
					neighbors.add(down); 
					
				}
				
				if (ccol < cbound) {
					neighbors.add(right); 
					
				}
				
				if (ccol > 0) {
					neighbors.add(left); 
					
				}
				
				for (Square e: neighbors) {
					if (!e.getIsWall()) {
						e.isVisited(); 
						e.setPrevious(current);
						wl.add(e);
					}
					
					
				}
				
				
				
			}
		}
		
		return null;
		
		
		
		
	
		
		
		
	
	}

	/* Add any helper methods you want */
}
