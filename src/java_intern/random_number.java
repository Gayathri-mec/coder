package java_intern;

import java.util.Random;
import java.util.Scanner;

public class random_number {
   public random_number() {
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      boolean playagain = true;

      int total;
      String inputplayagain;
      for(total = 0; playagain; playagain = inputplayagain.equals("yes")) {
         int target = random.nextInt(100) + 1;
         int maxattempt = true;
         int attempt = 0;
         System.out.println("welcome to the number game");

         for(; attempt < 6; ++attempt) {
            System.out.println("enter the guessing number with in 100: ");
            int usernum = input.nextInt();
            if (usernum == target) {
               System.out.println("congratulation your guess is correct\t" + target);
               ++total;
               break;
            }

            if (usernum < target) {
               System.out.println("too low from target\t");
            } else {
               System.out.println("too high from target\t");
            }
         }

         if (attempt == 6) {
            System.out.println("sorry you have reach the max attempt");
         }

         System.out.println("target element\t" + target);
         System.out.println("do you want playagain(yes/no)");
         inputplayagain = input.next().toLowerCase();
      }

      System.out.println("TOTAL SCORE OF GAME \t" + total);
   }
}

