package items.armor;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import environment.StringConstants;
import items.potion.PotionDetails;

/**
 * Test cases for Armor factory class.
 * @author Sameer Kumar Kotra
 */
public class TestArmorFactory
{

	/**
	 * test create acid Armor.
	 */
	@Test
	public void testAcidCreation()
	{
		PotionDetails details = new PotionDetails(StringConstants.ACID, 5);
		Armor armor = ArmorFactory.buildArmor(null, details);
		assertTrue(armor instanceof ArmorAcidAddon);
	}

	/**
	 * test create poison Armor.
	 */
	@Test
	public void testPoisonCreation()
	{
		PotionDetails details = new PotionDetails(StringConstants.POISON, 5);
		Armor armor = ArmorFactory.buildArmor(null, details);
		assertTrue(armor instanceof ArmorPosionAddon);
	}

	/**
	 * test create addon with armor with a base armor.
	 */
	@Test
	public void testCreationWithOutAddon()
	{
		Armor normalArmor = new NormalArmor(3);
		PotionDetails details = new PotionDetails(StringConstants.POISON, 5);
		Armor armor = ArmorFactory.buildArmor(normalArmor, details);
		assertTrue(armor instanceof ArmorPosionAddon);
	}

	/**
	 * test create add on with armor with a add on present
	 */
	@Test
	public void testCreationWithAddon()
	{
		Armor temp = new NormalArmor(3);
		PotionDetails details = new PotionDetails(StringConstants.ACID, 5);
		temp = ArmorFactory.buildArmor(temp, details);
		assertTrue(temp instanceof ArmorAcidAddon);

		details = new PotionDetails(StringConstants.POISON, 5);
		temp = ArmorFactory.buildArmor(temp, details);
		assertTrue(temp instanceof ArmorPosionAddon);

		// bounday casses.
		temp = ArmorFactory.buildArmor(null, null);
		assertNull(temp);

		details = new PotionDetails("Random text", 5);
		temp = ArmorFactory.buildArmor(null, details);
		assertNull(temp);

	}

}
