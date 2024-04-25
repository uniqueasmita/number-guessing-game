import java.util.Random;

import java.util.*; 

public class Numbergame { 

    public static void main(String[] args) 

    {
        int answer, guess; 
        int MAX = 100; 
        Scanner sc = new Scanner(System.in); 

        Random rand = new Random(); 

        boolean correct = false; 

        answer = rand.nextInt(MAX); 

        while (!correct)
		 { 
            System.out.println(  "Guess a number between 1 and 100: ");
            guess = sc.nextInt(); 

            if (guess > answer) 
			{ 

                System.out.println("Too high, Try Again"); 

            } 

            else if (guess < answer)
			 { 

                System.out.println("Too low, Try Again"); 

            }  
            else 
			{ 
                System.out.println(  "Congrats!! You Did it"); 

                correct = true; 
            } 
        } 
        System.exit(0); 
    }
} 