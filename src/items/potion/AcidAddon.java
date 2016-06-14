package items.potion;

public class AcidAddon extends PotionAddon
{

	public PotionDetails getDetails()
	{
		PotionDetails pd = new PotionDetails(PotionDetails.ACID, 15);
		return pd;
	}

	@Override
	public char getChar()
	{
		return 'A';
	}

}
