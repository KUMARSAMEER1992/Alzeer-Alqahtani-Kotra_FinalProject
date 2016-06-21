package items.armor;

import environment.StringConstants;
import exception.ArmorException;
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
	 * @param details : Potion details to determine th eArmor type.
	 * @return the Armor created.
	 */
	public static Armor buildArmor(Armor armor, PotionDetails details)
	{
		if (armor == null)
		{
			armor = new NormalArmor(details.getHealthPoints());
		}
		else if (armor instanceof ArmorAddon)
		{
			armor = ((ArmorAddon) armor).armor;
		}
		if (details.getType().equals(StringConstants.ACID))
		{
			try
			{
				armor = new ArmorAcidAddon(armor);
			}
			catch (ArmorException e)
			{
			}
		}
		else if (details.getType().equals(StringConstants.POISON))
		{
			try
			{
				armor = new ArmorPosionAddon(armor);
			}
			catch (ArmorException e)
			{
			}
		}
		return armor;
	}

}
