package 学生通讯录管理;

public interface Manger {
	boolean addStudent(Student student);
	Student findStudent(String studentNo);
	boolean deleteStudent(String studentNo);
	Student updateStudent(String studentNo, String name, String sex,int age, String tel, String banji, String email);
	void showAll();
}
