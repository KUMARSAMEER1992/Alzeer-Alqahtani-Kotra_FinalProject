package items;

public class AcidAddon extends PotionAddon
{

	public PotionDetails getDetails() 
	{
		PotionDetails pd=new PotionDetails("Acid", 15);
		return pd;
	}
	@Override
	public char getChar() 
	{
		
		return 'A';
	}

}
