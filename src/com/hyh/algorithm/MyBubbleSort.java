package com.hyh.algorithm;

public class MyBubbleSort {
	public static int[] bubblesort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int temp = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j] ) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {2,85,86,789,76};
		int[] res = bubblesort(arr);
		for (int i : res) {
			System.out.print(i+" ");
		}
	}
}
