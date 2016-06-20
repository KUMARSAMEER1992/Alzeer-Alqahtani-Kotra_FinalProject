/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;
import player.Player;
/**
 *  Invoker Builder class
 */
public class InvokerBuilder 
{
	/**
	 * Create invoker
	 * @param lifeForm
	 * @return Invoker
	 */
	public static Invoker bulidInvoker(Player player)
	{	
		Invoker invoker =new Invoker();
		//TurnNorth
		Command temp1=new TurnNorth(player);
		invoker.setTurnNorth(temp1);
		//TurnSouth
		Command temp2=new TurnSouth(player);
		invoker.setTurnSouth(temp2);
		//TurnEast
		Command temp3=new TurnEast(player);
		invoker.setTurnEast(temp3);
		//TurnWest
		Command temp4=new TurnWest(player);
		invoker.setTurnWest(temp4);
		return invoker;
	}
	 
}
