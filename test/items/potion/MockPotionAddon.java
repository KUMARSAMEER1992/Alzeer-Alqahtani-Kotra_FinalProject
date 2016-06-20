package items.potion;
/**
 * Mock class to create PotionAddon.
 * @author Dalal Alzeer
 *
 */
public class MockPotionAddon extends PotionAddon
{

	public MockPotionAddon(Potion potion)
	{
		super(potion);
		
	}

	@Override
	public PotionDetails getDetails() 
	{
		
		return null;
	}

	@Override
	public char getChar() 
	{
		
		return 0;
	}

}
