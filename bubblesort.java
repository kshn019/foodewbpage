package Sorting;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int [] arr = new int [num];
		for(int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();
		}
		bubbleSort(arr);
		System.out.println ("Sorted array is:");
		
		for(int var:arr) {
			System.out.print(var +" ");
		}
	}
	public static int [] bubbleSort(int [] arr) {
		
		// n contains the value of elements or length of array
		int n =arr.length;		
		boolean flag = false;
		
		// outer loop i.e no. of journeys
		for(int i = 0 ; i < n; i++) {
			
			int journey = i+1;
			System.out.println("Jouney: "+ journey);
			
			//inner loop i.e no. of passes
			for(int j = 0; j < n - 1; j++) {
				int pass = j+1;
				System.out.println("Pass: "+ pass);
				
				//printing the elements that are being compared
				System.out.println("Comparing " + arr[j] + " and " + arr[j+1]);
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1,flag);
				}
			}
			
			//checking if swapping happened in 1st pass or not
			if (flag == false) {
				return arr;
			}
			//if flag is false that implies no swapping happened and if no swapping happens it means array is already sorted
			System.out.println();
		}
		return arr;
	}
	
	public static void swap(int[] arr, int i , int j, boolean flag) {
		
		//if swapping happens
		flag = true;
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
}
