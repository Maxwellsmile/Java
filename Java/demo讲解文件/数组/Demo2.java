package com.hxj.demo;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		
		/**
		 * 数组:
		 *   存储一组相同类型的数据,在内存中分配一块连续的内存空间,长度固定,通过下标存放获取数据
		 *   数组下标 0--length-1
		 *    1、如何声明一个数组
		 *    []
		 */
		
//		int[] nums = {12,23,34,45,56};
//		int[] nums1 = new int[5];
		
		String[] nums = new String[5];
		//添加
		nums[0] = "23";
		nums[1] = "34";
		nums[2] = "45";
		nums[3] = "36";  
		nums[4] = "23";
//		nums[5] = "34";//java.lang.ArrayIndexOutOfBoundsException: 5
		
		System.out.println("数组长度："+nums.length);
		for(int i = 0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		System.out.println("------------------------------------");
		/*
		 * 添加
		 * 删除
		 * 数组长度会产生变化
		 * Arrays 操作数组的一个工具类
		 */
//		String[] newNums = Arrays.copyOf(nums, nums.length+1);
//		/*
//		 * copyOf : 根据新的长度创建了一个新数组，将老数组中的内容copy进去
//		 */
//		System.out.println(newNums.length);
//		newNums[newNums.length-1] = "78";
//		for(int i = 0;i<newNums.length;i++) {
//			System.out.println(newNums[i]);
//		}
		
		String[] newNums = new String[nums.length+1];
		for(int i = 0;i<nums.length;i++){
			newNums[i] = nums[i];
		}
		System.out.println("新数组长度："+newNums.length);
		newNums[newNums.length-1] = "78";
		for(int i = 0;i<newNums.length;i++) {
			System.out.println(newNums[i]);
		}
		
		System.out.println("--------------------------------------------");
		
		//根据下标删除   23   34    45  36           23       78 
		 //                       nums[3]     nums[4]    nums[5]
		//nums[i-1]= nums[i]      nums[i-1]=nums[i]
		int delIndex = 3;
		for(int i = delIndex+1;i<newNums.length;i++) {
			newNums[i-1] = newNums[i];
		}
		newNums = Arrays.copyOf(newNums, newNums.length-1);
		for(int i = 0;i<newNums.length;i++) {
			System.out.println(newNums[i]);
		}
		
		System.out.println("-------------------------------------------------");
		String[] copyNums = Arrays.copyOfRange(newNums, 1, newNums.length-1);
		for(int i = 0;i<copyNums.length;i++) {
			System.out.println(copyNums[i]);
		}
		
		System.out.println("------------------------------------------------");
		Arrays.sort(newNums);
		for(int i = 0;i<newNums.length;i++) {
			System.out.print(newNums[i]+"  ");
		}
		
		String numsStr = Arrays.toString(newNums);
		System.out.println("字符串内容："+numsStr);
		
		
		int[] intNums = {34,45,65,78,1,2};
		System.out.println(Arrays.toString(intNums));
		Arrays.sort(intNums);
		System.out.println(Arrays.toString(intNums));
		
	}
	
}
