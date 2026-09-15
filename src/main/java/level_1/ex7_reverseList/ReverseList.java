package level_1.ex7_reverseList;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("5", "book", "12", "100",
                "notebook",
                "computer"));

        sortListInReverse(list);
        System.out.println(list);
    }
    public static void sortListInReverse(List<String> list){
        list.sort((a, b) -> b.length() - a.length());
    }
}
