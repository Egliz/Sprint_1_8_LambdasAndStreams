package level_2.ex1_filterNamesWithA;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNamesWithA {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Ada", "ale", "alba", "Juan", "Alicia");

        System.out.println(filterWithA(names));
    }

    public static List<String> filterWithA(List<String> names){
        return names.stream().filter(s -> s.startsWith("A") && s.length() == 3)
                .collect(Collectors.toList());
    }
}
