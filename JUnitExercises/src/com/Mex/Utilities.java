package com.Mex;

public class Utilities {

    //returns char array containing every nth char
    //when sourceArray.length<n, return sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){

     if(sourceArray == null || sourceArray.length<n){
         return sourceArray;
     }
     int returnedLenght = sourceArray.length / n;
     char[] result = new char[returnedLenght];
     int index = 0;

     for(int i =n-1; i<sourceArray.length; i+=n){
         result[index++]= sourceArray[i];
     }
     return result;
    }

    //removes pairs of the same character that are next to each other
    // abbcdeef = abcdef
    //abcbdeef = abcbdef

    public String removePairs(String source){
        if(source.length()<2){
            return source; //if lenght is less than two there are no pairs
        }
        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for(int i =0; i<string.length - 1;i++){
            System.out.println(string[i]);
            if(string[i] != string[i+1]){
                sb.append(string[i]);
            }

        }
        sb.append(string[string.length-1]);
        return sb.toString();
    }
    //performes a given conversion
    public int converter(int a, int b){
        return (a/b) + (a*30) - 2;
    }

    public String nullIfOddLenght(String source){
        if(source.length()%2==0){
            return source;
        }
        return null;
    }
}
