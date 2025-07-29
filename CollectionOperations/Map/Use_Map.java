package CollectionOperations.Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Use_Map {
    public static void main(String[] args) {
        
        List<String> courses = Arrays.asList("c", "c++", "java", "Angular", "PYthOn");

        Function<String, String> fun = (str) -> str.toUpperCase();
        
        List<String> ncourses = courses.stream().map(fun).collect(Collectors.toList());

        // for (String course : ncourses) {
        //     System.out.print(course+ " ");
        // }


        String str = "apple,banana,cherry";
        System.out.println(str);

        List<String> list = Arrays.asList(str.split(","));
        System.out.println(list);
    } 
}
