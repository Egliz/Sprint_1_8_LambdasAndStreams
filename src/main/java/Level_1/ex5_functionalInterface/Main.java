package Level_1.ex5_functionalInterface;

public class Main {
    public static void main(String[] args) {

        PiValue piValue = () -> 3.1415;
        System.out.println(piValue.getPiValue());
    }
}
