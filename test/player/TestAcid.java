/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import static org.junit.Assert.*;


import org.junit.Test;

import environment.MapItem;

public class TestAcid 
{
	@Test
	public void testInitialization()
	{
		Creature normal1= new NormalCreature("p",30);
		Ability acid1 = new AcidCreature(normal1);
		assertTrue(acid1 instanceof MapItem);
		assertEquals("p",acid1.getName());
		assertEquals(30,acid1.getCurrentLifePoints());
	}
	@Test
	public void test() 
	{
		Creature normal1= new NormalCreature("p",30);
		Creature normal2= new NormalCreature("p",50);
		Ability acid1 = new AcidCreature(normal1);
		Ability acid2 = new AcidCreature(normal2);
		assertTrue(acid1 instanceof MapItem);
		acid1.attack(acid2);
		assertEquals(35,acid2.getCurrentLifePoints());	
	}

}
