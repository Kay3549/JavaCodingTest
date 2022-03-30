package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Sudoku {
	
	public static int [][] arr = new int [9][9];

	public static void main(String[] args) {
		  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			for(int i =0; i<9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				for(int j = 0; j<9; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			SudoKu(0, 0);
			
		} catch (Exception e) {
			
		}
		
	}
	
	public static void SudoKu(int row, int col) {
		
		if(col==9) {
			SudoKu(row+1, 0);
			return;
		}
		
		if(row==9) {
			StringBuilder sb = new StringBuilder();
			for(int i =0; i<9; i++) {
				for(int j =0; j<9; j++) {
					sb.append(arr[i][j]+" ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
		
		if(arr[row][col]==0) {//if it's blank
			
			for(int i = 1; i<=9; i++) {//check if 'i'is possible or not
				if(Possibility(row, col, i)) {//if 'i' is possible 
					arr[row][col] = i;
					SudoKu(row, col+1);
				}
			}
			arr[row][col]= 0;
			return;
		}
		
		SudoKu(row, col+1);
		
	}
	
	
	public static boolean Possibility(int row, int col, int value) {
		
		//check if same number with value is exist in row 
		for(int i = 0; i<9; i++) {
			if(arr[row][i]==value) {
				return false;
			}
		}
		
		//check if same number with value is exsit in column
		for(int i =0; i<9; i++) {
			if(arr[i][col]==value) {
				return false;
			}
		}
		
		int setnewrow = 3*(row/3);
		int setnewcol = 3*(col/3);
		
		//0 1 2    3 4 5   6 7 8
		//check if same number with value is in the box area
		for(int i=0; i<9; i++) {
			if(arr[setnewrow+(i/3)][setnewcol+(i%3)]==value){
				return false;
			}
		}
		
		return true;
	}

}
