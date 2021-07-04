import java.util.*;
public class SpiralTraverse {

	public SpiralTraverse() {
		// TODO Auto-generated constructor stub
	}
	public static List<Integer> spiralTraverse(int[][] array) {
		    // Write your code here.
			List<Integer> result = new ArrayList<Integer>();
			int startingRow = 0;
			int endRow = array.length - 1;
			int startingColumn = 0;
			int endColumn = array[0].length - 1;
			
			while (startingRow <= endRow && startingColumn <= endColumn) {
				//traverse to the right
				for (int i = startingColumn; i <= endColumn; i++) {
					result.add(array[startingRow][i]);
				}
				//traverse down
				for (int i = startingRow + 1; i <= endRow; i++)
					result.add(array[i][endColumn]);
				//traverse to the left
				for (int i = endColumn - 1; i >= startingColumn; i--) {
					if (startingRow == endRow) break;
					result.add(array[endRow][i]);
				}

				//traverse up
				for (int i = endRow - 1; i >= startingRow + 1; i--) {
					if (startingColumn == endColumn) break;
					result.add(array[i][startingColumn]);
				}
				startingRow++;
				endRow--;
				startingColumn++;
				endColumn--;
			}
			return result;
		  }

	public static void main(String[] args) {
		int[][] e = {
					{1,2,3,4},
					{12,13,14,5},
					{11,16,15,6},
					{10,9,8,7}
							};
		SpiralTraverse a = new SpiralTraverse();
		System.out.print(a.spiralTraverse(e));
		// TODO Auto-generated method stub

	}

}
