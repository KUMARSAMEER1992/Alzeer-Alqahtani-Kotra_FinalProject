package items.potion;

import environment.StringConstants;

/**
 * This class contains Health Potion's details 
 * @author Dalal Alzeer
 */
public class HealthPotion implements Potion
{
	
	protected int healthPoints;
	/**
	 * HealthPotion instance with default value
	 */
	public HealthPotion() 
	{
		healthPoints=10;
	}
	/**
	 *@return Health Potion's details  
	 */
	@Override
	public PotionDetails getDetails()
	{
		PotionDetails pd = new PotionDetails(StringConstants.HEALTH, healthPoints);
		return pd;
	}
	/**
	 * @return the character that displayed in the map
	 */
	public char getChar()
	{
		return 'H';
	}
	/**
	 * @return the type of the item.
	 */
	public String getItemType()
	{
		return StringConstants.POTION;
	}

}
