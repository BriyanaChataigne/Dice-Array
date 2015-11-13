import java.util.Scanner;
import java.util.Random;

public class DiceArray2 {
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
		int NUM_ELEMENTS = 13;
		int dice[] = new int[NUM_ELEMENTS];
      
      int numRolls = 0;
      int die1 = 0;       
      int die2 = 0;
      int sum = 0;
		
   
      System.out.println("Enter number of rolls: ");
      numRolls = scnr.nextInt();
		   
      for (int i = 0; i < numRolls; ++i) {
            die1 = randGen.nextInt(6) + 1;
            die2 = randGen.nextInt(6) + 1;
            sum = die1 + die2;
				dice[sum] = dice[sum] + 1;

            System.out.println("Roll " + (i+1) + " is " + sum + " (" + die1 + "+" + die2 + ")");
				

				}
           System.out.println("\n" + "Dice roll statistics:");
				
					for(int i = 2; i < dice.length; i++){
            	 System.out.println(i+"'s:" + dice[i]);
					
                  }
						System.out.println("Dice roll histagrams:");
						for(int i = 2; i < dice.length; i++){
								System.out.print(i+"'s:");
						 	for(int a = 0; a < dice[i]; ++a){
								System.out.print("*");
							}
								System.out.println();

						}	
         
      }
}
