package items.armor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.ArmorException;
import lifeform.Damage;

/**
 * Test cases for AcidAddon
 * @author Sameer Kumar Kotra
 */
public class TestArmorAcidAddon
{

	/**
	 * test Acid Armor Add on.
	 * @throws ArmorException
	 */
	@Test
	public void testAcidArmor() throws ArmorException
	{
		Armor armor = new NormalArmor(5);
		ArmorAddon addon = new ArmorAcidAddon(armor);
		Damage acidDamage = new Damage("ACID", 20);

		acidDamage = addon.reduceDamage(acidDamage);
		assertEquals(0, acidDamage.getDamagePoints());

		Damage poisonDamage = new Damage("POISON", 20);
		poisonDamage = addon.reduceDamage(poisonDamage);
		assertEquals(15, poisonDamage.getDamagePoints());
	}

}
