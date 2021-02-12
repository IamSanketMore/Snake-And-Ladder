public class SnakesAndLadders
{
	public static final int Ladder=1;
	public static final int Snake=2;

	public static void main(String args[]) 
	{
		int Pos=0;
		while (Pos < 100)
		{
			int Option = (int)Math.floor(Math.random() * 10) % 3; 
			int Dice = (int)(Math.floor(Math.random() * 10) % 6) + 1;

			if(Option == Ladder)
			{
					Pos=Pos+Dice;
					System.out.println("****** You Got a Ladder ******\nYou Move Ahead By " +Dice+ " To " +Pos+ " Positions");

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
						System.out.println("************************** You Win The Game *****************************");
						System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n" );
						break ;
					}
			}
			else if(Option == 2)
			{
						if(Pos > 0)
						{
							Pos = Pos - Dice;
							System.out.println("****** You Got a Snake ******\nYou Move Behind By " +Dice+ " To " +Pos+ "Positions");
						}
						else
						{
							System.out.println("Player Position moves below '0' \nRe-Start Game From "+Pos);
						}
			}
			else
			{
						System.out.println("Player Does not Play His Turn \nStay in the Same Position:- "+Pos);
			}
		}
	}
}
