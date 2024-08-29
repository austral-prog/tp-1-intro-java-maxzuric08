package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number%2==0){return true;}
        return false;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if (a>b){return a;}
        return b;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int factorial=1;
        for(int i = 1; i <=n; i++) {
            factorial*=i;

        }
        return factorial;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {

        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String new_word="";

        for(int i = 1; i<=input.length(); i++){new_word+=input.charAt(input.length()-i);}
        return new_word;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        Integer answer = 0;
        for(int i = 1; i < number; i++){if(number%i==0){answer+=i;}}
        if (answer == 1){return true;}
        return false;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int value=array[0];
        for(int i = 0; i < array.length; i++){
            if (value>=array[i]){ value=array[i];}
        }
        return value;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        Integer suma =0;
        for(int i = 0; i < array.length; i++){ suma += array[i];}
        return suma;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit= ((9 * celsius)/5) + 32;
        return fahrenheit;
    }
}
