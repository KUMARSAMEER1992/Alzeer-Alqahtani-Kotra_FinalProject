package items.armor;

import environment.StringConstants;
import exception.ArmorException;
import items.potion.PotionDetails;

/**
 * TODO
 * @author Sameer Kumar Kotra
 */
public class ArmorFactory
{

	/**
	 * @param armor
	 * @param details
	 * @return
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
