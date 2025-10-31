import java.util.Scanner;

public class Main {

    public static int countDigits(long number) {
      //Put your solution here
     
      long absNumber = Math.abs(number);
         if(number == 0) return 1;
      int count = 0;

      while (absNumber > 0){
        absNumber = absNumber/10;
        count++;
      }
      return count;
    }
    
    public static int sumDigits(long number) {
      //Put your solution here
        long absNumber = Math.abs(number);
        int sum = 0;
        while(absNumber >0){
           
            sum += absNumber % 10;
            absNumber = absNumber/10;
        }
        return sum;
    }
    
    public static String zip(long number) {
      //Put your solution here
      long absNumber = Math.abs(number);
      while(absNumber >0){
      if(absNumber % 10 == 7){
        return "is  zipped.";
      }
      absNumber = absNumber/10;
 
      }
      return "is not zipped.";

    }
    
    public static boolean odds(long number) {
      //Put your solution here
        long absNumber = Math.abs(number);
        if (absNumber == 0) return false;

        while(absNumber >0){
            
            if((absNumber % 10) % 2 == 0){
                return false;
            }
            absNumber = absNumber/10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        //Put your variable declarations here
        //Don't change anything below this line
        int a1;
        int a2;
        String a3;
        boolean a4;
        long number;


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        number = keyboard.nextLong();
        a1 = countDigits(number);
        a2 = sumDigits(number);
        a3 = zip(number);
        a4 = odds(number);
        System.out.printf("The sum of the digits of %d is %d.\n", number, a2);
        System.out.printf("The number of digits in %d is %d.\n", number, a1);
        System.out.printf("%d %s\n", number, a3);
        if (a4)
          System.out.printf("The number %d has all odd digits.\n", number);
        else
          System.out.printf("The number %d does not have all odd digits.\n", number);
    }
}
