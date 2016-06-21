package items.armor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.MapItem;
import lifeform.Damage;

/**
 * Test cases for Normal Armor
 * @author Sameer Kumar Kotra
 */
public class TestNormalArmor
{

	/**
	 * tets Initialization.
	 */
	@Test
	public void testInitialization()
	{
		Armor armor = new NormalArmor(5);
		assertTrue(armor instanceof MapItem);
	}

	/**
	 * test Normal Armor.
	 */
	@Test
	public void testArmor()
	{
		Armor armor = new NormalArmor(5);
		Damage damage = new Damage("test", 20);
		damage = armor.reduceDamage(damage);
		assertEquals(15, damage.getDamagePoints());

		damage = new Damage("test", 3);
		damage = armor.reduceDamage(damage);
		assertEquals(0, damage.getDamagePoints());

		damage = new Damage("test", 5);
		damage = armor.reduceDamage(damage);
		assertEquals(0, damage.getDamagePoints());
	}

}
