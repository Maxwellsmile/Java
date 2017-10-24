package com.hxj.demo07;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/**
 * IO
 * I input ���� ��       ���磺�ڴ�<---Ӳ��
 * O output ��� д    ���磺�ڴ�---->Ӳ��
 * 	
 * ���ࣺ����   
 *    ��������:�ֽ���(byte)    
 *    
 *    �ַ���(char)
 *    
 *    
 *  С˵�Ķ�����
 *     �鿴һ��С˵�б�
 *     ѡȡһ��С˵����
 *     �ϴ�һ��С˵  
 *     ����һ��С˵
 * 
 * @author hxj
 *
 */
public class Demo03 {

	
	public static void main(String[] args) throws IOException {
		/*
		 * ��θ��ļ���д���ַ�
		 * �ַ������
		 * �ַ���������ܸ��� --- Writer
		 */
//		Writer  w = new FileWriter(new File("G:"+File.separator+"hah.txt"),true);
//		//д��
//		w.write(97);
//		w.write("�Ұ��й�");
//		w.write("abcdefg", 1, 3);
//		w.flush();
//		w.close();
		
		/*
		 * �ַ��������ܸ���----->Reader
		 */
		Reader r = new FileReader(new File("G:"+File.separator+"hah.txt"));
		/*
		 * Reads a single character. 
		 * ÿ�ζ�ȡ�����ַ�
		 */
		/*int content = 0;
		while((content = r.read())!=-1) {
			System.out.println((char)content);
		}*/
		/*
		 * ����һ��������
		 * Reads characters into an array.
		 */
		char[] buffer = new char[3];
		int number = 0;
		while((number=r.read(buffer))!=-1) {
			System.out.println(new String(buffer, 0, number));
		}
		
		
		
		
//		number = r.read(buffer);
//		//System.out.println(Arrays.toString(buffer)+"  "+number);
//		System.out.println(new String(buffer, 0, number));
//		number = r.read(buffer);
//		//System.out.println(Arrays.toString(buffer)+"  "+number);
//		System.out.println(new String(buffer, 0, number));
//		number = r.read(buffer);
//		//System.out.println(Arrays.toString(buffer)+"  "+number);
//		System.out.println(number);
		r.close();
	}
	
}
