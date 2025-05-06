import java.util.*;
public class StartwithA {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("alice","bob","ashok");
        names.stream().filter(a->a.startsWith("a")).forEach(a->System.out.println(a));
    }
}
