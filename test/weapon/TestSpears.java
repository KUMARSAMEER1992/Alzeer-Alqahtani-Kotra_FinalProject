package weapon;
import static org.junit.Assert.*;

import org.junit.Test;

import player.Creature;
import player.NormalCreature;
import player.Player;
/**
 * The test cases for Spears class.
 * @author Dalal Alzeer
 */
public class TestSpears 
{
	/**
	 * Test initialization&damage of Spears.
	 */
	@Test
	public void test()
	{
		//Test initialization
		Player p=Player.getPlayer();
		Creature normal= new NormalCreature("p",30);
		Spears spear = new Spears();
		//Test damage
		p.pickUp(spear);
		p.attack(normal);
		assertEquals(23,normal.getCurrentLifePoints());
	}

}
