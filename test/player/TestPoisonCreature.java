/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import static org.junit.Assert.*;


import org.junit.Test;

import environment.MapItem;

public class TestPoisonCreature
{
	/**
	 * Test Initialization of the PoisonCreature.
	 */
	@Test
	public void testInitialization()
	{
		Creature normal= new NormalCreature("bug",70);
		Ability poison = new PoisonCreature(normal);
		assertTrue(poison instanceof MapItem);
		assertEquals("bug",poison.getName());
		assertEquals(70,poison.getCurrentLifePoints());
		assertEquals('E',poison.getChar());
	}
	/**
	 * Test attack for PoisonCreature.
	 */
	@Test
	public void testAttack() 
	{
		Creature normal1= new NormalCreature("spider",30);
		Creature normal2= new NormalCreature("bug",50);
		Ability poison1 = new PoisonCreature(normal1);
		Ability poison2 = new PoisonCreature(normal2);
		assertTrue(poison1 instanceof MapItem);
		poison1.attack(poison2);
		assertEquals(40,poison2.getCurrentLifePoints());	
	}
}
