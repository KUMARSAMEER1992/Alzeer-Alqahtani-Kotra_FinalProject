/**
 * @author Sameer Kumar Kotra
 */
package items.armor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exception.ArmorException;

/**
 * @author Sameer Kumar Kotra
 */
public class TestArmorAddon
{
	@Test(expected = ArmorException.class)
	public void testInitilization() throws ArmorException
	{
		Armor armor = new NormalArmor(5);
		ArmorAddon addon = new MockArmorAddon(armor, 5);
		assertTrue(addon instanceof Armor);
		assertEquals(armor, addon.armor);

		ArmorAddon addon2 = new MockArmorAddon(addon, 5);
	}

	@Test
	public void testCheckIsLive() throws ArmorException
	{
		Armor armor = new NormalArmor(5);
		ArmorAddon addon = new MockArmorAddon(armor, 2);

		assertTrue(addon.isLive());
		addon.updateTime(1);
		assertTrue(addon.isLive());
		addon.updateTime(2);
		assertFalse(addon.isLive());
	}
}
