package items.potion;

import environment.StringConstants;

/**
 * This class contains Acid Addon details 
 * @author Dalal Alzeer
 */
public class AcidAddon extends PotionAddon
{

	/**
	 * @param potion
	 */
	public AcidAddon(Potion potion)
	{
		super(potion);
	}

	/**
	 *@return Acid Addon's details  
	 */
	public PotionDetails getDetails()
	{
		PotionDetails pd = new PotionDetails(StringConstants.ACID, 15);
		return pd;
	}
	/**
	 * @return the character that displayed in the map
	 */
	@Override
	public char getChar()
	{
		return 'A';
	}

}
