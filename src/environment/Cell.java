package environment;

/**
 * This class contains contains details of Cell.
 * @author Sameer Kumar Kotra
 */
public class Cell
{

	/**
	 * MapItem to store items in the cell.
	 */
	private MapItem mapItem;

	/**
	 * Creates a Cell with no item.
	 */
	public Cell()
	{
		mapItem = null;
	}

	/**
	 * @return Map item in the Cell. returns NULL if no item is present.
	 */
	public MapItem getMapItem()
	{
		return this.mapItem;
	}

	/**
	 * Stores the MapItem in the cell.
	 * @param item : Item to be stored.
	 * @return true is added. false if Cell contains another item..
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
	 * Removes the MapItem in the Cell.
	 * @return the Map Item present in the Cell.
	 */
	public MapItem removeMapItem()
	{
		MapItem temp = mapItem;
		mapItem = null;
		return temp;
	}

}
