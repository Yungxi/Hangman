/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman;
/**
 *
 * @author 23YingxuW
 */
import java.util.Scanner;
public class HangMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word");
        String word = scanner.nextLine();
        for(int k = 0; k<170; k++){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            
        }
        
        int wrongCount = 0;
        
        String space = new String(new char[word.length()]).replace("\0", "_");
        
        System.out.println(space);
        

        for(int i=0; i<8; i++){
            System.out.println(" ");
            System.out.println("Enter Guess");
            String guess = scanner.nextLine();
            
            String guessedSofar = "";
            
            for(int e=0; e<word.length(); e++){
                    
                    if(word.charAt(e)==guess.charAt(0)){
                        guessedSofar += guess.charAt(0);
                        
                    }
                    else if(space.charAt(e)!='_'){
                        guessedSofar += word.charAt(e);
                    }
                    else{
                        guessedSofar += "_";
                    }  
                  
                    
                }
            if (space.equals(guessedSofar)) {
			wrongCount++;
			
		} 
            else {
                    space = guessedSofar;
                    i--;
                            
                        
		}
		if (space.equals(word)) {
                    System.out.println(space);
                    System.out.println("Correct! The word was " + word);
                    break;
                        
		}
                System.out.println(space);
                
          
                
                
                
                switch(wrongCount){
                case 1:
                    System.out.println("                   |------");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                 __|________");
                    break;
                case 2:
                    System.out.println("                   |------");
                    System.out.println("                   |     |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                 __|________");
                    break;
                case 3:
                    System.out.println("                   |------");
                    System.out.println("                   |      |");
                    System.out.println("                   |      O");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                 __|________");
                    break;
               case 4:
                    System.out.println("                   |------");
                    System.out.println("                   |     |");
                    System.out.println("                   |     O");
                    System.out.println("                   |     |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                 __|________");
                    break;
              case 5:
                    System.out.println("                   |------");
                    System.out.println("                   |     |");
                    System.out.println("                   |     O");
                    System.out.println("                   |     |\\");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                 __|________");
                    break;
              case 6:
                    System.out.println("                   |------");
                    System.out.println("                   |     |");
                    System.out.println("                   |     O");
                    System.out.println("                   |    /|\\");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                   |");
                    System.out.println("                 __|________");
                    break;
              case 7:                 
                    System.out.println("                   |------");
                    System.out.println("                   |     |");
                    System.out.println("                   |     O");
                    System.out.println("                   |    /|\\");
                    System.out.println("                   |     |");
                    System.out.println("                   |    /");
                    System.out.println("                   |");
                    System.out.println("                 __|________");
                    break;
              case 8:
                    System.out.println("                   |------");
                    System.out.println("                   |     |");
                    System.out.println("                   |     O");
                    System.out.println("                   |    /|\\");
                    System.out.println("                   |     |");
                    System.out.println("                   |    / \\");
                    System.out.println("                   |");
                    System.out.println("                 __|________");
                    System.out.println("");
                    System.out.println("You Lose");
                    System.out.println("The word was "+word);
                    break;
                
            }
                
            }
                
        }
    }
    

