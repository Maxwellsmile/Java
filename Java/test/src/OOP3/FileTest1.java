package OOP3;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		
		
//		File file1=new File("E:"+File.separator+"天天爱消除"+File.separator+"图片"+File.separator+"png"+File.separator+"aa.png");
//		file1.getParentFile().mkdirs();
//		file1.createNewFile();	
//		File file2=new File("E:"+File.separator+"天天爱消除"+File.separator+"音乐"+File.separator+"mp3"+File.separator+"交响乐.mp3");
//		file2.getParentFile().mkdirs();
//		file2.createNewFile();
//		File file3=new File("E:"+File.separator+"天天爱消除"+File.separator+"音乐"+File.separator+"cd"+File.separator+"cd1"+File.separator+"我的最爱");
//		file3.getParentFile().mkdirs();
//		File file4=new File("E:"+File.separator+"天天爱消除"+File.separator+"音乐"+File.separator+"cd"+File.separator+"cd2");
//		file4.getParentFile().mkdir();
//		File file5=new File("E:"+File.separator+"天天爱消除"+File.separator+"文本");
//		file5.getParentFile().mkdir();	
//		File file6=new File("E:"+File.separator+"天天爱消除"+File.separator+"图片"+File.separator+"img"+File.separator+"bb.img");
//		file6.getParentFile().mkdirs();
//		file6.createNewFile();
//		File file7=new File("E:"+File.separator+"天天爱消除"+File.separator+"图片"+File.separator+"img"+File.separator+"cc.img");
//		file7.createNewFile();
//		System.out.println("创建文件完成");
		
		
		File file = new File("E:"+File.separator+"天天爱消除");
		listFile(file,0);
		
//		File newFile = new File(file,"hello.txt");
//		System.out.println(newFile);
//		newFile.createNewFile();
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
