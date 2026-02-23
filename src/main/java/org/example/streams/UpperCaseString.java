package org.example.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UpperCaseString {
    public static void main(String[] args){
        List<String> words = List.of("hi","hello","world" ,"anshu","vinay","preksha");

        /// Task: Convert to uppercase and join with commas → "HI,HELLO,WORLD".
        String upperCase = words.stream()
                /// if you don't want space then use (Local.ROOT)
                /// .map(s -> s.toUppercase(Local.ROOT))
                .map(String :: toUpperCase).peek(System.out::println)
                .collect(Collectors.joining(" , "));
        System.out.println(upperCase);

        System.out.println();

        /// /// Task: Convert to Lowercase and join with commas → "hi,hello,world".
        String lowerCase = words.stream()
                .map(String::toLowerCase).peek(System.out::println)
                .collect(Collectors.joining(" , "));
        System.out.println(lowerCase);


        /// Task : find String with max vowels
        Optional<String> maxVowels = words.stream()
                /// use comparingLong because count returns long type of values
                .max(Comparator.comparingLong(word -> word.chars()
                                .filter(c -> "aieouAIEOU".indexOf(c) != -1)
                                .count()

                        ));
        System.out.println(maxVowels.get());


        /// Task : find String with min vowels
        Optional<String> minVowels = words.stream()
                .min(Comparator.comparing(word -> word.chars()
                        .filter(c -> "aeiouAEOIU".indexOf(c) != -1)
                        .count()
                ));
        System.out.println(minVowels.get());

        /// Task : reverse string of the list

        List<String> reverse = words.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reverse);

        /// Sort names in ascending order
        List<String> ascendingOrder = words.stream()
                .sorted().toList();
        System.out.println(ascendingOrder);

        /// Sort names in descending order
        List<String> descendingOrder = words.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(descendingOrder);

        /// find length of each String
        List<Integer> length = words.stream()
                .map(String :: length).peek(s -> System.out.println(s))
                .toList();
        System.out.println(length);

        /// find String with the max length
        Optional<String> maxLength = words.stream()
                .max(Comparator.comparingInt(l -> l.length()));
        System.out.println(maxLength.get());

        /// find String with the min length
        Optional<String> minLength = words.stream()
                .min(Comparator.comparingInt(l -> l.length()));
        System.out.println(minLength.get());

        /// find vowels in given list
        List<String> vowelsInList = words.stream()
                .filter(s -> s.chars().anyMatch(c -> "aeiouAEIOU".indexOf(c) != -1))
                .collect(Collectors.toList());
        System.out.println(vowelsInList);

    }
}
