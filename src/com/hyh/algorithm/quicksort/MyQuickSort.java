package com.hyh.algorithm.quicksort;

public class MyQuickSort {
	public static void quicksort(int[] arr) {
		if(arr == null || arr.length <= 1) {
			return;
		}
		quicksort(arr, 0, arr.length);
	}
	private static void quicksort(int[] arr, int low, int high) {
		if(high - low <= 1) {
			return ;
		}
		int partition = partition(arr, low, high);
		quicksort(arr, low, partition);
		quicksort(arr, partition+1, high);
	}
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int left = low;
		int right = high - 1;
		
		while(left < right) {
			while(left < right && arr[right] >= pivot) {
				right--;
			}
			arr[left] = arr[right];
			while(left < right && arr[left] <= pivot ) {
				left++;
			}
			arr[right] = arr[left]; 
		}
		arr[left] = pivot;
		print(arr);
		return left;
	}
	private static void print(int[] arr) {
		if(arr == null) {
			return;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {1,9,7,3,6,5,4,8,2};
		print(arr);
		quicksort(arr);
		print(arr);
	}
}
