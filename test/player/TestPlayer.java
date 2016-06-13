package player;

import static org.junit.Assert.*;
import lifeform.Damage;
import org.junit.After;
import org.junit.Test;

import environment.MapItem;


public class TestPlayer 
{
	
	@Test
	public void test() 
	{
		Player p1 = Player.getPlayer();
		assertTrue(p1 instanceof MapItem); 
	}
	/**
	 * Reset the instance after each Test.
	 */
	@After
	public void reset()
	{
		Player.resetInstance();
	}
	@Test
	public void testTakeHit() 
	{
		Player p=Player.getPlayer();
		Damage damage= new Damage("Player",10);
		p.takeHit(damage);
		assertEquals(40,p.getCurrentLifePoints());
	}
	@Test
	public void testattack() 
	{
		Player p=Player.getPlayer();
		Creature normal= new NormalCreature("p",30);
		Damage damage= new Damage("Player",10);
		p.takeHit(damage);
		assertEquals(40,p.getCurrentLifePoints());
		normal.attack(p);
		//assertEquals(40,p.getCurrentLifePoints());
	}
	
}
