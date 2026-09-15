package level_1.ex4_printWithReference;

import java.util.List;

public class PrintWithReference {
    public static void main(String[] args) {
        List<String> months = List.of("January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December");
        printWithMethodReference(months);
    }

    public static void printWithMethodReference(List<String> months){
        months.forEach(System.out::println);
    }
}
