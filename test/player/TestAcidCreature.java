/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package player;

import static org.junit.Assert.*;


import org.junit.Test;

import environment.MapItem;

public class TestAcidCreature
{
	/**
	 * Test Initialization of the AcidCreature.
	 */
	@Test
	public void testInitialization()
	{
		Creature normal= new NormalCreature("spider",50);
		Ability acid = new AcidCreature(normal);
		assertTrue(acid instanceof MapItem);
		assertEquals("spider",acid.getName());
		assertEquals(50,acid.getCurrentLifePoints());
		assertEquals('D',acid.getChar());
	}

	/**
	 * Test attack with another AcidCreature.
	 */
	@Test
	public void testAttack() 
	{
		Creature normal1= new NormalCreature("spider",30);
		Creature normal2= new NormalCreature("bug",50);
		Ability acid1 = new AcidCreature(normal1);
		Ability acid2 = new AcidCreature(normal2);
		assertTrue(acid1 instanceof MapItem);
		acid1.attack(acid2);
		assertEquals(42,acid2.getCurrentLifePoints());	
		TestPlayer.resetPlayer();
		//test boarding case,when current life points 0 do not do attack
		Creature normal3= new NormalCreature("Spider",0);
		Creature normal4= new NormalCreature("bug",50);
		Ability acid3 = new AcidCreature(normal3);
		Ability acid4 = new AcidCreature(normal4);
		acid3.attack(acid4);
		assertEquals(50,acid4.getCurrentLifePoints());
		//test boarding case,when creature dead 
		Creature normal5= new NormalCreature("Spider",20);
		Creature normal6= new NormalCreature("bug",2);
		Ability acid5 = new AcidCreature(normal5);
		Ability acid6 = new AcidCreature(normal6);
		acid5.attack(acid6);
		assertEquals(0,acid6.getCurrentLifePoints());
	}
	
	/**
	 * Test attack for AcidCreature with Player.
	 */
	@Test
	public void testAttackWithPlayer() 
	{
		Creature normal= new NormalCreature("Spider",30);
		Ability acid = new AcidCreature(normal);
		Player player = Player.getPlayer();
		acid.attack(player);
		assertEquals(92,player.getCurrentLifePoints());
		TestPlayer.resetPlayer();
	}

}
