/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import static org.junit.Assert.*;


import org.junit.Test;

import environment.MapItem;

public class TestNormalCreature 
{
	@Test
	public void testInitialization()
	{
		Creature normal1= new NormalCreature("p",30);
		assertTrue(normal1 instanceof MapItem);
		assertEquals("p",normal1.getName());
		assertEquals(30,normal1.getCurrentLifePoints());
	}
	
	@Test
	public void testAttack() 
	{
		Creature normal1= new NormalCreature("p",30);
		Creature normal2= new NormalCreature("p",50);
		assertTrue(normal1 instanceof MapItem);
		normal1.attack(normal2);
		assertEquals(45,normal2.getCurrentLifePoints());
		
	}

}
