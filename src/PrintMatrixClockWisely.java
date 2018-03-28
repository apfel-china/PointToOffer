import java.util.ArrayList;

public class PrintMatrixClockWisely {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

	}
	public static ArrayList<Integer> printMatrix(int[][] matrix){
		if(matrix==null)
			return null;
		int rows=matrix.length,columns=matrix[0].length;
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		int start=0,endX=0,endY=0;
		while(rows>(start*2) && columns>(start*2)) {
			endX=columns-1-start;
			endY=rows-1-start;
			for(int i=start;i<=endX;i++) 
				arraylist.add(matrix[start][i]);
			if(start<endY) {
				for(int i=start+1;i<=endY;i++)
					arraylist.add(matrix[i][endX]);
			}
			if(start<endX && start<endY) {
				for(int i=endX-1;i>=start;i--)
					arraylist.add(matrix[endY][i]);
			}
			if(start<endX && start<endY-1) {
				for(int i=endY-1;i>=start+1;i--)
					arraylist.add(matrix[i][start]);
			}
			start++;
		}
		return arraylist;
	}

}
