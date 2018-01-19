package com.Mex;

//stream exercise

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> bingoNumbers = Arrays.asList(
                "h12", "f34", "g54",
                "j65", "i23", "i24",
                "i26", "I67"
        );

        List<String> INumbers = new ArrayList<>();


//        bingoNumbers.forEach(number ->{
//            if(number.toUpperCase().startsWith("I")){
//                INumbers.add(number);
//               // System.out.println(number);
//            }
//        });
//        INumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        INumbers.forEach((String s) ->System.out.println(s));


        //now we do the same thing, but using a stream
        bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("I"))
                .sorted()
                .forEach(System.out::println);

        //putting streams together and counting operations
        Stream<String> ioNumberStream = Stream.of("j65", "i23", "i24",
                "i26", "I67");
        Stream<String> inNumberStream = Stream.of("h12", "f34", "g54", "i23", "i24");
        Stream<String> concatStream = Stream.concat(inNumberStream, ioNumberStream);
       // System.out.println(concatStream.count()); //counts all elements in the stream
       // System.out.println(concatStream.distinct().count()); // counts distinct elements in the stream

        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

//          List<String> sortedINumbers = bingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("I"))
//                .sorted()
//                .collect(Collectors.toList());
//
//           for(String s : sortedINumbers){
//            System.out.println(s);
//          }

            List<String> sortedINumbers = bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("I"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

            for(String s : sortedINumbers){
            System.out.println(s);
            }

    }
}
