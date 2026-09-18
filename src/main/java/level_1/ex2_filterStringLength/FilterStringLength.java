package level_1.ex2_filterStringLength;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStringLength {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Hugo", "Carmen", "Leo", "Lucas", "Antonio");

        System.out.println(filterStrByLength(names));

    }
    public static List<String> filterStrByLength(List<String> names) {
        return names.stream()
                .filter(s -> s.toLowerCase().contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }
}
