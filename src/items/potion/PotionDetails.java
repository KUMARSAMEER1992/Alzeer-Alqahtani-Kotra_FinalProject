package items.potion;
/**
 * This class has the detail for each potion type
 * @author Dalal Alzeer
 */
public class PotionDetails
{

	private String type;
	private int healthPoints;
	/**
	 * create an instance to store potion type and points.
	 * @param ptype
	 * @param points
	 */
	public PotionDetails(String ptype, int points)
	{
		type = ptype;
		healthPoints = points;
	}
	/**
	 * @return potion type
	 */
	public String getType()
	{
		return type;
	}
	/**
	 * @return health Points
	 */
	public int getHealthPoints()
	{
		return healthPoints;
	}
}
