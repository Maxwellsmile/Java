package OOP3;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		
		
//		File file1=new File("E:"+File.separator+"���찮����"+File.separator+"ͼƬ"+File.separator+"png"+File.separator+"aa.png");
//		file1.getParentFile().mkdirs();
//		file1.createNewFile();	
//		File file2=new File("E:"+File.separator+"���찮����"+File.separator+"����"+File.separator+"mp3"+File.separator+"������.mp3");
//		file2.getParentFile().mkdirs();
//		file2.createNewFile();
//		File file3=new File("E:"+File.separator+"���찮����"+File.separator+"����"+File.separator+"cd"+File.separator+"cd1"+File.separator+"�ҵ��");
//		file3.getParentFile().mkdirs();
//		File file4=new File("E:"+File.separator+"���찮����"+File.separator+"����"+File.separator+"cd"+File.separator+"cd2");
//		file4.getParentFile().mkdir();
//		File file5=new File("E:"+File.separator+"���찮����"+File.separator+"�ı�");
//		file5.getParentFile().mkdir();	
//		File file6=new File("E:"+File.separator+"���찮����"+File.separator+"ͼƬ"+File.separator+"img"+File.separator+"bb.img");
//		file6.getParentFile().mkdirs();
//		file6.createNewFile();
//		File file7=new File("E:"+File.separator+"���찮����"+File.separator+"ͼƬ"+File.separator+"img"+File.separator+"cc.img");
//		file7.createNewFile();
//		System.out.println("�����ļ����");
		
		
		File file = new File("E:"+File.separator+"���찮����");
		listFile(file,0);
		
//		File newFile = new File(file,"hello.txt");
//		System.out.println(newFile);
//		newFile.createNewFile();
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
