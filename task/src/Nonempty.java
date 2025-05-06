import java.util.*;
public class Nonempty {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("abc","","bc","efg","dcfv","");
        strings.stream().filter(s->!s.isEmpty()).forEach(s->System.out.print(s+" "));
    }
    
}
