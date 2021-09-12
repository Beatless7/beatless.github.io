package 学生通讯录管理;

public class Student {
	private String email;
    private String name;
    private String num;
    private int age;
    private String sex;
    private String banji;
    private String tel;
    String getname()
    {
    	return name;
    }
    void setname(String name)
    {
    	this.name=name;
    }
    String getemail()
    {
    	return email;
    }
    public String setEmail(String email){
        return this.email=email;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

}
