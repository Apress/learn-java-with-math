public class TestStudent {
	public static void main(String[] args) {
		Student student = new Student("John Doe");
		  /*This line will give compiler error
		  grade field can't be used directly as it is private */
		  // student.grade = 60;
		student.setGrade(60);
		System.out.println("Student name: " + student.getName() + "; grade: " + student.getGrade());
	}
}