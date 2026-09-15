package level_1.ex6_sortList;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("5", "book", "12", "100",
                "notebook",
                "computer"));

        sortList(list);
        System.out.println(list);
    }
    public static void sortList(List<String> list){
        list.sort((a, b) -> a.length() - b.length());
    }
}
