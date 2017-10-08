
public class BubbleSort {
	
	private static void swapNumber(int i, int j, int array[]){
		int temp = 0;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void printList(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	private static void bubblesort(int array[]){
		int n = array.length;
		int k =0;
		for(int m=n;m>=0;m++){
			for(int i=0;i<n-1;i++){
				k=i+1;
				if (array[i]> array[k]){
					swapNumber(i, k, array);
				}
			}
		}
		printList(array);
	}
	public static void main(String[] args) {
		int array[] = {4,23,12,98,32,76};
		bubblesort(array);

	}

}
