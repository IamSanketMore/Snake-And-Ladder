public class SnakesAndLadders
{
	public static final int Ladder=1;
	public static final int Snake=2;

	public void StartGame()
	{
		int Pos=0;
		int Pos1=0;
		int counter1=0;
		int counter2=0; 

		outer : while(true)
		{	
			while (Pos < 100)
			{
				int Option = (int)Math.floor(Math.random() * 10) % 3; 
				int Dice = (int)(Math.floor(Math.random() * 10) % 6) + 1;
				if(Option == Ladder)
				{
					Pos=Pos+Dice;
					System.out.println("Player1:-\n****** You Got a Ladder ******\nYou Move Ahead By " +Dice+ " To " +Pos+ " Positions");

					if(Pos < 0 || Pos > 106)
					{
						System.out.println("Error");
					}
					else if(Pos  > 100)
					{
						Pos = Pos - Dice;
						System.out.println("You Cant Jump ");
					}
					else if( Pos == 100)
					{
						System.out.println("\n\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );
						System.out.println("************************** Player1 You Win The Game *****************************");
						System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n" );
						break outer;
					}
				}
				else if(Option == 2)
				{
						if(Pos >= 0)
						{
							Pos = Pos - Dice;
							System.out.println("Player1:-\n****** You Got a Snake ******\nYou Move Behind By " +Dice+ " To " +Pos+ "Positions");
						}
						else
						{
							System.out.println("Player1:-\nPosition moves below '0' \nRe-Start Game From "+Pos);
						}
						System.out.println("\t**********************************" );
						System.out.println("\t* Player1 Current Position Is " + Pos  +" *");
						System.out.println("\t**********************************" );
						break;
				}
				else
				{
						System.out.println("Player1:-\n Does not Play His Turn \nStay in the Same Position:- "+Pos);
						break;
				}
						System.out.println("\t**********************************" );
						System.out.println("\t* Player1 Current Position Is " + Pos  +" *");
						System.out.println("\t**********************************" );
				counter1 ++;
			}

			while (Pos1< 100)
			{
				int Option = (int)Math.floor(Math.random() * 10) % 3; 
				int Dice = (int)(Math.floor(Math.random() * 10) % 6) + 1;
			
				//switch(Option)
				if(Option == Ladder)
				{
					Pos1=Pos1+Dice;
					System.out.println("Player2:-\n****** You Got a Ladder ******\nYou Move Ahead By " +Dice+ " To " +Pos1+ " Positions");
					

					if(Pos1< 0 || Pos1 > 106)
					{
						System.out.println("Error");
					}
					else if(Pos1  > 100)
					{
						Pos1 = Pos1 - Dice;
						System.out.println("You Cant Jump ");
					}
					else if( Pos1 == 100)
					{
						System.out.println("\n\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );
						System.out.println("Player2************************** You Win The Game *****************************");
						System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n" );
						break outer;
					}
				}
				else if(Option == 2)
				{
						if(Pos1 >= 0)
						{
							Pos1 = Pos1 - Dice;
							System.out.println("Player2:-\n****** You Got a Snake ******\nYou Move Behind By " +Dice+ " To " +Pos1+ "Positions");
							
						}
						else
						{
							System.out.println("Player2:- \nPosition moves below '0' \nRe-Start Game From "+Pos1);
						}
						System.out.println("\t**********************************" );
						System.out.println("\t* Player2 Current Position Is " + Pos1  +" *");
						System.out.println("\t**********************************" );
					break;
				}
						
						
				else
				{
						System.out.println("Player2:- \nDoes not Play His Turn \nStay in the Same Position:- "+Pos1);
						
						break;
				}
						System.out.println("\t**********************************" );
						System.out.println("\t* Player2 Current Position Is " + Pos1  +" *");
						System.out.println("\t**********************************" );
				counter2 ++;
			}
		}
		System.out.println("Player1 Rolled Dice "+ counter1 +" TImes !!!!! ");
		System.out.println("Player2 Rolled Dice "+ counter2 +" TImes !!!! ");
	}	
	public static void main(String args[]) 
	{
		SnakesAndLadders Snake_Ladder = new SnakesAndLadders();
		Snake_Ladder.StartGame();
	}
}
