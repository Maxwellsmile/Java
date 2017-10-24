package com.hxj.demo;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		/*
		 * 冒泡排序:大的往后面换
		 *  34,45,65,78,1,2
		 *  34,45,65,1,2,78
		 *  34,45,1,2,65,78
		 */
		int[] nums = {34,45,1,15,23,2,3};
		
		//总排序此处
		for(int j = 1;j<nums.length;j++) {
			for(int i = 0;i<nums.length-j;i++) {
				if(nums[i]>nums[i+1]) {
					//互换位置
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			}
			System.out.println(Arrays.toString(nums));
		}
		
		
//		System.out.println("---------第一轮排序-----------");
//		for(int i = 0;i<nums.length-1;i++) {
////			System.out.println(i+"    "+(i+1));
//			if(nums[i]>nums[i+1]) {
//				//互换位置
//				int temp = nums[i];
//				nums[i] = nums[i+1];
//				nums[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(nums));
//		
//		System.out.println("-----------第二轮排序----------------");
//		for(int i = 0;i<nums.length-2;i++) {
//			if(nums[i]>nums[i+1]) {
//				//互换位置
//				int temp = nums[i];
//				nums[i] = nums[i+1];
//				nums[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(nums));
		
		
		/**
		 * 数组：
		 *   存储-------容器
		 *   增删改查
		 *   
		 * 二维数组：
		 *     
		 */
		
	}
	
}
