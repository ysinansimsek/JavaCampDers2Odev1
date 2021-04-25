
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C# Dersleri","Sıfırdan Yazılım Öğrenme");
		Course course2 = new Course(2,"Java Dersleri","Sıfırdan Yazılım Dersleri");
		
		CourseManager courseManager= new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
	
	}
}
