package weapon;
import static org.junit.Assert.*;

import org.junit.Test;

import player.Creature;
import player.NormalCreature;
import player.Player;
/**
 * The test cases for Maces class.
 * @author Dalal Alzeer
 */
public class TestMaces 
{
	/**
	 * Test initialization&damage of Maces.
	 */
	@Test
	public void test() 
	{
		//Test initialization
		Player p=Player.getPlayer();
		Creature normal= new NormalCreature("p",30);
		Maces mace = new Maces();
		//test damage
		p.pickUp(mace);
		p.attack(normal);
		assertEquals(25,normal.getCurrentLifePoints());
	}

}
