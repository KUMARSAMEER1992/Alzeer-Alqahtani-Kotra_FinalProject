package items.armor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.MapItem;
import environment.StringConstants;
import exception.ArmorException;
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

		armor = new NormalArmor(-5);
		damage = new Damage("test", 5);
		damage = armor.reduceDamage(damage);
		// No reduce as armor strength is set to 0 when negative value passed.
		assertEquals(5, damage.getDamagePoints());
	}

	/**
	 * test the MapItem interface methods.
	 * @throws ArmorException
	 */
	@Test
	public void testMapMethods() throws ArmorException
	{
		Armor armor = new NormalArmor(5);
		assertEquals(StringConstants.ARMOR, armor.getItemType());
		assertEquals('A', armor.getChar());
	}
}
