package com.hxj.demo;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		/*
		 * 二维数组：
		 *    int[][] numss = {};
		 */
		//int[][] numss = {{23,34,45},{1,2},{2}};
		int[][] numss = new int[3][];//{{1,2,4},{2,3,4},{23,3,2}}
		//第一个中括号填充二维数组的长度，第二个中括号填充二维数组中一维数组的长度
		//第二个中括号初始填充：二维数组中一维数组的长度就在内存中分配
		//第二个中括号初始不填充：二维数组中一维数组的长度就在内存中不分配
		
		/*for(int i = 0;i<numss.length;i++) {
			int[] nums = numss[i];
			//System.out.println(Arrays.toString(nums));
			for(int j = 0;j<nums.length;j++) {
				System.out.print(nums[j]+" ");
			}
			System.out.println();
		}*/
		
		//java.lang.NullPointerException 空指针异常  排错：先找到出错行  排查里面的对象  .前面出现的内容
		
		for(int i = 0;i<numss.length;i++) {
			numss[i] = new int[(int)(Math.random()*10+1)];
			for(int j = 0;j<numss[i].length;j++) {
				numss[i][j] = (int)(Math.random()*100);
			}
		}
		
		for(int i = 0;i<numss.length;i++) {
			System.out.println(Arrays.toString(numss[i]));
		}
	}
	
}
