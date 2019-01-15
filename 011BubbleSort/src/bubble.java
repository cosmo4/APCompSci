import java.util.ArrayList;

public class bubble {

	public static void main(String[] args) {
		int[] list = {5,8,1,6,9,2};
		//for (int i = 0; i<list.length - 1; i++) {
			//System.out.println(list[i]);
		//}
		list = bubbleSort(list);
		//System.out.println("");
		for (int i = 0; i<list.length - 1; i++) {
			System.out.println(list[i]);
			
		}
		System.out.println("\n");
		list = insertionSort(list);
		for (int i = 0; i<list.length - 1; i++) {
			System.out.println(list[i]);
			
		}
		
	}//EOM
		private static int[] bubbleSort(int[] list) {
			int i,j,temp = 0;
			for (i = 0; i <list.length -1; i++) {
				for (j = 0; j < list.length -1 -i; j++) {
					if (list[j] < list[j + 1]) {
						temp = list[j];
						list[j] = list[j +1];
						list[j + 1] = temp;
					}
				}
			}
			
			
			
			return list;
		}
		
		public void mergeSort(int[] list, int lowIndex, int highIndex) {
			if (lowIndex == highIndex)
				return;
			else {
				int midIndex = (lowIndex +highIndex) / 2;
				mergeSort(list, lowIndex, midIndex);
				mergeSort(list, midIndex + 1, highIndex);
				merge(list, lowIndex, midIndex + 1, highIndex);
			}
		}
		
		private void merge(int[] list, int lowIndex, int i, int highIndex) {
			return;
			
		}
		//insertion sort for bubble sort
		private static int[] insertionSort(int[] list) {
			int i,j,temp,key;
			for (i = 1; i < list.length; i++) {
				key = list[i];
				j = i - 1;
				while (j >= 0 && key < list[j]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					j--;
				}
			}
			return list;
		}//insertion sort for ArrayList
		public ArrayList<Integer>insertionSort(ArrayList<Integer>list) {
			int i,j,key,temp;
			for (i = 1; i < list.size(); i++) {
				key = list.get(i);
				j = i - 1;
				while (j >= 0 && key < list.get(j)) {
					temp = list.get(j);
					list.set(j,  list.get(j + 1));
					list.set(j + 1, temp);
					j--;
					
				}
			}
			return list;
		}//EOAL

	}//EOC


