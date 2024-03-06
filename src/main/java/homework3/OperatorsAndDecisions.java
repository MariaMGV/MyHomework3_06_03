package homework3;
import java.util.Scanner;

public class OperatorsAndDecisions
{
    public static void main(String[] args)
    {
        largerNumber();
        rectangle();
        evenOddNumber();
        dayOfTheWeek();
    }
    public static void largerNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to \"The larger number\" game. Please enter 3 integer and I will guess " +
                "which is the larger.What is your first number?");
        int a = sc.nextInt();
        System.out.println("What is your second number?");
        int b = sc.nextInt();
        System.out.println("What is your third number?");
        int c = sc.nextInt();


       if (a == b && b == c)
        {
            System.out.printf("The tree numbers are equals - %d.", a);
        }
        else if (a > b && a > c)
        {
            System.out.printf("The larger number is %d.", a);
        }
        else if (b > a && b > c)
        {
            System.out.printf("The larger number is %d.", b);
        }
        else if (c > a && c > b)
        {
            System.out.printf("The larger number is %d.", c);
        }
       else if (a == b)
       {
            System.out.printf("The first and second numbers are equals and larger than the third - %d. ", a);
       }
       else if (a == c)
       {
            System.out.printf("The first and third numbers are equals and and larger than the second - %d. ", a);

       }
       else if (b == c)
       {
           System.out.printf("The second and third numbers are equals and and larger than the first - %d. ", b);
       }

        System.out.println(" ");
        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.println(" ");
    }
         public static void rectangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's calculate the perimeter and face of rectangle. Please enter the length:");
        float length = scanner.nextFloat();
        System.out.println("Please enter the height:?");
        float height = scanner.nextFloat();

        float face = length * height;
        System.out.printf("The face is %.3f cm.",face);

        float perimeter = (2*length) + (2*height);
        System.out.printf("The perimeter is %.3f cm.",perimeter);

        System.out.println(" ");
        System.out.println("\n-----------------------------------------------------------------------------------");
        System.out.println(" ");

    }


    public static void evenOddNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play - you'll enter a number and I'll guess whether it's even or odd!\nPlease, enter an integer!");
        int userInput = scan.nextInt();

        if(userInput % 2 == 0)
        {
            System.out.println("Your number is even");
        }
        else if (userInput % 2 != 0)
        {
            System.out.println("Your number is odd");
        }

        System.out.println(" ");
        System.out.println("\n-----------------------------------------------------------------------------------");
        System.out.println(" ");
    }

    public static void dayOfTheWeek()
    {
        System.out.println("Our latest game = \"Guess the day of the week\"! \n"+
                "If you enter a number from 1 to 7, I will indicate the day of the week. Please enter your number!");
        Scanner input = new Scanner(System.in);
        String userNum = input.nextLine();

        switch(userNum)
        {
            case "1":
                System.out.printf("You have selected %s. Day of the week is Monday.",userNum);
                break;
            case "2":
                System.out.printf("You have selected %s. Day of the week is Tuesday.",userNum);
                break;
            case "3":
                System.out.printf("You have selected %s. Day of the week is Wednesday.",userNum);
                break;
            case "4":
                System.out.printf("You have selected %s. Day of the week is Thursday.",userNum);
                break;
            case "5":
                System.out.printf("You have selected %s. Day of the week is Friday.",userNum);
                break;
            case "6":
                System.out.printf("You have selected %s. Day of the week is Saturday.",userNum);
                break;
            case "7":
                System.out.printf("You have selected %s. Day of the week is Sunday.",userNum);
                break;
            default:
                System.out.println("Invalid number! Please, enter a number from 1 to 7!");
                break;
        }

    }


}




