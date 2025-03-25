package demo4;

public class CollengeStudent extends Student {
    private String sex;

    public CollengeStudent()
    {
    	super();
    }

    public CollengeStudent(String sname,String Sbirthday,String sclass,String sex)
    {
    	super(sname,Sbirthday,sclass);
    	this.sex=sex;
    }

    public void setSex(String sex)
    {
    	this.sex=sex;
    }
    public String getSex()
    {
    	return sex;
    }
    public void show()
    {
    	super.show();
    	System.out.println("性别:"+sex);
    }
}
