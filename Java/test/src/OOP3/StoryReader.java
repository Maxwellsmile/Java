package OOP3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class StoryReader {
	public static void main(String[] args) throws IOException {
	/*
		Writer w = new FileWriter(new File("E:"+File.separator+"小说阅读"+File.separator+"白夜行.txt"),true);
		w.write("作者：东野圭吾");
		w.write("简介：故事围绕着一对有着不同寻常情愫的小学生展开。"
				+ "1973年，大阪的一栋废弃建筑内发现了一具男尸，此后19年，嫌疑人之女雪穗与被害者之子桐原亮司走上截然不同的人生道路，"
				+ "一个跻身上流社会，一个却在底层游走，而他们身边的人，却接二连三地离奇死去，警察经过19年的艰苦追踪，终于使真相大白。");
		w.flush();
		w.close();
		Writer w1 = new FileWriter(new File("E:"+File.separator+"小说阅读"+File.separator+"时生.txt"),true);
		w1.write("作者：东野圭吾");
		w1.write("简介：讲述了儿子重病，夫妻两人选择坚强，父亲忽然和母亲说早在二十年前就见过儿子了，通过回忆讲述那时发生的故事。");
		w1.flush();
		w1.close();
		Writer w2 = new FileWriter(new File("E:"+File.separator+"小说阅读"+File.separator+"宿命.txt"),true);
		w2.write("作者：东野圭吾");
		w2.write("简介：主要讲述了两个从学生时代一路较劲、互相仇恨的宿敌，两桩相距十八年的离奇命案，牵扯出隐藏其中不可见的“命运之绳”。");
		w2.flush();
		w2.close();
	*/
		Scanner scan=new Scanner(System.in);
		System.out.println("欢迎来到微信读书！");
		while(true) {
			System.out.println("请选择您接下来要做的操作：1.阅读书籍2.上传小说3.下载小说4.退出");
			int a=scan.nextInt();
			switch(a) {
				case 1:
					System.out.println("请选择您要阅读的书籍：白夜行"+"  "+"时生"+"  "+"宿命");
					String b=scan.next();
					read(b);
					break;
				case 2:
					System.out.println("请写出您要书写的书名");
					String c=scan.next();
					System.out.println("请写出您要书写内容");
					String d=scan.next();
					writer(c,d);
					break;
				case 3:
					System.out.println("请选择您要下载的书籍：白夜行"+"  "+"时生"+"  "+"宿命");
					String e=scan.next();
					load(e);
					break;
			}
			if(a==4) {
				System.out.println("成功退出！感谢您的使用！");
				break;
			}
		}
		
		
	}

	private static void load(String n) throws IOException {
		// TODO Auto-generated method stub
		Writer w=new FileWriter(new File("F:"+File.separator+n+".txt"),true);
		Reader r=new FileReader(new File("E:"+File.separator+"小说阅读"+File.separator+n+".txt"));
		char[] arr=new char[49];
		int num=0;
		while((num=r.read(arr))!=-1) {
			w.write(new String(arr,0,num));
		}
		w.flush();
		w.close();
		System.out.println("操作成功！请在本地电脑F盘中查看下载内容");
	}

	private static void writer(String a, String b) throws IOException {
		// TODO Auto-generated method stub
		Writer w=new FileWriter(new File("E:"+File.separator+"小说阅读"+File.separator+a+".txt"),true);
		w.write(b);
		w.flush();
		w.close();
		System.out.println("操作成功！");
	}

	private static void read(String n) throws IOException {
		// TODO Auto-generated method stub
		Reader r=new FileReader(new File("E:"+File.separator+"小说阅读"+File.separator+n+".txt"));
		char[] arr=new char[49];
		int num=0;
		while((num=r.read(arr))!=-1) {
			System.out.println(new String(arr,0,num));
		}
	}
}
