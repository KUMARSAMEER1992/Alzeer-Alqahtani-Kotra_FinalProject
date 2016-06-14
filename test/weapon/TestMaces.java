package weapon;
import static org.junit.Assert.*;

import org.junit.Test;
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
		Maces mace = new Maces();
		assertEquals(5, mace.getBaseDamage());
		//assertEquals(10, sword.calculateDamage());
	}

}
