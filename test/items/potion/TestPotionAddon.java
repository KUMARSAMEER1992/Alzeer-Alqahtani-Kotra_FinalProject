package items.potion;
import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;
/**
 * test cases for PotionAddon class
 * @author Dalal Alzeer
 *
 */
public class TestPotionAddon
{
	/**
	 * test initialization of PotionAddon and Item Type
	 */
	@Test
	public void test()
	{
		HealthPotion hp=new HealthPotion();
		//initialization
		PotionAddon potionAddon=new MockPotionAddon(hp);
		assertTrue(potionAddon instanceof MapItem);
		//test Item Type
		assertEquals("POTION",potionAddon.getItemType());
	}

}
