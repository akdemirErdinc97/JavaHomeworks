
public class Main {

	public static void main(String[] args) {
		
		Instructor hoca1 = new Instructor(101,"Engin","Demiro�","Baskent Uni");
		Instructor hoca2 = new Instructor(102, "Erdin�", "Akdemir", "Cumhuriyet Uni");
		
		Instructor[] hocalar = {hoca1,hoca2};
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addMultipleUser(hocalar);
		instructorManager.getInstructorInfo(hoca2);
		
		
		Student ogrenci1 = new Student(5001, "Yusuf", "K�l��", "C# - Angular", 9);
		StudentManager studentManager = new StudentManager();
		studentManager.getStudentInfo(ogrenci1);
		
		

	}

}
