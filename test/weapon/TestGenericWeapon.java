package weapon;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The test cases for the Generic Weapon class.
 * @author Dalal Alzeer
 */
public class TestGenericWeapon 
{
	/**
	 * test the initialization of the mock weapon.
	 * test get base damage
	 */
	@Test
	public void testGetBaseDamage() 
	{
		GenericWeapon weapon = new MockGenericWeapon(10);
		assertEquals(10,weapon.getBaseDamage());
	}
	/**
	 * test item Type
	 */
	@Test
	public void testType() 
	{
		GenericWeapon weapon = new MockGenericWeapon(10);
		assertEquals("WEAPON",weapon.getItemType());
	}

}
