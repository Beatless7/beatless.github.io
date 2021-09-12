package 学生通讯录管理;
import java.util.*;
public class Client {

	public static void main(String[] args) {
		ImpI data=new ImpI();
		System.out.println("-----------------欢迎使用学生管理系统-------------------");
		String next;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1.添加 2.查找 3.删除 4.修改 5.显示");
			int i=0;
			i=sc.nextInt();
			switch(i)
			{
			case 1:
				System.out.println("请输入学生学号");
                String id=sc.next();
                System.out.println("请输入学生年龄");
                int age=sc.nextInt();
                System.out.println("请输入学生姓名");
                String name=sc.next();
                System.out.println("请输入学生性别");
                String sex=sc.next();
                System.out.println("请输入学生邮箱");
                String email=sc.next();
                System.out.println("请输入学生手机号");
                String tel=sc.next();
                System.out.println("请输入学生班级");
                String banji=sc.next();
                Student student=new Student();
                student.setAge(age);
                student.setname(name);
                student.setNum(id);
                student.setSex(sex);
                student.setEmail(email);
                student.setBanji(banji);
                student.setTel(tel);
                boolean result=data.addStudent(student);
                if(result) {
                    System.out.println("添加成功");
                    data.showAll();
                }else {
                    System.out.println("添加失败");
                }
                break;
			case 2:
				System.out.println("请输入要查找的学生编号:");
				id=sc.next();
				Student existStudent=data.findStudent(id);
				if(existStudent!=null) {
                System.out.println("查找到学生信息如下");
                System.out.println("学号："+existStudent.getNum()+" 姓名："+existStudent.getname()+" 性别"+existStudent.getSex()+" 邮箱："+existStudent.getemail()+" 班级："+existStudent.getBanji()+" 手机号："+existStudent.getTel()+"年龄："+existStudent.getAge());
                }else {
                    System.out.println("未查找到相关信息");
                }
				break;
			case 3:
				System.out.println("请输入要删除的学生学号");
                id=sc.next();
                result=data.deleteStudent(id);
                if(result) {
                    System.out.println("删除成功");
                    data.showAll();
                }else {
                    System.out.println("删除失败");
                }
                break;
			case 4:
                System.out.println("请输入要更新的学生学号");
                id=sc.next();
                existStudent=data.findStudent(id);
                if(existStudent!=null) {
                    System.out.println("请输入要更新的学生姓名");
                    existStudent.setname(sc.next());
                    System.out.println("请输入要更新的学生年龄");
                    existStudent.setAge(sc.nextInt());
                    System.out.println("请输入要更新的学生性别");
                    existStudent.setSex(sc.next());
                    System.out.println("更新成功");
                }else {
                    System.out.println("更新失败");
                }
                break;
            case 5:
                data.showAll();
                break;

			}
			System.out.println("是否继续进行操作?y/n");
			
			next = sc.next();
		}while(next.equalsIgnoreCase("y"));
		
	}

}
