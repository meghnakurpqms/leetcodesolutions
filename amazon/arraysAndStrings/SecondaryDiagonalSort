
/*
 *
 	Program to sort a matrix along the secondary diagonal in descending order.
	Sort from top right to bottom left in descending order
*
*/

package abc;
import java.util.*;
class SecondaryDiagonalSort {
    public static int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<Integer, PriorityQueue<Integer>>();
		int n = mat.length;
		int m = mat[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int diagonal = i + j;
				PriorityQueue<Integer> pq = null;
				if (map.containsKey(diagonal)) {
					pq = map.get(diagonal);
				} else {
					//pq = new PriorityQueue<Integer>();
                   pq =new PriorityQueue<>((x, y) -> Integer.compare(y, x));
				}
				pq.add(mat[i][j]);
				map.put(diagonal, pq);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
					int diagonal = i + j;
				mat[i][j]=map.get(diagonal).remove();
			}
            
		}
  return mat;      
}
    public static void printIt(int[][] mat)
    {
    	System.out.println();
    	for(int i = 0; i< mat.length;i++)
    	{
    		for(int j = 0; j < mat[0].length;j++)
    		{
    			System.out.print(mat[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    public static void main(String[] args)
    {
    	int[][] mat = {{3,4,5},{4,3,2},{2,4,6},{8,4,9}};
    	System.out.println("Print before");
    	printIt(mat);
    	mat = diagonalSort(mat);
    	System.out.println();
    	System.out.println("Print after");
    	printIt(mat);
    }
}