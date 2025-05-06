import java.util.*;
class underageException extends RuntimeException{
   public underageException(String message){
    super(message);
   }
}
public class Voter {
public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    try {
        System.out.println("Enter age :");
        int age = Sc.nextInt();
        if(age<18){
            throw new underageException("youre not eligible to vote");
        }else{
            System.out.println("youre eligible to vote");
        }
        
    } catch (underageException e) {
        System.out.println("exception caught"+e.getMessage());
    } finally {
        Sc.close();
    }
}
}
