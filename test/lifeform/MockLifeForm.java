package lifeform;

/**
 * @author Sameer Kumar Kotra
 */
public class MockLifeForm extends LifeForm
{

	public MockLifeForm(String name, int points)
	{
		super(name, points);
	}

	public MockLifeForm(String name, int points, int strength)
	{
		super(name, points, strength);
	}

	@Override
	public void takeHit(Damage damage)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public char getChar()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getItemType()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
