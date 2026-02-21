package org.example;

import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UpperCaseString {
    public static void main(String[] args){
        List<String> words = List.of("hi","hello","world" ,"anshu","vinay","preksha");

        /// Task: Convert to uppercase and join with commas → "HI,HELLO,WORLD".
        String upperCase = words.stream()
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
                .max(Comparator.comparing(word -> word.chars()
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

    }
}
