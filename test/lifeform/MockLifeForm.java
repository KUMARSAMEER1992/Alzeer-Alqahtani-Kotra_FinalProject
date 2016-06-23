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
		currentLifePoints -= damage.getDamagePoints();
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

	/*
	 * (non-Javadoc)
	 * @see lifeform.LifeForm#calculateDamage()
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage = new Damage("MockDamage", getAttachStrength());
		return damage;
	}

}
