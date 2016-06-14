package items.potion;

import environment.StringConstants;

public class PoisonAddon extends PotionAddon
{
	public PotionDetails getDetails()
	{
		PotionDetails pd = new PotionDetails(StringConstants.POISON, 20);
		return pd;
	}

	@Override
	public char getChar()
	{
		return 'O';
	}

}
