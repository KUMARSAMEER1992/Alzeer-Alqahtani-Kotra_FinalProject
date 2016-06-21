package items.armor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.ArmorException;
import lifeform.Damage;

/**
 * Test cases Poison add on for the Armor.
 * @author Sameer Kumar Kotra
 */
public class TestArmorPoisonArmor
{

	/**
	 * test Initialization and damage of poison addon.
	 * @throws ArmorException
	 */
	@Test
	public void testAcidArmor() throws ArmorException
	{
		Armor armor = new NormalArmor(5);
		ArmorAddon addon = new ArmorPosionAddon(armor);

		Damage poisonDamage = new Damage("POISON", 20);
		poisonDamage = addon.reduceDamage(poisonDamage);
		assertEquals(0, poisonDamage.getDamagePoints());

		Damage acidDamage = new Damage("ACID", 20);
		acidDamage = addon.reduceDamage(acidDamage);
		assertEquals(15, acidDamage.getDamagePoints());
	}

}
