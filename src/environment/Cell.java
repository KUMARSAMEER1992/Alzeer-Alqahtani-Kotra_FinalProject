package environment;

/**
 * @author Sameer Kumar Kotra
 */
public class Cell
{

	private MapItem mapItem;

	public Cell()
	{
		mapItem = null;
	}

	/**
	 * @return
	 */
	public MapItem getMapItem()
	{
		return this.mapItem;
	}

	/**
	 * @param item
	 */
	public boolean addMapItem(MapItem item)
	{
		if (mapItem == null)
		{
			mapItem = item;
			return true;
		}
		return false;
	}

	/**
	 * @return
	 */
	public MapItem removeMapItem()
	{
		MapItem temp = mapItem;
		mapItem = null;
		return temp;
	}

}
