/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import static org.junit.Assert.*;


import org.junit.Test;

import environment.MapItem;

public class TestPison 
{
	@Test
	public void testInitialization()
	{
		Creature normal1= new NormalCreature("p",30);
		Ability poison1 = new PoisonCreature(normal1);
		assertTrue(poison1 instanceof MapItem);
		assertEquals("p",poison1.getName());
		assertEquals(30,poison1.getCurrentLifePoints());
	}
	@Test
	public void testTakeHit() 
	{
		Creature normal1= new NormalCreature("p",30);
		Creature normal2= new NormalCreature("p",50);
		Ability poison1 = new PoisonCreature(normal1);
		Ability poison2 = new PoisonCreature(normal2);
		assertTrue(poison1 instanceof MapItem);
		poison1.attack(poison2);
		assertEquals(40,poison2.getCurrentLifePoints());	
	}
}
