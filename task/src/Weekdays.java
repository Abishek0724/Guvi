
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {  
        String week[] = new String[7];
        week[0] = "Sunday";
        week[1] = "Monday";
        week[2] = "Tuesday";
        week[3] = "Wednesday";
        week[4] = "Thursay";    
        week[5] = "Friday";    
        week[6] = "Saturday";

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number to get day ");
            int day = sc.nextInt();
            if(day>=0 && day<7){
                System.out.println(week[day]);
            }else{
                throw new Exception("Enter number in range 0 to 6");
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            sc.close();
        }
    }
}

