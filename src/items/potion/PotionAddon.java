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
	 * @return the character that displayed in the map
	 */
	public abstract char getChar();

	public PotionAddon(Potion potion)
	{
		this.potion=potion;
	}
	/**
	 * @return the type of the item.
	 */
	public String getItemType()
	{
		return StringConstants.POTION;
	}
}
