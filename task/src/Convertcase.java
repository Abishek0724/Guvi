import java.util.*;
public class Convertcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names separated by Space: ");
        String input =sc.nextLine();
        List<String> names=Arrays.asList(input.split(" "));
        names.stream().map(String::toUpperCase).forEach(name->System.out.print(name+" "));
    }
    
}
