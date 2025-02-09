import java.util.Random;
import java.util.Scanner;
class RandomNumber

{
    public static void main(String[] args)
    {
        int numberToGuess;
        int userGuess;
        int numberofTries = 0;
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        numberToGuess =rand.nextInt(100)+1;
        while (numberToGuess<=100) 
        {
            System.out.print("Guess a number between 1 and 100:");
            userGuess = sc.nextInt();
            numberofTries++;
            if(userGuess ==numberToGuess)
            {
                System.out.println("Congratulations!You found the number");
                break;
            }
            else if(userGuess<numberToGuess)
            {
                System.out.println("Too Low!!Try again");
            }
            else{
                System.out.println("Too high!! Try again");
            }
        }


    }

    
         
    }
    
