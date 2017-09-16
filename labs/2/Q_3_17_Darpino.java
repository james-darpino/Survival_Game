import java.util.Scanner;

public class Q_3_17_Darpino {

	public static void main(String[] args) {
	//Create Scanner
		Scanner input = new Scanner(System.in);
		
			// user input
        	System.out.print("scissor (0), rock (1), paper (2): ");
            int playerMove = input.nextInt();
 
            // generate random scissor, rock or paper for computer to play 
            int computerMove = (1 + (int)(Math.random() * 3));
            
            // if statement to determine who wins or draws
            if (playerMove == 0 && computerMove == 2) {
            	System.out.print("The computer is paper. You are scissors. You won" );
            }
            	else if (playerMove == 1 && computerMove == 0) {
            	System.out.print("The computer is scissors. You are rock. You won" );
            	}
            	else if (playerMove == 2 && computerMove == 1) {
                	System.out.print("The computer is rock. You are paper. You won" );
            	}
            	else if (playerMove == 0 && computerMove == 1) {
                	System.out.print("The computer is rock. You are scissor. You lose" );
            	}	
                	else if (playerMove == 2 && computerMove == 0) {
                    	System.out.print("The computer is scissor. You are paper. You lose" );
                	}
                    	else if (playerMove == 1 && computerMove == 2) {
                        	System.out.print("The computer is paper. You are rock. You lose" );
                    	}
            	else if (playerMove == 2 && computerMove == 2) {
                	System.out.print("The computer is paper. You are paper. You draw" );
            	}
                	else if (playerMove == 1 && computerMove == 1) {
                    	System.out.print("The computer is rock. You are rock. You draw" );
                }
                	else  {
                    	System.out.print("The computer is scissor. You are scissor. You draw" );
                }
            }
           
	}

