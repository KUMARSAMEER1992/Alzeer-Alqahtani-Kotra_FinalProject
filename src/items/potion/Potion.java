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

}
