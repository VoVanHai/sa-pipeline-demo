package vn.edu.ueh.bit.sol2;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> square = s -> s * s;
        Function<Integer, Integer> half = s -> s / 2;
        Function<Integer, String> toString = Object::toString;
        Function<Integer, String> pipeline = square.andThen(half)
                .andThen(toString);
        String result = pipeline.apply(5);
        System.out.println(result);
    }
}
