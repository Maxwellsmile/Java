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
		Writer w = new FileWriter(new File("E:"+File.separator+"С˵�Ķ�"+File.separator+"��ҹ��.txt"),true);
		w.write("���ߣ���Ұ����");
		w.write("��飺����Χ����һ�����Ų�ͬѰ����㺵�Сѧ��չ����"
				+ "1973�꣬�����һ�����������ڷ�����һ����ʬ���˺�19�꣬������֮Ůѩ���뱻����֮��ͩԭ��˾���Ͻ�Ȼ��ͬ��������·��"
				+ "һ������������ᣬһ��ȴ�ڵײ����ߣ���������ߵ��ˣ�ȴ�Ӷ�������������ȥ�����쾭��19��ļ��׷�٣�����ʹ�����ס�");
		w.flush();
		w.close();
		Writer w1 = new FileWriter(new File("E:"+File.separator+"С˵�Ķ�"+File.separator+"ʱ��.txt"),true);
		w1.write("���ߣ���Ұ����");
		w1.write("��飺�����˶����ز�����������ѡ���ǿ�����׺�Ȼ��ĸ��˵���ڶ�ʮ��ǰ�ͼ��������ˣ�ͨ�����佲����ʱ�����Ĺ��¡�");
		w1.flush();
		w1.close();
		Writer w2 = new FileWriter(new File("E:"+File.separator+"С˵�Ķ�"+File.separator+"����.txt"),true);
		w2.write("���ߣ���Ұ����");
		w2.write("��飺��Ҫ������������ѧ��ʱ��һ·�Ͼ��������޵��޵У���׮���ʮ���������������ǣ�����������в��ɼ��ġ�����֮������");
		w2.flush();
		w2.close();
	*/
		Scanner scan=new Scanner(System.in);
		System.out.println("��ӭ����΢�Ŷ��飡");
		while(true) {
			System.out.println("��ѡ����������Ҫ���Ĳ�����1.�Ķ��鼮2.�ϴ�С˵3.����С˵4.�˳�");
			int a=scan.nextInt();
			switch(a) {
				case 1:
					System.out.println("��ѡ����Ҫ�Ķ����鼮����ҹ��"+"  "+"ʱ��"+"  "+"����");
					String b=scan.next();
					read(b);
					break;
				case 2:
					System.out.println("��д����Ҫ��д������");
					String c=scan.next();
					System.out.println("��д����Ҫ��д����");
					String d=scan.next();
					writer(c,d);
					break;
				case 3:
					System.out.println("��ѡ����Ҫ���ص��鼮����ҹ��"+"  "+"ʱ��"+"  "+"����");
					String e=scan.next();
					load(e);
					break;
			}
			if(a==4) {
				System.out.println("�ɹ��˳�����л����ʹ�ã�");
				break;
			}
		}
		
		
	}

	private static void load(String n) throws IOException {
		// TODO Auto-generated method stub
		Writer w=new FileWriter(new File("F:"+File.separator+n+".txt"),true);
		Reader r=new FileReader(new File("E:"+File.separator+"С˵�Ķ�"+File.separator+n+".txt"));
		char[] arr=new char[49];
		int num=0;
		while((num=r.read(arr))!=-1) {
			w.write(new String(arr,0,num));
		}
		w.flush();
		w.close();
		System.out.println("�����ɹ������ڱ��ص���F���в鿴��������");
	}

	private static void writer(String a, String b) throws IOException {
		// TODO Auto-generated method stub
		Writer w=new FileWriter(new File("E:"+File.separator+"С˵�Ķ�"+File.separator+a+".txt"),true);
		w.write(b);
		w.flush();
		w.close();
		System.out.println("�����ɹ���");
	}

	private static void read(String n) throws IOException {
		// TODO Auto-generated method stub
		Reader r=new FileReader(new File("E:"+File.separator+"С˵�Ķ�"+File.separator+n+".txt"));
		char[] arr=new char[49];
		int num=0;
		while((num=r.read(arr))!=-1) {
			System.out.println(new String(arr,0,num));
		}
	}
}
