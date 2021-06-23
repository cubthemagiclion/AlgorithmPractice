package src;

public class NumberOfIslands {

	public NumberOfIslands() {
		// TODO Auto-generated constructor stub
	}
    public int numIslands(char[][] grid) {
        if(grid.length == 0)
        	return 0;
        int islands = 0;
        for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[i].length; j++) {
        		char value = grid[i][j];
        		//first check if we visited it or if it is zero
        		if( value != '0' && value != '2') {
        			searchIslands(grid, i, j);
        			islands++;
        			//start searching
        		}
        	}
        }
        
        return islands;
    }
    
    public void searchIslands(char[][] grid, int i, int j) {
    	//check if it is valid
    	if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length )
    		return;
		char value = grid[i][j];
		//first check if we visited it or if it is zero
		if( value == '0' || value == '2')
			return;
		grid[i][j] = '2';
    	searchIslands(grid, i + 1, j);
    	searchIslands(grid, i - 1, j);
    	searchIslands(grid, i, j + 1);
    	searchIslands(grid, i, j - 1);
    }

	public static void main(String[] args) {
		char[] grid1 = {'1','1','1','1','0'};
		char[] grid2 = {'1','1','0','1','0'};
		char[] grid3 = {'1','1','0','0','0'};
		char[] grid4 = {'0','0','0','0','0'};
		char[][]total = {grid1, grid2, grid3, grid4};
		NumberOfIslands a = new NumberOfIslands();
		System.out.print(a.numIslands(total));
		// TODO Auto-generated method stub

	}

}
