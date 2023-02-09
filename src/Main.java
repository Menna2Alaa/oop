public class Main {
    public static void main(String[] args) {
        if(Jop.recruiting)
        {
            System.out.println("Lucky");
        }
        else
        {
            System.out.println("Unlucky");
        }
        Programmer pr=new Programmer();
        pr.setName("Zain");
        System.out.println(pr.getName());
        pr.setAge(23);
        System.out.println(pr.getAge());
        Programmer pr0=new Programmer("Laila",20);
        System.out.println(pr0);
        if(Jop.recruiting)
        {
            System.out.println("Lucky");
        }
        else
        {
            System.out.println("Unlucky");
        }
    }
}
//in programmer class it will inherit the Employee class to print the message which written in it, it has two parameters name and age
//it also has a constructor as when there is a new programmer will apply he should enter his name and age
//and make sure that jop need a new programmer at this time
//we create set and get method of these two parameters to change these value at any time(when there ia a new programmer will apply)