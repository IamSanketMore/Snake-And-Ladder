public class SnakesAndLadders
{
	public static final int Starting_Point=0;
	public static final int Ending_Point=100;
	public static void main(String args [])
	{
		System.out.println("***************************************************");
		System.out.println("Welcome to Snake And Ladder Game");
		System.out.println("***************************************************");
		int Player_1=0;
		
		System.out.println("Game Start Point is:-"+Starting_Point+ "\nEnd point is:-"+Ending_Point);
		System.out.println("\nPlayer Intitial Starting Point is :-"  +Player_1);
		
		int dice =(int)(Math.floor(Math.random()*10) %6) + 1;
		
		System.out.println("\nPlayer Rolled a Dice and Get :- " +dice);
	}
}
