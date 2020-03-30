import java.util.Scanner;
public class TestClass {
    public static void main(String[] args){
        //create a random number from 0 to 2
        
 
        int number = 0;
        while(number != -1){
        int randNumber =(int)(Math.random()*3);

        //Prompt the user for input
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        
        //use the switch statement 
        switch(number){
            case 0 :
                if(randNumber == number){
                    System.out.println ("The computer is scissor 0" 
                            + ". You are scissor. You win ");
                }//end if
                else if (randNumber == 1)
                    System.out.println ("The computer is rock 1" 
                            + ". You are scissor 0. You lost ");
                else if (randNumber == 2)
                    System.out.println ("The computer is paper 2" 
                            + ". You are scissor 0. You lost ");
                break;
            case 1:
                if(randNumber == 1){
                    System.out.println ("The computer is rock 1" 
                            + ". You are rock 1. You win ");
                }//end if
                else if (randNumber == 0)
                    System.out.println ("The computer is scissor 0" 
                            + ". You are rock 1. You lost ");
                else if (randNumber == 2)
                    System.out.println ("The computer is paper 2" 
                            + ". You are rock 1. You lost ");
                break;
            case 2:
                if(randNumber == 2){
                    System.out.println ("The computer is paper 2" 
                            + ". You are paper 2. You win ");
                }//end if
                else if (randNumber == 0)
                    System.out.println ("The computer is scissor 0" 
                            + ". You are paper 2. You lost ");
                else if (randNumber == 1)
                    System.out.println ("The computer is rock 1" 
                            + ". You are paper 2. You lost ");
                break;
            default: System.out.println ("Error you have input a "
                    + "number that is not "
                    + "0 to 2 please try again ");
                break;
        }//end of switch
        }
    }//end main
}//end class
