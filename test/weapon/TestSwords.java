package weapon;
import static org.junit.Assert.*;
import lifeform.LifeForm;
import lifeform.MockLifeForm;

import org.junit.Test;

import player.Creature;
import player.NormalCreature;
import player.Player;
/**
 * The test cases for Swords class.
 * @author Dalal Alzeer
 */
public class TestSwords 
{
	/**
	 * Test initialization&damage of Swords.
	 */
	@Test
	public void test()
	{
		//Test initialization
		Player p=Player.getPlayer();
		Creature normal= new NormalCreature("p",30);
		Swords sword = new Swords();
		//Test damage
		p.pickUp(sword);
		p.attack(normal);
		assertEquals(20,normal.getCurrentLifePoints());
	}

}
