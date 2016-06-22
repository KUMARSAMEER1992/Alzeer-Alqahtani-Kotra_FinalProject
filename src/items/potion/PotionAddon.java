package items.potion;

import environment.StringConstants;

/**
 * This class contains Potion Addon's details 
 * @author Dalal Alzeer
 */
public abstract class PotionAddon implements Potion
{
	protected Potion potion;

	/**
	 * create potionAddon instance
	 */
	public PotionAddon(Potion potion)
	{
		this.potion=potion;
	}
	/**
	 * @return Potion's Details
	 */
	public abstract PotionDetails getDetails();
	/**
	 * @return the character that displayed in the map
	 */
	public abstract char getChar();
	/**
	 * @return the type of the item.
	 */
	public String getItemType()
	{
		return StringConstants.POTION;
	}
	
}
