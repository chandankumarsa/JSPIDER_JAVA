package Inheritance;

//constructor is not participiate in Inheritance2 by default constructor is called parent class by holding 
//constructor and private member is not participiate in inheritance

class Human1 
{
    private String name;
    int age;

    Human1()
    {
        System.out.println("Human class Constructor");
    }

    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1  
{
    // public Studemt1()
    // {
        //super();
    // }
    void disp()
    {
        System.out.println(" The age is : " + age);
       // System.out.println(" The Name is : " + name);
    }
}

public class CONSTRUCTOR_NOT_PARTICIAPATE 
{
    public static void main(String[] args) 
    {
        Student1 st1=new Student1();
        st1.sleep();
        st1.disp();
        
    }
    
}