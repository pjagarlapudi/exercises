package general;
public class Sorting {

	public static void main(String[] args) {
		 int[] arr = { 2, 3, 1, 0, 5, 4, 5, 6 };
		//int[] arr = { 2, 3, 0, 1, 5 };

		int[] res = new Sorting().sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

	// ascending
	public int[] sort(int[] arr) {

		return swapSort(arr);
	}

	public int[] swapSort(int[] arr) {

		int len = arr.length;

		int rightPos = len - 1;
		int leftPos = len - 2;

		int rightVal = arr[rightPos]; // right-most to start with
		int leftVal = arr[leftPos];

		int passes = 0;
		
		while (leftPos >= 0 && rightPos >= 1) {
			//System.out.println("leftpos " + leftPos + " rightPOs " + rightPos);
			// System.out.println("leftVal "+leftVal+ " rightVal "+rightVal);
			passes++; //counting number of comparisons
			if (leftVal > rightVal) {
				swap(arr, leftPos, rightPos);
			}
			// System.out.println("after swap "+arr[0]+""+arr[1]+""+arr[2]+""+arr[3]+""+arr[4]);
			if (leftPos == 0) {
				rightPos--;
				leftPos = rightPos - 1;
			} else if (leftPos > 0) {
				leftPos--;
			}
			if (leftPos == -1 && rightPos == 0) {
				break;
			}
			rightVal = arr[rightPos];
			leftVal = arr[leftPos];
		}

		System.out.println(passes);
		return arr;
	}

	public int[] swap(int[] arr, int left, int right) {

		arr[left] = arr[left] + arr[right];
		arr[right] = arr[left] - arr[right];
		arr[left] = arr[left] - arr[right];

		return arr;
	}

}
