package nyc.c4q.lighterletter;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();

        System.out.println("type in an integer.");


        while (true) {
            int number = input.nextInt();

            numbers.add(number);

            if (number == -1) {
                numbers.clear();
                System.out.println("Cleared. Total: " + (number + 1));
                continue;

            } else if (number == -2) {
                break;
            }

        }
// This is an alternate way to loop through the array. Also works.
//        int i = 0;
//
//        for (Integer num : numbers) {
//
//            i = i + num;
//
//            System.out.println(num);
//
//        }
//
////        for (int i = 0; i < numbers.size(); i++) {
////            System.out.println( numbers.get(i) );
////        }
//        System.out.println("Thanks! Total is: " + i + 2);


        //Iterator goes through the array in the same way a for loop does. hatNext checks to see
        //if there is another element of the array to go to. .next moves to the next value of the array.
        int sum = 0;
        Iterator<Integer> numIter = numbers.iterator();
        while (numIter.hasNext()) {
            sum += numIter.next();
        }

        System.out.println("Thanks! Total is: " + (sum + 2));


    }
}
