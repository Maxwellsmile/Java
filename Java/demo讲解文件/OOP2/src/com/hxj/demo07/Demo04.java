package com.hxj.demo07;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 *�ֽ���
 *   InputStream �ֽ�������
 *   OutputStream �ֽ������
 * @author hxj
 *
 */
public class Demo04 {

	public static void main(String[] args) throws IOException {
//		OutputStream os = new FileOutputStream(new File("hello.txt"));
//		os.write(97);
//		os.write("���".getBytes());
//		os.flush();
//		os.close();
		
		InputStream is = new FileInputStream(new File("hello.txt"));
//		int content = is.read();
//		System.out.println(content);
//		
//		content = is.read();
//		System.out.println(content);
//		
//		content = is.read();
//		System.out.println(content);
//		
//		content = is.read();
//		System.out.println(content);
//		
//		content = is.read();
//		System.out.println(content);
		
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len = is.read(buffer))!=-1) {
			System.out.println(new String(buffer,0,len)+"  "+len);
		}
		is.close();
	}
	
}
