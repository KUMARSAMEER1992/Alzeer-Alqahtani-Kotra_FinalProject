package items.potion;

public class PotionDetails 
{
	private String type;
	private int healthPoints;
	
	public PotionDetails(String ptype,int points)
	{
		 type= ptype; 
		 healthPoints=points;
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
