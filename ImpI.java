package 学生通讯录管理;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ImpI implements Manger {
	 private List<Student> StuList=new ArrayList<Student>();
	 public boolean addStudent(Student student)
	 {
		 return StuList.add(student);
	 }
	 public Student findStudent(String studentNo)
	 {
		 Iterator<Student> it=StuList.iterator();
		 while(it.hasNext())
		 {
			 Student student=it.next();
			 if(studentNo.equals(student.getNum())) {
	               return student;
		 }
	 }
		 return null;
}
	@Override
	public boolean deleteStudent(String studentNo) {
		Student existStudent=findStudent(studentNo);
		if(existStudent!=null)
		{
			StuList.remove(existStudent);
		}
		return false;
	}
	@Override
	public Student updateStudent(String studentNo, String name, String sex, int age, String tel, String banji,String email) {
		Student existstudent=findStudent(studentNo);
		if(existstudent!=null)
		{
			return existstudent;
		}
		return null;
	}
	@Override
	public void showAll() {
		System.out.println("学号\t姓名\t性别\t年龄\t邮箱\t班级\t手机号");
		Iterator<Student> it=StuList.iterator();
		while(it.hasNext()) {
            Student st=it.next();
            System.out.println(st.getNum()+"\t"+st.getname()+
                    "\t"+st.getSex()+"\t"+st.getAge()
                    +"\t"+st.getemail()+"\t"+st.getBanji()+"\t"+st.getTel());
        }
		return;
	}
}