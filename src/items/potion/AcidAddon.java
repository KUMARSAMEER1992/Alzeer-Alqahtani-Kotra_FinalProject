package items.potion;

import environment.StringConstants;

public class AcidAddon extends PotionAddon
{

	public PotionDetails getDetails()
	{
		PotionDetails pd = new PotionDetails(StringConstants.ACID, 15);
		return pd;
	}

	@Override
	public char getChar()
	{
		return 'A';
	}

}
