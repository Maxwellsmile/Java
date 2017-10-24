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
	 * 自己调用自己，叫做递归
	 * 递归必须有出口
	 * @param file
	 */
	public static void listFile(File file,int number) {
		/*
		 * file有可能是文件也有可能是文件夹
		 * 如果是文件：输出文件名
		 * 如果是文件夹：遍历子文件（重复以上动作）
		 */
		for(int i = 0;i<number;i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if(file.isFile()) {
			return;
		}
		//是文件夹
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
