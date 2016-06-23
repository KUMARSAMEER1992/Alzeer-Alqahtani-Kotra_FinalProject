package items.armor;

import environment.StringConstants;
import items.potion.PotionDetails;

/**
 * Creates the Armor.
 * @author Sameer Kumar Kotra
 */
public class ArmorFactory
{

	/**
	 * Builds the Armor from the given details.
	 * @param armor : Player armor if present.
	 * @param details : Potion details to determine the Armor type.
	 * @return the Armor created.
	 */
	public static ArmorAddon buildArmor(Armor armor, PotionDetails details)
	{
		ArmorAddon temp = null;
		if (armor == null)
		{
			armor = new NormalArmor(3);
		}
		else if (armor instanceof ArmorAddon)
		{
			armor = ((ArmorAddon) armor).armor;
		}
		try
		{
			if (details != null && details.getType().equals(StringConstants.ACID))
			{
				temp = new ArmorAcidAddon(armor);
			}
			else if (details != null && details.getType().equals(StringConstants.POISON))
			{
				temp = new ArmorPosionAddon(armor);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return temp;
	}

}
