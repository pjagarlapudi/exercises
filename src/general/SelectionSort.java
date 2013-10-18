package general;

class SelectionSort {
	public static void main(String[] args) {
		// System.out.println("reverse: " + rev("hello"));
		// System.out.println(reverseString("hello"));
		int[] a = { 3, 2, -5, 1, -2, 3, 0, 5 };
		
		for (int i = 0; i < a.length; i++) {
		  swap(a, i, locOfSmallestNum(a, i, a.length-1));				  
		}		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	//from and to inclusive
	public static int locOfSmallestNum(int[] a, int from, int to) {
		int smallest = a[from];
		int swapLoc = from;
		for (int i = from+1; i <= to; i++) {
			if (a[i] < smallest) {				
				smallest = a[i];
				swapLoc = i;
			}
		}
		
		return swapLoc;
	}

	public static int[] swap(int[] arr, int leftPos, int rightPos) {
		if (leftPos == rightPos) {
			return arr;
		}
		arr[leftPos] = arr[leftPos] + arr[rightPos];
		arr[rightPos] = arr[leftPos] - arr[rightPos];
		arr[leftPos] = arr[leftPos] - arr[rightPos];
		return arr;
	}
	
	

}
