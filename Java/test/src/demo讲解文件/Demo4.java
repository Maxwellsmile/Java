package com.hxj.demo;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		/*
		 * ��ά���飺
		 *    int[][] numss = {};
		 */
		//int[][] numss = {{23,34,45},{1,2},{2}};
		int[][] numss = new int[3][];//{{1,2,4},{2,3,4},{23,3,2}}
		//��һ������������ά����ĳ��ȣ��ڶ�������������ά������һά����ĳ���
		//�ڶ��������ų�ʼ��䣺��ά������һά����ĳ��Ⱦ����ڴ��з���
		//�ڶ��������ų�ʼ����䣺��ά������һά����ĳ��Ⱦ����ڴ��в�����
		
		/*for(int i = 0;i<numss.length;i++) {
			int[] nums = numss[i];
			//System.out.println(Arrays.toString(nums));
			for(int j = 0;j<nums.length;j++) {
				System.out.print(nums[j]+" ");
			}
			System.out.println();
		}*/
		
		//java.lang.NullPointerException ��ָ���쳣  �Ŵ����ҵ�������  �Ų�����Ķ���  .ǰ����ֵ�����
		
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
