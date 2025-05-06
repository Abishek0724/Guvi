
import java.util.*;


class Student{
    int rollnum;
    String name;
    int age;
    String course;

public Student(int rollnum,String name,int age,String course) {
        this.rollnum=rollnum;
        this.name=name;
        this.age=age;
        this.course=course;
    }
public void Display(){
    System.out.println(rollnum+" "+name+" "+age+" "+course);
}

    
}
public class StudentManagement {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
    System.out.println("Enter student roll num");
    int rollnum=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter student name");
    String name=sc.nextLine();
    if(!name.matches("[a-zA-Z]+")){
        throw new Exception("Name should contain only alphabets and spaces");
    }
    System.out.println("Enter  student age");
    int age = sc.nextInt();
    if(age<15||age>21){
        throw new Exception("Age must be between 15 and 21.");
    }
    sc.nextLine();
    System.out.println("Enter course");
    String course=sc.nextLine();
    
    Student s1=new Student( rollnum, name, age, course);
    s1.Display();
    
        
    } catch (Exception e) {
        System.out.println("Error: "+e.getMessage());
    }finally{
        sc.close();
    }
    }

    }


