package items.potion;

import environment.StringConstants;

public class HealthPortion implements Potion
{

	@Override
	public PotionDetails getDetails()
	{
		PotionDetails pd = new PotionDetails(StringConstants.HEALTH, 10);
		return pd;
	}

	public char getChar()
	{
		return 'H';
	}

	public String getItemType()
	{
		return StringConstants.POTION;
	}

}
