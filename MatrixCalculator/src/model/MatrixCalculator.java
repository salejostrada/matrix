package model;

import java.util.ArrayList;
import java.util.Iterator;

public class MatrixCalculator {
	
	private ArrayList<int[][]> numericMatrices;
	private ArrayList<String[][]> stringMatrices;
	
	public MatrixCalculator() {
		numericMatrices= new ArrayList<int[][]>() ;
		stringMatrices= new ArrayList<String[][]>();
		
	}
	
	public String showMatrices() {
		String out="";
		out += "Numeric matrices \n";
		for(int i=0; i< numericMatrices.size(); i++) {
			out+= printNumeric(numericMatrices.get(i));
		}
		out += "String matrices \n";
		for(int i=0; i< stringMatrices.size(); i++) {
			out+= printString(stringMatrices.get(i));
		}
		
		return out;
	}

	private String printString(String[][] matrix) {
		String print ="";
		for (int i = 0 ; i < matrix.length; i ++){
			for (int j = 0 ; j < matrix.length; j ++){
				print += matrix [i][j] + "\t";
			}
			print += "\n";
			}
			return print;
		}

		
	

	private String printNumeric(int[][] numbers) {
		String print ="";
		for (int i=0; i< numbers.length; i++ ) {
			for (int j = 0; j < numbers[0].length; j++) {
				print += numbers[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}

	public String createMatrix(int type, int rows, int columns) {
		String out="";
		switch(type) {
		case 1: //numeric Matrix
			int [][] newMatrix;
			newMatrix= new int[rows][columns];
			newMatrix[0][0] = 1;
			numericMatrices.add(newMatrix);
			out = printNumeric(newMatrix);
			
			break;
		case 2:
		String [][] stringMatrix;
		stringMatrix= new String[rows][columns];
		stringMatrix[0][0] = " " ;
		stringMatrices.add(stringMatrix);
		out = printString(stringMatrix);
		}
		
		return out;
		
	}
	
	public void addMatrix (int [][] matrix){
		numericMatrices.add(matrix);
	}
	
	public String addMatrix (String [][] Matrix){
		String matrices = "";
		for (int i = 0 ; i < numericMatrices.size(); i ++){
			matrices += "Matriz" + (i+1) + "\n";
			matrices += printNumeric(numericMatrices.get(i));
		}
		return matrices ; 
	}

	

}
