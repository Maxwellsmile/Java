package OOP2;

public class Persontest {
	public static void main(String[] args) {
		Person s1=new Person("tom",30);
		Person s2=new Person("jary",20);
		System.out.println(s1.age+" "+s2.age);
		if(Math.abs(s1.age-s2.age)<=10) {
			
			System.out.println(s1.name+" "+s2.name+"是同龄人");
		}else {
			System.out.println(s1.name+" "+s2.name+"不是同龄人");
		}
	}
}
