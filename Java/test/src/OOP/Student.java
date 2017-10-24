package OOP;

public class Student {
	private int id;
	private String name;
	private int age;
//	private String classs;
	private int score;
	public Student()
	{
	}
	public Student(int id, int age, int score, String name)
	{
		this.id = id;
		this.age = age;
		this.score = score;
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getScore()
	{
		return score;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "学号：" + id + " 姓名：" + name + " 年龄：" + age + " 成绩：" + score;
	}

	
}
