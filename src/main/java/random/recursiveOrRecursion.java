package random;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class recursiveOrRecursion {

    public void printNames(int n){
        if(n <= 0){return;} // Termination condition
        // Business Logic
        System.out.println("Hello my Students");
        // recursion
        printNames(n -1);

    }
    public void printArrayList(ArrayList arr , int i){

        //Termination condition
        if(i >= arr.size()){return;}
        // Business Logic
        System.out.println(arr.get(i));
        // recursion
        printArrayList(arr, i + 1);

    }

    public int moveToNextTable(int n , char t1 , char t2 , char t3){
        //Termination Condition
        if(n ==1 ){return 1;}
        // Business Logic
        int step1 = moveToNextTable(n-1 , t1 , t3 , t2);
        int step2 = 1;
        int step3 = moveToNextTable(n-1 , t3 , t2 , t1);


        return step1 + step2 + step3 ;


    }


    public void printNumbers(int num){
        //Termination Condition
        if(num <= 0){return;}
        //Business Logic
        System.out.println(num);
        // Recursion
        printNumbers( num-1);
    }

    public void printArr(int[] arr , int i){
        //Termination condition
        if(i >= arr.length){return;}
        // Business Logic
        System.out.println(arr[i]);
        // recursion
        printArr(arr,i+1);
    }

    public int printCatEeys(int cats){
        if(cats == 0) {return 0;}

        return 2 + printCatEeys(cats -1);

    }

    public int findFactorial(int factorial){
        if(factorial <= 1) {return 1;}

        return factorial * findFactorial(factorial-1);
    }


    public void swap1(int[] arr , int a , int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public int sumOfDigits(int n ){
        if(n == 0 || n < 0){return 0;}
        return n%10 + sumOfDigits(n/10);
    }
    public int fibonacci(int n){
        if(n <0){return -1;}
        if(n == 0 || n==1){return n;}
         return fibonacci(n-1) + fibonacci(n-2);
    }

    public int power(int n , int pow){
        if(pow <0){return -1;}
        if(pow ==0){return 1;}

        return n*power(n , pow-1);
    }
    public int powerNegative(int n , int pow){
        if(n == 0){return 1;}
        return 1/(n*powerNegative(n , pow+1));
    }

    public int gcd(int a , int b ){
        if(a < 0 || b <0){return -1;}
        if(b == 0){return a;}
        return gcd(b , a%b);
    }

    public int decimalToBinary(int decimal){
        if(decimal == 0){return 0;}
        return decimal%2 + 10*decimalToBinary(decimal/2);

        /* -- or -- we have to set the method parameter to  decimalToBinary(int decimal , String result)
            if(decimal == 0){
                return result
            }
            result = decimal%2 + result;
            return decimalToBinary(decimal/2 , result);

         */

    }



    public void printReverseArr(int[] arr , int i ){
        //Termination condition
        if(i >= arr.length){return;}
        // recursion
        printReverseArr(arr , i+1);
        // Business Logic
        System.out.println(arr[i]);
    }

    public void printArr(int[] arr) {
        for(int number : arr){
            System.out.println(number);
        }
    }

    public String reverseString(String input){
        //What is the base case ?
        if(input.isEmpty()){
            return input;
        }
        //  what is the smallest amount of work i can do in each iteration?
        return reverseString(input.substring(1)) +input.charAt(0);
    }


    public void printReverseArrayList(ArrayList arr , int i ){
        //Termination condition
        if(i >= arr.size()){return;}
        // recursion
        printReverseArrayList(arr , i+1);
        // Business Logic
        System.out.println(arr.get(i));
    }

    public boolean isPalindrome(String input){
        if(input.isEmpty() || input.length() == 1){
            return true;
        }

        if(input.charAt(0) == input.charAt(input.length()-1)){
            return isPalindrome(input.substring(1,input.length()-1));
        }


        return false;
    }

    public static char first(String str) {
        if(str.isEmpty() || str.length()==1 && Character.isUpperCase(str.charAt(0))){
            return str.charAt(0);
        }
        return first(str.substring(1));


    }

    public  String capitalizeWord(String str){
        if(str.isEmpty() || str.length() == 1){
            return str.toUpperCase();

        }
        char c = str.charAt(0);
        c = Character.toUpperCase(c);
        return str.charAt(0) + capitalizeWord(str.substring(1));

    }


    public static void main(String[] args) {
        /*
        int[] arr = {1,2,3};
        System.out.println("printArr");
        new recursiveOrRecursion().printArr(arr, 0 );
        System.out.println("printReverseArr");
        new recursiveOrRecursion().printReverseArr(arr, 0);

        -- ArrayList --

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println("printArrayList");
        new recursiveOrRecursion().printArrayList(arr, 0);
        System.out.println("printReverseArrayList");
        new recursiveOrRecursion().printReverseArrayList(arr , 0);

        */

        // var i = new recursiveOrRecursion().fibonacci(4);
        //        System.out.println(i);


    }
}
