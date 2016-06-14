package player;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import weapon.Attachments;
import weapon.Swords;
import environment.MapItem;


public class TestPlayer 
{
	
	@Test
	public void test() 
	{
		Player p1 = Player.getPlayer();
		assertTrue(p1 instanceof MapItem); 
		Player p2 = Player.getPlayer();
		assertTrue(p1==p2);
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
	public void testAttack() 
	{	//test without weapon
		Player p=Player.getPlayer();
		Creature normal= new NormalCreature("p",30);
		p.attack(normal);
		assertEquals(25,normal.getCurrentLifePoints());
		//test with weapon
		Creature normal2= new NormalCreature("p",80);
		Swords swords=new Swords();
		p.pickUp(swords);
		p.attack(normal2);
		assertEquals(70,normal2.getCurrentLifePoints());
		p.drop();
		//with attachments
		Attachments a=new Attachments(swords);
		p.pickUp(a);
		p.attack(normal2);
		//assertEquals(,normal2.getCurrentLifePoints());
		
	}
	
	
}
