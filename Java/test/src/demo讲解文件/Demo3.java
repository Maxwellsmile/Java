package com.hxj.demo;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		/*
		 * ð������:��������滻
		 *  34,45,65,78,1,2
		 *  34,45,65,1,2,78
		 *  34,45,1,2,65,78
		 */
		int[] nums = {34,45,1,15,23,2,3};
		
		//������˴�
		for(int j = 1;j<nums.length;j++) {
			for(int i = 0;i<nums.length-j;i++) {
				if(nums[i]>nums[i+1]) {
					//����λ��
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			}
			System.out.println(Arrays.toString(nums));
		}
		
		
//		System.out.println("---------��һ������-----------");
//		for(int i = 0;i<nums.length-1;i++) {
////			System.out.println(i+"    "+(i+1));
//			if(nums[i]>nums[i+1]) {
//				//����λ��
//				int temp = nums[i];
//				nums[i] = nums[i+1];
//				nums[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(nums));
//		
//		System.out.println("-----------�ڶ�������----------------");
//		for(int i = 0;i<nums.length-2;i++) {
//			if(nums[i]>nums[i+1]) {
//				//����λ��
//				int temp = nums[i];
//				nums[i] = nums[i+1];
//				nums[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(nums));
		
		
		/**
		 * ���飺
		 *   �洢-------����
		 *   ��ɾ�Ĳ�
		 *   
		 * ��ά���飺
		 *     
		 */
		
	}
	
}
