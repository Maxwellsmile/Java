package com.hxj.demo07;

import java.io.File;
import java.io.IOException;
/**
 * IO
 *    �ַ���
 *    �ֽ���
 * @author hxj
 *
 */
public class Demo01 {

	public static void main(String[] args) throws IOException {
		//�ļ�  IO
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
////		file.mkdirs();//���  mkdir����
//		System.out.println("�ļ���"+file);
//		//���ļ��ĸ�·���Ƿ���� �õ���·�� �ж��Ƿ����
//		File parentFile = file.getParentFile();
//		System.out.println("���ļ���"+parentFile);
//		if(!parentFile.exists()) {
//			if(parentFile.mkdirs()) {
//				file.createNewFile();
//			}
//		}
		
		/**
		 * ����һ���ļ�ϵͳ��
		 * ���찮����
		 *   ͼƬ
		 *     png
		 *        aa.png
		 *     img
		 *        bb.img
		 *        cc.img
		 *   ����
		 *     mp3
		 *        ������.mp3
		 *     cd
		 *        cd1
		 *          �ҵ��....
		 *        cd2
		 *   �ı�
		 *   
		 * �������֮���������  
		 */
		//�ݹ飺�Լ������Լ�
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
