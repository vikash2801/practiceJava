package Recursion3;
import java.util.*;

public class NQueensProblem {
	public static boolean isSafe(char[][] board, int row, int col) {
		//horizontal check
		for(int r=row,c=0; c<board.length; c++) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//vertical check
		for( int r=0,c=col; r<board.length; r++) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//top-left check
		for( int r=row-1, c=col-1; r>=0 && c>=0; r--, c--) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//top-right check
		for(int r=row-1,c=col+1; r>=0 && c<board.length; r--, c++) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//bottom-left check
		for(int r=row+1,c=col-1; r<board.length && c>=0; r++, c--) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//bottom-right check
		for(int r=row+1, c=col+1; r<board.length && c<board.length; r++, c++) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		return true;
	}
	
	public static void saveBoardSolution(char[][] board, List<List<String>> finalSolution){
		String row="";
		List<String> newBoard = new ArrayList<>();
		for(int i=0; i<board.length; i++) {
			row="";
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j]=='Q') {
					row+="Q";
				}else {
					row+=".";
				}
			}
			newBoard.add(row);
		}
		finalSolution.add(newBoard);
	}
	
	public static void findQueenSolution(char[][] chessBoard, int col, List<List<String>> solution) {
		if(col==chessBoard.length) {
			saveBoardSolution(chessBoard, solution);
			return;
		}
		for(int row = 0; row<chessBoard.length; row++) {
			if(isSafe(chessBoard, row, col)) {
				chessBoard[row][col]= 'Q';
				findQueenSolution(chessBoard, col+1, solution);
				chessBoard[row][col]= '.';
			}
		}
	}
	public static void main(String[] args) {
		int n=4;
		char[][] board = new char[n][n];
		List<List<String>> boardSolution = new ArrayList<>();
		findQueenSolution(board,0,boardSolution);
		
		System.out.println("total possible scenario : "+boardSolution);
		
	}
	
	
}
