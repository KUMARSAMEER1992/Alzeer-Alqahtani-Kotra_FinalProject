package player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

import environment.MapItem;
import weapon.Attachments;
import weapon.Swords;

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

	public static void resetPlayer()
	{
		Player.resetInstance();
	}

	/**
	 * test attack
	 */
	@Test
	public void testAttack()
	{ // test attack using strength
		Player p = Player.getPlayer();
		Creature normal = new NormalCreature("p", 30);
		p.attack(normal);
		assertEquals(25, normal.getCurrentLifePoints());
		// test using weapon
		Creature normal2 = new NormalCreature("p", 80);
		Swords swords = new Swords();
		p.pickUp(swords);
		p.attack(normal2);
		assertEquals(70, normal2.getCurrentLifePoints());
		p.dropWeapon();
		// with using weapon&attachments
		Attachments a = new Attachments(swords);
		p.pickUp(a);
		p.attack(normal2);
		assertEquals(45, normal2.getCurrentLifePoints());
	}

}
