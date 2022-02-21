package git;

public class Testing {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers. 
		
				int [][] x = {
						{10,21,40,15}
						
				};
				int sum = 0; 
				for (int i=0; i<x.length; i++) {
					for (int j=0; j<x[i].length; j++) {
						sum+=x[i][j];
					}
					System.out.println(sum);
					sum=0;
	}

	}}
