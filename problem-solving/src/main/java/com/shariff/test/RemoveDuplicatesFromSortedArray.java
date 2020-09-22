package com.shariff.test;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] inputArray = { '0', '0', '1', '1', '2' };
		System.out.println(removeDuplicates(inputArray));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int j = 0;
		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				temp[j++] = nums[i];
			}
		}

		temp[j++] = nums[nums.length - 1];

		for (int i = 0; i < j; i++) {
			nums[i] = temp[i];
		}
		return j;
	}
}
