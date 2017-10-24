package com.hxj.demo07;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/**
 * IO
 * I input 输入 读       例如：内存<---硬盘
 * O output 输出 写    例如：内存---->硬盘
 * 	
 * 分类：方向   
 *    操作数据:字节流(byte)    
 *    
 *    字符流(char)
 *    
 *    
 *  小说阅读器：
 *     查看一个小说列表
 *     选取一个小说来读
 *     上传一个小说  
 *     下载一个小说
 * 
 * @author hxj
 *
 */
public class Demo03 {

	
	public static void main(String[] args) throws IOException {
		/*
		 * 如何给文件中写入字符
		 * 字符输出流
		 * 字符输出流的总父类 --- Writer
		 */
//		Writer  w = new FileWriter(new File("G:"+File.separator+"hah.txt"),true);
//		//写入
//		w.write(97);
//		w.write("我爱中国");
//		w.write("abcdefg", 1, 3);
//		w.flush();
//		w.close();
		
		/*
		 * 字符输入流总父类----->Reader
		 */
		Reader r = new FileReader(new File("G:"+File.separator+"hah.txt"));
		/*
		 * Reads a single character. 
		 * 每次读取单个字符
		 */
		/*int content = 0;
		while((content = r.read())!=-1) {
			System.out.println((char)content);
		}*/
		/*
		 * 制作一个缓冲区
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
