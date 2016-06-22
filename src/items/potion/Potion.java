package items.potion;
import environment.MapItem;
/**
 * Interface for potion
 * @author Dalal Alzeer
 */
public interface Potion extends MapItem
{
	/**
	 * @return Potion's Details
	 */
	public PotionDetails getDetails();
	/**
	 * @return the character that displayed in the map
	 */
	public char getChar();
	/**
	 * @return the type of the item.
	 */
	public String getItemType();

}
