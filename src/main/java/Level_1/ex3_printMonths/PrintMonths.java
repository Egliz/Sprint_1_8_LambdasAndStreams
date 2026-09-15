package Level_1.ex3_printMonths;

import java.util.ArrayList;
import java.util.List;

public class PrintMonths {
    public static void main(String[] args) {
        List<String> months = List.of("January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December");
        printMonths(months);
    }

    public static void printMonths(List<String> months){
       months.forEach(month -> System.out.println(month));
    }
}
