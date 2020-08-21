package be.intecbrussel.javaStreams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyClassTest {
    public static void main(String[] args)
    {
        String[] mots = {"mes", "trois", "mots"};
        Stream.of(mots).forEach(System.out::println);
        Stream<String> streamObject = Stream.of(mots);
        streamObject.forEach(System.out::println);
        Stream<String> streamHello = Stream.generate(() -> "Hello World");
        IntStream monIntStream = IntStream.rangeClosed(0, 10);
        monIntStream.forEach(System.out::println);
        IntStream.rangeClosed(0, 10)
                .forEach(System.out::println);
    }
}
