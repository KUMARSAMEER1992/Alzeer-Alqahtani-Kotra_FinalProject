package items;

import environment.MapItem;

/**
 * @author Sameer Kumar Kotra
 */
public class Key implements MapItem
{
	/**
	 * int to store the number of keys.
	 */
	private int keys;

	/**
	 * @param keys
	 */
	public Key(int keys)
	{
		this.keys = (keys > 0) ? keys : 0;
	}

	@Override
	public char getChar()
	{
		return 'K';
	}

	@Override
	public String getItemType()
	{
		return "KEY";
	}

	/**
	 * @return no of keys.
	 */
	public int getKeys()
	{
		return this.keys;
	}

}
