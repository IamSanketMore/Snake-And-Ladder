public class SnakesAndLadders
{
	public static final int Ending_Point=100;
	
	public static void main(String args[])
	{
		int Pos=0;
		final int Ladder=1;
		final int Snake=2;
		
		while (Pos <= 100)
		{
			int Option = (int)Math.floor(Math.random() * 10) % 3; 
			int Dice = (int)(Math.floor(Math.random() * 10) % 6) + 1;
			
			switch(Option)
			{
				case Ladder:
						Pos=Pos+Dice;
						System.out.println("****** You Got a Ladder ******\nYou Move Ahead By " +Dice+ " To " +Pos+ " Positions");
						
						break;
			
				case Snake:
						if(Pos>=0)
						{
							Pos=Pos-Dice;
							System.out.println("****** You Got a Snake ******\nYou Move Behind By " +Dice+ " To " +Pos+ "Positions");
						}
						else
						{
							System.out.println("Player Position moves below '0' \nRe-Start Game From "+Pos);
						}
						break;
			
				default:
						System.out.println("Player Does not Play His turn \nStay in the Same Position:- "+Pos);
			}
		}
	}
}
