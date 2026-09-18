package level_1.ex1_filterStringWithO;

import java.util.List;
import java.util.stream.Collectors;


public class FilterStringWithO {

    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Hugo", "Carmen", "Leo", "Lucas", "Oscar");

        System.out.println(stringContainsO(names));

    }
    public static List<String> stringContainsO(List<String> names) {
        return names.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}
