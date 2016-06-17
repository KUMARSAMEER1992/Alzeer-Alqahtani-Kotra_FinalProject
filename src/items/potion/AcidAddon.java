package items.potion;

import environment.StringConstants;

public class AcidAddon extends PotionAddon
{

	/**
	 * @param potion
	 */
	public AcidAddon(Potion potion)
	{
		super(potion);
	}

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
