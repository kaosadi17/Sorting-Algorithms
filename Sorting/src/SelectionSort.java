
public class SelectionSort {
	
	public static int[] selection(int[] arr){
		
		for(int i=0;i<arr.length-1;i++){
			int index = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[index]){
					index = j;
				}
			}
			int small = arr[index];
			arr[index] = arr[i];
			arr[i] = small;
		}
		
		return arr;
		
		
	}
	
	public static void main(String args[]){
		int[] arr1 = {4,23,12,98,32,76};
		int[] arr2 = selection(arr1);
		for(int k:arr2){
			System.out.println(k);
		}
	}
	

}
