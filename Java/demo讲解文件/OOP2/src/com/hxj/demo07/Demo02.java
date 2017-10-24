package com.hxj.demo07;

import java.io.File;
import java.io.IOException;
/**
test
--file1.txt
--haha
----hello
------new.txt
--hi
----old.txt
 * @author hxj
 *
 */
public class Demo02 {

	public static void main(String[] args) throws IOException {
		File file = new File("G:"+File.separator+"test");
		listFile(file,0);
		
		File newFile = new File(file,"hello.txt");
		System.out.println(newFile);
		newFile.createNewFile();
	}
	/**
	 * �Լ������Լ��������ݹ�
	 * �ݹ�����г���
	 * @param file
	 */
	public static void listFile(File file,int number) {
		/*
		 * file�п������ļ�Ҳ�п������ļ���
		 * ������ļ�������ļ���
		 * ������ļ��У��������ļ����ظ����϶�����
		 */
		for(int i = 0;i<number;i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if(file.isFile()) {
			return;
		}
		//���ļ���
		File[] children = file.listFiles();
		if(children==null || children.length==0) {
			return;
		}
		number+=2;
		for(File f:children) {
			listFile(f,number);
		}
		
	}
	
}
