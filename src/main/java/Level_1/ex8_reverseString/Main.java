package Level_1.ex8_reverseString;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseString = s -> new StringBuilder(s).reverse().toString();
                System.out.println(reverseString.reverse("Hello World"));
    }
}
