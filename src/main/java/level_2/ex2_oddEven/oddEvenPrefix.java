package level_2.ex2_oddEven;

import java.util.List;
import java.util.stream.Collectors;

public class oddEvenPrefix {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(7, 99, 35, 5, 2, 40);

        System.out.println(formatNumbers(numbers));
    }

    public static String formatNumbers(List<Integer> numbers) {
        return numbers.stream().map(n -> {
                    if (n % 2 == 0) {
                        return "e" + n;
                    } else {
                        return "o" + n;
                    }}) .collect(Collectors.joining(", "));
    }
}
