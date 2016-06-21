package items.potion;
/**
 * Mock class to create PotionAddon.
 * @author Dalal Alzeer
 *
 */
public class MockPotionAddon extends PotionAddon
{
	/**
	 * create instance
	 * @param potion
	 */
	public MockPotionAddon(Potion potion)
	{
		super(potion);
		
	}
	/**
	 * get potion detail
	 */
	@Override
	public PotionDetails getDetails() 
	{
		return null;
	}
	/**
	 * get character to be displayed in GUI
	 */
	@Override
	public char getChar() 
	{
		return 0;
	}

}
