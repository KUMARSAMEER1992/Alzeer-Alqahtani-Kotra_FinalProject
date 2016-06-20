/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;

public class TestCreature 
{
	/**
	 * Test Initialization of the LifeForm.
	 */
	@Test
	public void testInitialization() 
	{
		Creature creature= new MockCreature("p",30);
		assertTrue(creature instanceof MapItem);
		assertEquals(30, creature.getCurrentLifePoints());
		assertEquals("CREATURE",creature.getItemType());
		
	}

}
