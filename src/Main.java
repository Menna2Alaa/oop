public class Main {
    public static void main(String[] args) {
        if(Jop.recruiting==true)
        {
            System.out.println("Lucky");
        }
        else
        {
            System.out.println("Unlucky");
        }
        programmer pr=new programmer();
        pr.setName("Zain");
        pr.setAge(23);
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