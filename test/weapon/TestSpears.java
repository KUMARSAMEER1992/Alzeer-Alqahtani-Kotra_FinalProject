package weapon;
import static org.junit.Assert.*;

import org.junit.Test;
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
		Spears spear = new Spears ();
		assertEquals(7, spear.getBaseDamage());
		//assertEquals(14, sword.calculateDamage());
	}

}
