//***********************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//          
//***********************************************************
import static java.lang.System.out;
import java.util.Random;

public class Lab3_6C
{
    public static void main(String[] args)
    {
        int numToGuess = 0;       //Number the user tries to guess
        int guess = 0, guesses = 0, tooHigh = 0, tooLow = 0;            //The user's guess
        
        Random rand = new Random();
        
        numToGuess = rand.nextInt(9)+1;
        
        while(guess != numToGuess){
        	guess = GetInfo.getSlider("Enter the num you want to guess",1, 10);
        	
        	if(guess > numToGuess){
        		GetInfo.showMessage("Too high!");
        		tooHigh++;
        	}else if(guess < numToGuess){
        		GetInfo.showMessage("Too low!");
        		tooLow++;
        	}
        	
        	guesses++;
        }
        
        GetInfo.showMessage("Congrats, you got it right. The number was " + numToGuess + "\n It only took you " + guesses + " try/tries.\n Too High : " + tooHigh + "\n Too low : " + tooLow    );
    }
}
