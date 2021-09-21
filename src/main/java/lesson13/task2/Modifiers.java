package lesson13.task2;

public class Modifiers {
    public static final Modifier<Boolean> invert = input -> !input;
    public static final Modifier<Integer> absolute = Math::abs;
    public static final Modifier<String> reverse = string -> new StringBuilder(string).reverse().toString();
}
