package items.potion;

import environment.StringConstants;

/**
 * This class contains Poison Addon's details 
 * @author Dalal Alzeer
 */
public class PoisonAddon extends PotionAddon
{
	/**
	 * @param potion
	 */
	public PoisonAddon(Potion potion)
	{
		super(potion);
	}

	
	/**
	 *@return Poison Addon's details  
	 */
	public PotionDetails getDetails()
	{
		PotionDetails pd = new PotionDetails(StringConstants.POISON, 20);
		return pd;
	}
	/**
	 * @return the character that displayed in the map
	 */
	@Override
	public char getChar()
	{
		return 'O';
	}

}
