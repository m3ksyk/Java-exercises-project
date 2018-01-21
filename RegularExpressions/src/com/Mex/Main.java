package com.Mex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String separ = "*****";
	    String string = "That is a string. Yes, that is a string";
        System.out.println(string);
        String string1 =string.replaceAll("that", "it");
        System.out.println(string1);
        System.out.println(separ);

        String alpha = "abcDeeekfkhsljhgslfdkhsl";
        System.out.println(alpha.replaceAll(".", "z")); // dot replaces all letters
        System.out.println(alpha.replaceAll("^abcDee", " TTT ")); // the ^ sign replace the beginning of the string only
        System.out.println(alpha.replaceAll("khsl$", " EEE" ));    // the $ sign replace the end of the string only
        System.out.println(alpha.replaceAll("[^ab]", "x")); // ^ in square brackets replaces all signs except those given in the bracket
        System.out.println(alpha.replaceAll("[abcde]", "x"));
        System.out.println(alpha.replaceAll("[a-e]", "x"));

        System.out.println(separ);
        String alpha2 = "abcDeeekfjhgslfdkabcDeehshsdfvsdfgl";
        System.out.println(alpha2.replaceAll("^abcDee", " OOO "));
        System.out.println(alpha2.replaceAll("abcDee", " OOO "));
        System.out.println(separ);
        System.out.println(alpha.matches("^hello"));
        System.out.println(alpha.matches("^abc")); //the whole string has to match!!
        System.out.println(alpha.matches("abcDeeekfjhgslfdkhsl"));
        System.out.println(alpha.replaceAll("[ld]", " x "));

        System.out.println("tom".replaceAll("[Tt]om", "Tom"));

        System.out.println(separ);
        String whiteSpaces = " lorem\t ipsum, and \n so on";
        System.out.println(whiteSpaces);
        System.out.println(whiteSpaces.replaceAll("\t","")); //removes tab
        System.out.println(whiteSpaces.replaceAll("\n","")); //removes new line
        System.out.println(whiteSpaces.replaceAll("\\s","")); //removes all white space
        System.out.println(whiteSpaces.replaceAll("\\w","")); //replaces  letters
        System.out.println(whiteSpaces.replaceAll("\\b",".")); //surrounds every word with given sign

        //quantifiers
        System.out.println(separ);
        System.out.println(alpha.replaceAll("^abcDe{3}", " x "));
        System.out.println(alpha.replaceAll("^abcDe+", " x "));
        System.out.println(alpha.replaceAll("^abcDe*", " x "));
        System.out.println(alpha.replaceAll("^abcDe{2,5}", " x "));
        System.out.println(separ);
        //Pattern and Matcher

        StringBuilder htmltext = new StringBuilder("<h1> Heading</h1>");
        htmltext.append("<h2> sub header</h2>");
        htmltext.append("<p> first paragraph<p>");
        htmltext.append("<p> second paragraph<p>");
        htmltext.append("<h2> summary</h2>");
        htmltext.append("<p> summary here<p>");

        String h2Pattern = "(<h2>)";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmltext);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Matcher is searching");
            System.out.println(" found " + count + " : " + matcher.start() + " to " + matcher.end());
        }

       // String h2GroupPattern ="(<h2>)";
       // String h2GroupPattern = "(<h2>.*</h2>)";
        String h2GroupPattern = "(<h2>.*?</h2>)"; //now we have a "lazy" quantifier
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmltext);
        groupMatcher.reset();

        while(groupMatcher.find()){
            System.out.println(" Group matcher found " + groupMatcher.group(1));
        }

        System.out.println(separ);

        //challenges

        //challenge 1
        //check if two strings match each other
        System.out.println(separ);

        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        //challenge 2
        // write a regular expression that verifies match to two strings
        System.out.println(separ);

        String reg = "I want a \\w+.";
       // String reg = "I want a (bike|ball)";
        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches(reg));
        System.out.println(challenge2.matches(reg));

        //challenge 3
        //the same thing, but using a matcher
        System.out.println(separ);

        String regPattern = "I want a \\w+.";
        Pattern pattern1 = Pattern.compile(regPattern);
        Matcher matcher1 = pattern1.matcher(challenge1);
        System.out.println(matcher1.matches());

        matcher1 = pattern1.matcher(challenge2);
        System.out.println(matcher1.matches());

        //challenge 4
        //replace all blanks with underscores
        System.out.println(separ);

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s","_"));

        //challenge 5
        // write a regExp that will match the entire string. use string.matches() to verify
        System.out.println(separ);

        String challenge5 = "aaabccccccccdddefffg";

        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        //challenge 6
        //write a regExp that will match the entire string from challenge 5, but only that string
        System.out.println(separ);

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        //challenge 7
        // write a regExp that matches a string with a given series of letters followed by a series of digits
        System.out.println(separ);

        String challenge7 = "abcd.135";

        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));


        //challenge 8
        //same thing, but using group, matcher finds groups
        System.out.println(separ);

        String challenge8 = "abcd.135uvqz.7tzik.999";

        String regExp8 = "[A-Za-z]+\\.(\\d+)";
        Pattern pattern8 = Pattern.compile(regExp8);
        Matcher matcher8 = pattern8.matcher(challenge8);
        while(matcher8.find()){

            System.out.println("Matcher8 is searching");
            System.out.println(" found " + matcher8.group(1));
        }

        //challenge 9
        //revise the given string and extract all numbers like in challenge 8
        //actually it works with challenge 8 code even though it has tabs and stuff
        System.out.println(separ);

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";

        String regExp9 = "[A-Za-z]+\\.(\\d+)";
        Pattern pattern9 = Pattern.compile(regExp9);
        Matcher matcher9 = pattern9.matcher(challenge9);
        while(matcher9.find()){

            System.out.println("Matcher9 is searching");
            System.out.println(" found " + matcher9.group(1));
        }

        //challenge 10
        //print start and end indices of extracted  number groups
        System.out.println(separ);

        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";

        String regExp10 = "[A-Za-z]+\\.(\\d+)";
        Pattern pattern10 = Pattern.compile(regExp10);
        Matcher matcher10 = pattern10.matcher(challenge10);
        while(matcher10.find()){

            System.out.println("Matcher10 is searching");
            System.out.println(" found  start: " + matcher10.start(1) + " and the end " + (matcher10.end(1) -1));
        }

        //challenge 11
        //extract the numbers from the braces
        System.out.println(separ);

        String challenge11 = "{0,2}, {0,5}, {1,3}, {2,4}";
        String regExp11 = "\\{(.+?)\\}";
        Pattern pattern11 = Pattern.compile(regExp11);
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()){

            System.out.println("Matcher11 is searching");
            System.out.println(" found   " + matcher11.group(1));
        }

        //challenge 12
        //write a regExp to match a 5-digit US zip code
        System.out.println(separ);

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        //challenge 13
        //write a regExp to match a 5-digit US zip code followed by dash and four numbers
        System.out.println(separ);
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

        //challenge 14
        //write a regExp to match a 5-digit US zip code, optionally followed by dash and four numbers
        System.out.println(separ);
        String regExp14 = "(^\\d{5}-\\d{4}$|^\\d{5}$)"; // it matches digit code with dash OR without dash
        System.out.println(challenge13.matches(regExp14));
        System.out.println(challenge12.matches(regExp14));

    }
}
