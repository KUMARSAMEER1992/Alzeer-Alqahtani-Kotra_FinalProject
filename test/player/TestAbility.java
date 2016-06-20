/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;

public class TestAbility 
{
	/**
	 * Test Initialization of the LifeForm.
	 */
	@Test
	public void testInitialization() 
	{
		Creature normal1= new NormalCreature("p",30);
		Ability ability = new MockAbility(normal1);
		assertTrue(ability instanceof MapItem);
		assertEquals(30, ability.getCurrentLifePoints());
		
	}

}
