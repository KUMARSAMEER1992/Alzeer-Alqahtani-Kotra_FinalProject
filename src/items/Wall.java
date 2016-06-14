package items;

import environment.MapItem;

/**
 * This class contains details of Wall. Wall can also be a Door;
 * Wall is a MapItem.
 * @author Sameer Kumar Kotra
 */
public class Wall implements MapItem
{

	// TODO
	public static final String WALL = "WALL";
	/**
	 * boolean to store the door information.
	 */
	private boolean door;
	/**
	 * boolean to store door state information.
	 */
	private boolean open;

	/**
	 * Creates a Wall object.
	 * @param isDoor specifies it is a door or a Wall.
	 */
	public Wall(boolean isDoor)
	{
		this.door = isDoor;
		this.open = false;
	}

	/**
	 * @return the character to be displayed on the map.
	 */
	@Override
	public char getChar()
	{
		if (isDoor())
			return '|';
		else
			return '#';
	}

	/**
	 * @return the type of the item.
	 */
	@Override
	public String getItemType()
	{
		return WALL;
	}

	/**
	 * @return true if the Wall is a door else returns false.
	 */
	public boolean isDoor()
	{
		return door;
	}

	/**
	 * @return true if the wall is door and is open else returns false.
	 */
	public boolean isOpen()
	{
		if (isDoor())
		{
			return open;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Opens the door is closed.
	 */
	public void open()
	{
		if (isDoor())
		{
			open = true;
		}
	}

}
