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
	 * Test Initialization of the Ability.
	 */
	@Test
	public void testInitialization() 
	{
		Creature normal= new NormalCreature("spider",30);
		Ability ability = new MockAbility(normal);
		assertTrue(ability instanceof MapItem);
		assertEquals(30, ability.getCurrentLifePoints());
		
	}

}
