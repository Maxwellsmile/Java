package studentdemo;

public class student {
	 private String name;
	 private int age;
	 private int classes;
	 private String magor;//专业
	 private int number;
	 
	 public student() {
			
		}
	 @Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", classes=" + classes + ", magor=" + magor + ", number="
				+ number + "]";
	}
	public student(String name, int age, int classes, String magor, int number) {
		this.name = name;
		this.age = age;
		this.classes = classes;
		this.magor = magor;
		this.number = number;
	}
	public void setName(String name1) {
	      name=name1;
	   }
	 public String getName() {
	      return name;
	   }
	 public void setAge(int age1) {
		 if(30<age1 && age1<0) {
			 System.out.println("请给出合适的年龄");
			 return;
		 }
		      age=age1;
		   }
	 public int getAge() {
		      return age;
		   }
	 public void setClasses(int classes1) {
		 classes=classes1;
	   }
	 public int getClasses() {
	      return classes;
	   }
	 public void setMagor(String magor1) {
		 magor=magor1;
	   }
	 public String getMagor() {
	      return magor;
	   }
	 public void setNumber(int number1) {
		 number=number1;
	   }
	 public int getNumber() {
	      return number;
	   }
	 
}
