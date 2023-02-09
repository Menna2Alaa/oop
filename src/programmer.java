public class programmer extends Employee{
    private String Name;
    private int Age;

    public programmer()
    {
        String Name=null;
        int Ag=0;
        Jop.recruiting=true;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }

    public String getName()
    {
        return Name;
    }
    public void setAge(int Age)
    {
        this.Age=Age;
    }
    public int getAge()
    {
        return Age;
    }

}
