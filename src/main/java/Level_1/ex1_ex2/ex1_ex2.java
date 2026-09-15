package Level_1.ex1_ex2;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class ex1_ex2 {

    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Hugo", "Carmen", "Leo", "Lucas");

        System.out.println(stringContainsO(names));

    }
    public static List<String> stringContainsO(List<String> names) {
        return names.stream().filter(s -> s.contains("o")).collect(Collectors.toList());
    }
}
