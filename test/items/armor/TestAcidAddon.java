package items.armor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exception.ArmorException;
import lifeform.Damage;

/**
 * @author Sameer Kumar Kotra
 */
public class TestAcidAddon
{

	@Test
	public void testAcidArmor() throws ArmorException
	{
		Armor armor = new NormalArmor(5);
		ArmorAddon addon = new AcidAddon(armor);
		Damage acidDamage = new Damage("ACID", 20);

		acidDamage = addon.reduceDamage(acidDamage);
		assertEquals(0, acidDamage.getDamagePoints());

		Damage poisonDamage = new Damage("POISON", 20);
		poisonDamage = addon.reduceDamage(poisonDamage);
		assertEquals(15, poisonDamage.getDamagePoints());
	}

}
