/**
 * @author Sameer Kumar Kotra
 */
package items.armor;

import exception.ArmorException;
import lifeform.Damage;

/**
 * @author Sameer Kumar Kotra
 */
public class MockArmorAddon extends ArmorAddon
{

	/**
	 * @param armor
	 * @param maxRounds
	 * @throws ArmorException
	 */
	public MockArmorAddon(Armor armor, int maxRounds) throws ArmorException
	{
		super(armor, maxRounds);
	}

	@Override
	public Damage reduceDamage(Damage damage)
	{
		return damage;
	}

	@Override
	public char getChar()
	{
		return 0;
	}

}
