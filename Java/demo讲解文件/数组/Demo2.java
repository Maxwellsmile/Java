package com.hxj.demo;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		
		/**
		 * ����:
		 *   �洢һ����ͬ���͵�����,���ڴ��з���һ���������ڴ�ռ�,���ȹ̶�,ͨ���±��Ż�ȡ����
		 *   �����±� 0--length-1
		 *    1���������һ������
		 *    []
		 */
		
//		int[] nums = {12,23,34,45,56};
//		int[] nums1 = new int[5];
		
		String[] nums = new String[5];
		//���
		nums[0] = "23";
		nums[1] = "34";
		nums[2] = "45";
		nums[3] = "36";  
		nums[4] = "23";
//		nums[5] = "34";//java.lang.ArrayIndexOutOfBoundsException: 5
		
		System.out.println("���鳤�ȣ�"+nums.length);
		for(int i = 0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		System.out.println("------------------------------------");
		/*
		 * ���
		 * ɾ��
		 * ���鳤�Ȼ�����仯
		 * Arrays ���������һ��������
		 */
//		String[] newNums = Arrays.copyOf(nums, nums.length+1);
//		/*
//		 * copyOf : �����µĳ��ȴ�����һ�������飬���������е�����copy��ȥ
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
		System.out.println("�����鳤�ȣ�"+newNums.length);
		newNums[newNums.length-1] = "78";
		for(int i = 0;i<newNums.length;i++) {
			System.out.println(newNums[i]);
		}
		
		System.out.println("--------------------------------------------");
		
		//�����±�ɾ��   23   34    45  36           23       78 
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
		System.out.println("�ַ������ݣ�"+numsStr);
		
		
		int[] intNums = {34,45,65,78,1,2};
		System.out.println(Arrays.toString(intNums));
		Arrays.sort(intNums);
		System.out.println(Arrays.toString(intNums));
		
	}
	
}
