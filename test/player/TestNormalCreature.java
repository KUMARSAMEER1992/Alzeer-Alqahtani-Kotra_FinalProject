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
	/**
	 * Test Initialization of the NormalCreature.
	 */
	@Test
	public void testInitialization()
	{
		Creature normal= new NormalCreature("Spider",30);
		assertTrue(normal instanceof MapItem);
		assertEquals("Spider",normal.getName());
		assertEquals(30,normal.getCurrentLifePoints());
		assertEquals('N',normal.getChar());
	}
	/**
	 * Test attack for NormalCreature.
	 */
	@Test
	public void testAttack() 
	{
		Creature normal1= new NormalCreature("Spider",30);
		Creature normal2= new NormalCreature("bug",50);
		assertTrue(normal1 instanceof MapItem);
		normal1.attack(normal2);
		assertEquals(45,normal2.getCurrentLifePoints());	
	}
	/**
	 * Test attack for NormalCreature with Player.
	 */
	@Test
	public void testAttackWithPlayer() 
	{
		Creature normal= new NormalCreature("Spider",30);
		Player player = Player.getPlayer();
		normal.attack(player);
		assertEquals(95,player.getCurrentLifePoints());
		TestPlayer.resetPlayer();
	}
}
