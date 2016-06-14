package items.potion;

public class HealthPortion implements Potion
{

	@Override
	public PotionDetails getDetails()
	{
		PotionDetails pd = new PotionDetails(PotionDetails.HEALTH, 10);
		return pd;
	}

	public char getChar()
	{
		return 'H';
	}

	public String getItemType()
	{
		return POTION;
	}

}
