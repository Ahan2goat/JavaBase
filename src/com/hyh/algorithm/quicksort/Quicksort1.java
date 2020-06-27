package com.hyh.algorithm.quicksort;

/**
 * 快速排序实现1
 * @author HuangYuhan
 *	1、 找出一个数作为基准数
 *	2、 利用partition方法分区，比基准树小的在前面，比基准数大的在后面，分区结束后基准树位于中间位置
 *	3、 递归排序
 */
public class Quicksort1 {
	//调用
	public static void quicksort(int[] arr) {
		if(arr == null || arr.length <= 1)
			return;
		quicksort(arr, 0, arr.length);
	}
	
	private static void quicksort(int[] arr, int low, int high) {
		if(high - low <= 1)
			return;
		//分区
		int partition = partition(arr, low, high);
		
		// 递归调用
		quicksort(arr, low, partition);
		quicksort(arr, partition+1, high);
	}
	private static int partition(int[] arr, int low, int high) {
		int temp = arr[low];//将第一个数作为基准数
		int left = low;		//左指针指向最左侧
		int right = high-1;	//右指针指向最右侧
		
		while(left < right) {
			//如果右指针大于基准数, 则左移
			while(left < right && arr[right] >= temp) {
				right--;
			}
			arr[left] = arr[right];
			while(left < right && arr[left] <= temp) {
				left++;
			}
			arr[right] = arr[left];
		}//这里while循环结束，即当left右移和right左移后，已经重叠
		arr[left] = temp; //把基准值放在left中
		print(arr);
		return left;
	}
	private static void print(int[] arr) {
		if(arr == null)
			return;
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {6,9,1,4,3,2,7,0,8,5};
		print(arr);
		quicksort(arr);
		print(arr);
	}
}
