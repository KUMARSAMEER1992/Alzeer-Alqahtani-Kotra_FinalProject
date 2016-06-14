package items.potion;

public class PoisonAddon extends PotionAddon
{
	public PotionDetails getDetails()
	{
		PotionDetails pd = new PotionDetails(PotionDetails.POISON, 20);
		return pd;
	}

	@Override
	public char getChar()
	{
		return 'O';
	}

}
