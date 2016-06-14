package items;

import environment.MapItem;

/**
 * This class contains details of Key.
 * Key is a MapItem.
 * @author Sameer Kumar Kotra
 */
public class Key implements MapItem
{
	// TODO
	public static final String KEY = "KEY";
	/**
	 * int to store the number of keys.
	 */
	private int keys;

	/**
	 * Creates Key object with given number of keys.
	 * @param keys : no of keys.
	 */
	public Key(int keys)
	{
		this.keys = (keys > 0) ? keys : 0;
	}

	/**
	 * @return the character to be displayed on the map.
	 */
	@Override
	public char getChar()
	{
		return 'K';
	}

	/**
	 * @return the type of the item.
	 */
	@Override
	public String getItemType()
	{
		return KEY;
	}

	/**
	 * @return no of keys.
	 */
	public int getKeys()
	{
		return this.keys;
	}

}
