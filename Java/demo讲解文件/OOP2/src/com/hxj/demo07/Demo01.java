package com.hxj.demo07;

import java.io.File;
import java.io.IOException;
/**
 * IO
 *    字符流
 *    字节流
 * @author hxj
 *
 */
public class Demo01 {

	public static void main(String[] args) throws IOException {
		//文件  IO
//		File file = new File("G:"+File.separator+"test"+File.separator+"file1.txt");
//		System.out.println(file);
//		System.out.println(file.exists());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//		System.out.println(file.getName());
//		System.out.println(file.getPath());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getParent());
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.isHidden());
		
//		file = new File("G:"+File.separator+"test"+File.separator+"hi"+File.separator+"old.txt");
////		file.mkdirs();//多层  mkdir单层
//		System.out.println("文件："+file);
//		//该文件的父路径是否存在 得到父路径 判断是否存在
//		File parentFile = file.getParentFile();
//		System.out.println("父文件："+parentFile);
//		if(!parentFile.exists()) {
//			if(parentFile.mkdirs()) {
//				file.createNewFile();
//			}
//		}
		
		/**
		 * 创建一个文件系统：
		 * 天天爱消除
		 *   图片
		 *     png
		 *        aa.png
		 *     img
		 *        bb.img
		 *        cc.img
		 *   音乐
		 *     mp3
		 *        交响乐.mp3
		 *     cd
		 *        cd1
		 *          我的最爱....
		 *        cd2
		 *   文本
		 *   
		 * 创建完毕之后遍历出来  
		 */
		//递归：自己调用自己
		File file = new File("G:"+File.separator);
		String[] children = file.list();
		for(String child:children) {
			System.out.println(child);
		}
		
		/*File[] childrenFiles = file.listFiles();
		for(File child:childrenFiles) {
			System.out.println(child.getName());
		}*/
	}
	
}
