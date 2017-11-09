package com.itcast.day13;

public class ArrayDemo {

	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 24, 69, 80, 57, 13 };
		
		// 冒泡排序
		bubbleSort(arr);
		// 遍历数组
		printArray(arr);

	}

	// 遍历数组
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}

	// 排序
	public static void bubbleSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}

}
