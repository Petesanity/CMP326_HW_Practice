
public class SearchingSortingArrays {
	/*
	 * runs o(n^2) time
	 * @param arr
	 */
	//helper method
	private static void swap(int [] arr, int indexI, int indexJ){
		int temp = arr[indexI]; //temp matches the array's data type
		arr[indexI] = arr[indexJ];
		arr[indexJ] = temp;
	}
	//selection sort
	public static void selectionSort(int [] arr){
		for(int i = 0; i<arr.length-1; i++){
			int indexOfNextSmallest = i;
			for(int j = i+1; j<arr.length;j++){
				if(arr[indexOfNextSmallest] >arr[j]){
					indexOfNextSmallest = j;
				}
			}
			swap(arr, i,indexOfNextSmallest);
		}
	}
	public static void insertionSort(int [] arr){ //sorts in increasing order
		for(int i = 1; i<arr.length; i++){// go up from 1
			for(int j = i;j>0;j--){ //go down from i to 0
				if(arr[j-1] > arr[j]){
					swap(arr, i,j-1);
				}
			}
		}
	}
	public static void bubbleSortUsingWhile(int [] arr){ //compares adjacent values  
		//one extra loop through in algorithm     
		boolean sorted =  false;
		while(!sorted){
			sorted = true; //set as escape will set for false if we do a swap
			for(int i = 0; i<arr.length-1;i++){
				int j = i + 1;
				if(arr[i] > arr[j]){
					swap(arr,i,j);
					sorted = false; //reenter while after for is done for another traversal(comparing)
				}
			}
		}
	}
	//bubblesort
	public static void bubbleSort(int [] arr){
		for(int i = 0; i<arr.length-1;i++){
			for(int j = i +1; j<arr.length;j++){
				if(arr[i] > arr[j]){
					swap(arr, i,j);
					
				}
			}
		}
	}
	
	/*
	 * @param arr
	 * @param target
	 * return index location of match or -1 if not in the array
	 */
	
	
	
	private  static int numComparisons = 0; //comparisons it takes to find target
	
	public static int linearSearch(int [] arr, int target){
		for(int i = 0; i<arr.length;i++){
			numComparisons++;

			if(arr[i]==target){
				return i;
			}
		}
		return -1; //went through entire loop no match found
	}
	public static int getNumComparisons(){ //getter for comparisons
		return numComparisons;
	}
	public static int binarySearch(int [] arr, int target, int startIndex, int endIndex){
		if(startIndex>endIndex){
			return -1; //target not in array return -1 base case
		}
		//optional else else{
		int mid = (startIndex + endIndex)/2; //calculate midpoint, n.b. integer division
		if(target== arr[mid]){
			return mid;// mid index //base case
		}
		else if(target>arr[mid]){
			return binarySearch(arr, target, mid+1, endIndex); //look right recursively , n.b. startIndex will become mid
		}
		else{
			return binarySearch(arr,target, startIndex, mid-1); //look left recursively
		}
		
	}
	// recursive method  MergeSort  0(nlogn)
	
	public static void mergeSort(int [] arr){
		if(arr.length>1){
			int halfLength = arr.length /2;
			int [] leftArray = new int [halfLength];
			int [] rightArray = new int [arr.length-halfLength]; //because of odd number of values
			divide(arr,leftArray, rightArray); //splits and populates to smaller arrays
			mergeSort(leftArray);
			mergeSort(rightArray);
			merge(arr,leftArray,rightArray); //compares and copies back into big array
			
			
		}
	}
	private static void divide(int[] arr, int[] leftArray, int[] rightArray) {
		for(int i =0;i<leftArray.length;i++){
			leftArray[i] = arr[i];
		}
		for(int i = 0; i<rightArray.length;i++){
			rightArray[i]= arr[leftArray.length + i];
		}
	}
	private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
		int leftI = 0;
		int rightI = 0;
		int bigI = 0;
		while((leftI < leftArray.length) && (rightI < rightArray.length)){
			if(leftArray[leftI] < rightArray[rightI]){ //left is smaller than right
				arr[bigI] = leftArray[leftI];//copy from left into big
				leftI++;
			}
			else{
				arr[bigI] = rightArray[rightI]; //copy from right into big
				rightI++;
			}
			bigI++;
		}	
		while(leftI < leftArray.length){
			arr[bigI] = leftArray[leftI]; //copy from left into big
			leftI++;
			bigI++;
		}
		while(leftI < rightArray.length){
			arr[bigI] = leftArray[leftI]; //copy from left into big
			rightI++;
			bigI++;
		}
		
	}
	
	
	

}
