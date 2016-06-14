package weapon;
import static org.junit.Assert.*;
import lifeform.LifeForm;
import lifeform.MockLifeForm;

import org.junit.Test;

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
		Player p=Player.getPlayer();
		LifeForm f2=new MockLifeForm("fred",60,5);
		Swords sword = new Swords();
		p.pickUp(sword);
		p.attack(f2);
		System.out.println(f2.getCurrentLifePoints());
		//assertEquals(50,f2.getCurrentLifePoints());
	}

}
