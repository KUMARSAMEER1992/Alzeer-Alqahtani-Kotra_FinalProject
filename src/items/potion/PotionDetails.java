package items.potion;

public class PotionDetails
{
	public static final String HEALTH = "HEALTH";
	public static final String POISON = "POISON";
	public static final String ACID = "ACID";
	private String type;
	private int healthPoints;

	public PotionDetails(String ptype, int points)
	{
		type = ptype;
		healthPoints = points;
	}

	public String getType()
	{
		return type;
	}

	public int getHealthPoints()
	{
		return healthPoints;
	}
}
