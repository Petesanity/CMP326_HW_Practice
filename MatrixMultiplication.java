public class MatrixMultiplication{

	public static void main(String [] args){

		int [][] arr = new int[3][3]; // 1st matrix 
		arr [0][0] = 1; 
		arr [0][1] = 2; 
		arr [0][2] = 3; 
		arr [1][0] = 4; 
		arr [1][1] = 5; 
		arr [1][2] = 6; 
		arr [2][0] = 7;
		arr [2][1] = 8; 
		arr [2][2] = 9; 

		int [][] arr1 = new int [3][3]; //2nd matrix
		arr1 [0][0] = 2; 
		arr1 [0][1] = 0; 
		arr1 [0][2] = 4; 
		arr1 [1][0] = 4; 
		arr1 [1][1] = 1; 
		arr1 [1][2] = 6; 
		arr1 [2][0] = 1; 
		arr1 [2][1] = 2; 
		arr1 [2][2] = 7; 

		int[][]arr3 = new int [3][3]; //matrix after multiplying 1st and 2nd matrix

		System.out.println("Matrix Multiplication:  ");
		//logic: multiply each row with the associated column
		for(int i = 0; i<3;i++){ 
			for(int j = 0;j<3;j++){ 
				for(int k = 0; k<3;k++){
					arr3[i][j]+=arr[i][k] * arr1[k][j];
				}				
			}
		}

		//print out the result
		for(int i = 0;i <3;i++){
			for(int j = 0; j<3;j++){
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}


	}
	
}