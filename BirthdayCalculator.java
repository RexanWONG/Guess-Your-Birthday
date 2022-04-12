import java.util.Scanner;

public class BirthdayCalculator {
    public static void main(String[] args){

       //Create number sets, user will input if their birthday is on a set.
       String first_set =
       "1 3 5 7\n" +
       "9 11 13 15\n" +
       "17 19 21 23\n" +
       "25 27 29 31";

       String second_set =
       "2 3 6 7\n" +
       "10 11 14 15\n" +
       "18 19 22 23\n" +
       "26 27 30 31";

       String third_set =
       "4 5 6 7\n" +
       "12 13 14 15\n" +
       "20 21 22 23\n" +
       "28 29 30 31";

       String fourth_set =
       "8 9 10 11\n" +
       "12 13 14 15\n" +
       "24 25 26 27 \n" +
       "28 29 30 31";

       String fifth_set =
       "16 17 18 19\n" +
       "20 21 22 23\n" +
       "24 25 26 27 \n" +
       "28 29 30 31";

       //Day to be determined
       int day = 0;
       String yes = "yes";
       String no = "no";

       Scanner input = new Scanner(System.in);

       //In set 1?
       System.out.print("Is your birthday in this set of numbers?\n");
       System.out.print(first_set);
       System.out.print("\nEnter \"Yes\" for yes & \"no\" for no: ");
       String answer = input.nextLine();

       if (answer.equalsIgnoreCase(yes))
           day += 1;

       //In set 2?
       System.out.print("\nIs your birthday in this set of numbers?\n");
       System.out.print(second_set);
       System.out.print("\nEnter \"Yes\" for yes & \"no\" for no: ");
       String second_answer = input.nextLine();

       if (second_answer.equalsIgnoreCase(yes))
           day += 2;


       System.out.print("\nIs your birthday in this set of numbers?\n");
       System.out.print(third_set);
       System.out.print("\nEnter \"Yes\" for yes & \"no\" for no: ");
       String third_answer = input.nextLine();

       if (third_answer.equalsIgnoreCase(yes))
            day += 4;


       System.out.print("\nIs your birthday in this set of numbers?\n");
       System.out.print(fourth_set);
       System.out.print("\nEnter \"Yes\" for yes & \"no\" for no: ");
       String fourth_answer = input.nextLine();

       if (fourth_answer.equalsIgnoreCase(yes))
           day += 8;


       System.out.print("\nIs your birthday in this set of numbers?\n");
       System.out.print(fifth_set);
       System.out.print("\nEnter \"Yes\" for yes & \"no\" for no: ");
       String fifth_answer = input.nextLine();

       if (fifth_answer.equalsIgnoreCase(yes))
           day += 16;

       System.out.println("\nYour birthday is " + day + "!");

    }
}
