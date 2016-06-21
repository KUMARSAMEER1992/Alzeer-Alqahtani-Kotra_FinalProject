package player;
import static org.junit.Assert.*;
import items.armor.Armor;
import items.armor.NormalArmor;

import org.junit.After;
import org.junit.Test;

import environment.MapItem;
import weapon.Attachments;
import weapon.Spears;
import weapon.Swords;
import weapon.WeakAttachment;

/**
 * The test cases for Player class.
 * @author Dalal Alzeer
 */

public class TestPlayer
{
	/**
	 * test initialization
	 */
	@Test
	public void test()
	{
		Player p1 = Player.getPlayer();
		assertTrue(p1 instanceof MapItem);
		Player p2 = Player.getPlayer();
		assertTrue(p1 == p2);
	}

	/**
	 * Reset the instance after each Test.
	 */
	@After
	public void reset()
	{
		Player.resetInstance();
	}
	/**
	 * Reset player method to use for other tests.
	 */
	public static void resetPlayer()
	{
		Player.resetInstance();
	}

	/**
	 * test attack
	 */
	@Test
	public void testAttack()
	{ 	
		// test attack using strength
		Player p = Player.getPlayer();
		Creature normal = new NormalCreature("p", 30);
		//test player attacks creature.Reduce lifePoint by 10 (30 to 20)
		p.attack(normal);
		assertEquals(20, normal.getCurrentLifePoints());
		//test creature attacks player.Reduce lifePoint by 5 (100 to 95)
		normal.attack(p);
		assertEquals(95, p.getCurrentLifePoints());
		// test using weapon
		Creature normal2 = new NormalCreature("p", 80);
		Swords swords = new Swords();
		p.pickUp(swords);
		p.attack(normal2);
		assertEquals(70,normal2.getCurrentLifePoints());
		p.dropWeapon();
		//with using weapon&attachment
		Attachments a=new WeakAttachment(swords);
		p.pickUp(a);
		p.attack(normal2);
		assertEquals(55, normal2.getCurrentLifePoints());
	}
	/**
	 * test player can pickup&drop a weapon
	 */
	@Test
	public void testPickup_dropWeapon()
	{
		Player p=Player.getPlayer();
		Swords swords=new Swords();
		p.pickUp(swords);
		assertEquals(swords,p.getWeapon());
		p.dropWeapon();
		assertNull(p.getWeapon());
	}
	/**
	 * test player cannot pickup a weapon if he has one
	 */
	@Test
	public void testCannotPickup()
	{
		Player p=Player.getPlayer();
		Swords swords=new Swords();
		Spears spear=new Spears();
		p.pickUp(swords);
		assertEquals(swords,p.getWeapon());
		p.pickUp(spear);
		assertEquals(swords,p.getWeapon());
	}
	/**
	 * test set&get armor
	 */
	@Test
	public void testSet_GetArmor()
	{
		Player p=Player.getPlayer();
		Armor armor = new NormalArmor(5);
		p.setArmor(armor);
		assertEquals(armor,p.getArmor());
	}
	/**
	 * test increase lifePoints
	 */
	@Test
	public void increaseLifePoints()
	{
		Player p=Player.getPlayer();
		assertEquals(100,p.getCurrentLifePoints());
		p.increaseCurrentLifePoints(10);
		assertEquals(110,p.getCurrentLifePoints());
		
	}
	/**
	 * test increase/decrease key
	 */
	@Test
	public void key()
	{
		Player p=Player.getPlayer();
		assertEquals(0,p.getKey());
		//increase key
		p.increaseKey(1);
		assertEquals(1,p.getKey());
		//decrease key
		p.decreaseKey();
		assertEquals(0,p.getKey());
	}
	/**
	 * test getChar/getItemType
	 */
	@Test
	public void testGetChar_GetItemType() 
	{
		Player p=Player.getPlayer();
		assertEquals('P',p.getChar());
		assertEquals("PLAYER",p.getItemType());
	}
}
