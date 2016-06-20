/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;
import org.junit.Test;

import player.Player;

import junit.framework.TestCase;
/**
 * test cases for Invoker class
 */
public class TestInvoker extends TestCase 
{
	/**
	 * test that clicking buttons call correct attached command
	 */
	@Test
	public void testInvoker()
	{
		Invoker invoker=new Invoker();
		Player player=Player.getPlayer();
		//test TurnNorth
		MockCammand c1=new MockCammand(player);
		invoker.setTurnNorth(c1);
		assertEquals(0,c1.testValue);
		invoker.btnNorth.doClick();
		assertEquals(1,c1.testValue);
		//test TurnEast
		MockCammand c2=new MockCammand(player);
		invoker.setTurnEast(c2);
		assertEquals(0,c2.testValue);
		invoker.btnEast.doClick();
		assertEquals(1,c2.testValue);
		//test TurnSouth
		MockCammand c3=new MockCammand(player);
		invoker.setTurnSouth(c3);
		assertEquals(0,c3.testValue);
		invoker.btnSouth.doClick();
		assertEquals(1,c3.testValue);
		//test TurnWest
		MockCammand c4=new MockCammand(player);
		invoker.setTurnWest(c4);
		assertEquals(0,c4.testValue);
		invoker.btnWest.doClick();
		assertEquals(1,c4.testValue);
		
		
				
	}
}
