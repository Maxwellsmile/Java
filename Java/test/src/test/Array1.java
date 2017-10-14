package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		
		
//		1>歌手打分：要求：在歌唱比赛中，共有10位评委进行打分，
//		在计算歌手得分时，去掉一个最高分，去掉一个最低分，
//		然后剩余的8位评委的分数进行平均，就是该选手的最终得分。
//		输入10位评委的评分，求该选手的得分。
//		
//		double[] nums = {7.5,8.3,8.4,8.6,8.1,9.0,9.2,9.4};
//		Arrays.sort(nums);
//			System.out.println(Arrays.toString(nums));
//		double[] score = Arrays.copyOfRange(nums, 1, nums.length-1);
//			System.out.println(Arrays.toString(score));
//		double mark =0.0;
//		for(int i=0;i<score.length;i++) {
//			mark += score[i];
//		}
//			System.out.println(mark);
//		float qwe = (float)(mark/score.length);
//			System.out.println(qwe);
		
		
		
		
//		2>采用数组求斐波那契数列前10个数的和。
//			a)斐波那契数列：
//			b)就是从第三项起，它的值是前两项的和，以此类推；
//			c)样本：1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 …
//		
//		int[] arr=new int[10];
//		arr[0]=arr[1]=1;
//		int sum=0;
//		for(int i=2;i<arr.length;i++) {
//			arr[i]=arr[i-1]+arr[i-2];
//		}
//			System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];		
//		}
//			System.out.println(sum);
		
		
		
		
//		3> 将a、b两个数组中不同的数字保存到一个新的数组中。
//		        如：int[]   a={10,20,30,40,50}   int[]   b={10,20,60}   
//		        得到：int[] c={30,40,50,60}
//		
//		第一个:
//		int[] a= {10,20,30,40,50};
//		int[] b={10,20,60};
//		int[] c=new int[a.length + b.length];
//		System.arraycopy(a,0,c,0,a.length);
//		System.arraycopy(b,0,c,a.length,b.length);
//		
//			System.out.println(Arrays.toString(c));
//		
//		Integer[] d = {10, 20, 30, 40, 50, 10, 20, 60};
//        boolean isDuplicated = false;
//        for(int i = 0; i<d.length; i++){
//            isDuplicated = false;
//            for(int j =i + 1; j<d.length;j++ ){
//                if(d[j] == d[i]){
//                    isDuplicated = true;
//                    d[j] = null;
//                }
//            }
//            if(isDuplicated){
//                d[i] = null;
//            }
//        }
//			System.out.println(Arrays.toString(d));
//		int[] f = new int[4];
//		for(int q=0;q<f.length;q++) {
//			for(int k=0;k<d.length;k++) {
//				if(d[k]!=null) {
//					f[0] = d[2];
//					f[1] = d[3];
//					f[2] = d[4];
//					f[3] = d[7];
//				}
//			}
//		}
//		System.out.println(Arrays.toString(f));
		
		
		
		
//		第二个:
//		int[]a={10,20,30,40,50};   
//		int[]b={10,20,60};
//		
//		int[] c=new int[4];
//		int x=0;
//		//将a种不同的数字与b比较
//		for(int i=0;i<a.length;i++) {
//			boolean flag=false;
//			for(int j=0;j<b.length;j++) {
//				if(a[i]==b[j]) {
//					flag=true;
//					break;
//				}
//			}
//			if(!flag) {
//				boolean flag2=false;
//				for(int k=0;k<x;k++) {
//					if(a[i]==c[k]) {
//						flag2=true;
//						break;
//					}
//				}
//				if(!flag2) {
//					c[x]=a[i];
//					x++;
//				}
//				
//			}
//		}
//		//将b种不同的数字与a比较
//		for(int i=0;i<b.length;i++) {
//			boolean flag=false;
//			for(int j=0;j<a.length;j++) {
//				if(b[i]==a[j]) {
//					flag=true;
//					break;
//				}
//			}
//			if(!flag) {
//				boolean flag2=false;
//				for(int k=0;k<x;k++) {
//					if(b[i]==c[k]) {
//						flag2=true;
//						break;
//					}
//				}
//				if(!flag2) {
//					c[x]=b[i];
//					x++;
//				}
//				
//			}
//		}
//		System.out.println(Arrays.toString(c));
		
		
		
		
//		4>判断数组是否对称，例如int[] nums = {1,2,3,2,1};或int[] nums = {1,2,3,3,2,1}
//		
//		
//		int[] nums = {1,2,3,2,1};
//		Arrays.sort(nums);
//		if(nums.length%2==0) {
//			for(int i=0;i<nums.length;i+=2) {
//				if(nums[i]!=nums[i+1]) {
//					System.out.println("该数组不是对称数组");
//				}else {
//					System.out.println("该数组是对称数组");
//				}
//			}
//		}else {
//			for(int i=0;i<nums.length-1;i+=2) {
//				if(nums[i]!=nums[i+1]) {
//					System.out.println("该数组不是对称数组");
//				}else {
//					System.out.println("该数组是对称数组");
//				}
//			}
//		}
	
		
		
		
//		5>统计一个数组中每个数字出现的个数，例如 int[] nums = {1,2,3,1,1,4,5,3};
//		这个数组中，1出现了3次，2出现了1次，3出现了2次，4出现了1次，5出现了一次.
//		
//		
//		int[] nums = {1,2,3,1,1,4,5,3};
////        总循环的次数
//		for(int i=0;i<nums.length;i++) {
////		默认没有重复的值
//			boolean flag = false;
////		将循环的数字之前的数字进行比对，若有重复则flag变为true；
//			for(int k=0;k<i;k++) {
//				if(nums[i]==nums[k]) {
//					flag = true;
//					break;
//				}
//			}		
//			if(!flag) {
//				int tmp=0;
//				for(int j=0;j<nums.length;j++) {
//					if(nums[i]==nums[j]) {
//						tmp++;
//					}			
//				}
//				System.out.println(nums[i]+"出现了"+tmp+"次");
//			}	
//		}
		
		
		
//		6>拆分一个数字，将其每一位上的数字按顺序放入一个同等长度的数组中，
//		例如：int i = 45276327;  转化为  int nums = {4,5,2,7,6,3,2,7};
//		
//		int i = 45276327;
//		int [] nums=new int[8];
//		nums[7]=i%10;
//		nums[6]=i%100/10;
//		nums[5]=i%1000/100;
//		nums[4]=i%10000/1000;
//		nums[3]=i%100000/10000;
//		nums[2]=i%1000000/100000;
//		nums[1]=i%10000000/1000000;
//		nums[0]=i%100000000/10000000;
//		System.out.println(Arrays.toString(nums));
		
		
	}	
}

