package items;

import environment.MapItem;

/**
 * @author Sameer Kumar Kotra
 */
public class Wall implements MapItem
{

	/**
	 * boolean to store the door information.
	 */
	private boolean door;
	/**
	 * boolean to store door state information.
	 */
	private boolean open;

	/**
	 * @param isDoor
	 */
	public Wall(boolean isDoor)
	{
		this.door = isDoor;
		this.open = false;
	}

	@Override
	public char getChar()
	{
		if (isDoor())
			return '|';
		else
			return '#';
	}

	@Override
	public String getItemType()
	{
		return "WALL";
	}

	/**
	 * @return
	 */
	public boolean isDoor()
	{
		return door;
	}

	/**
	 * @return
	 */
	public boolean isOpen()
	{
		return open;
	}

	/**
	 * 
	 */
	public void open()
	{
		open = true;
	}

}
