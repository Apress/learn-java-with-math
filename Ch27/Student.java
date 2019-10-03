public class Student {
	private String name;
	private int age;
	private int grade;
	
	public Student() {
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getGrade()
	{
		return this.grade;
	}
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}
