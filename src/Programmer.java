public class Programmer extends Employee{
    private String name;
    private int age;

    public Programmer()
    {
        String name=null;
        int age=0;
        Jop.recruiting=true;
    }
    public Programmer(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }

}
