public class SnakesAndLadders
{
	public static void main(String args[])
	{
		int Pos=0;
		final int Ladder=1;
		final int Snake=2;
		
		int Option = (int)Math.floor(Math.random() * 10) % 3; 
		int Dice = (int)(Math.floor(Math.random() * 10) % 6) + 1;
		
		switch((int)Option)
		{
			case Ladder:
				Pos+=Dice;
				System.out.println("****** You Got a Ladder ******\nYou Move Ahead By " +Dice+" Positions");
				break;
			
			case Snake:
				System.out.println("****** You Got a Snake ******\nYou Move Behind By " +Dice+" Positions");
				Pos-=Dice;
			break;
			default:
					System.out.println("Player Does not Play His Turn");
					System.out.println("Stay in the Same Position:- "+Pos);
		}
	}
}
