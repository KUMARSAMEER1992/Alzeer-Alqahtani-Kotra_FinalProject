/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;
import junit.framework.TestCase;

/**
 * test cases for InvokerBuilder class
 */
public class TestInvokerBuilder extends TestCase
{
	/**
	 *test attache correct command to each button/receiver
	 */
	public void test() 
	{  
		Invoker in=InvokerBuilder.build();
		assertTrue(in.turnNorth instanceof TurnNorth);
		assertTrue(in.turnSouth instanceof TurnSouth);
		assertTrue(in.turnEast instanceof TurnEast);
		assertTrue(in.turnWest instanceof TurnWest);
		
	}	
}
