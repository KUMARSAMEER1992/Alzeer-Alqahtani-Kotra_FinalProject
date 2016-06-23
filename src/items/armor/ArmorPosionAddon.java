package items.armor;

import environment.StringConstants;
import exception.ArmorException;
import lifeform.Damage;

/**
 * PosionAddon for Armor.
 * PosionAddon is an ArmorAddon.
 * @author Sameer Kumar Kotra
 */
public class ArmorPosionAddon extends ArmorAddon
{

	/**
	 * Creates an PosionAddon with give armor.
	 * Has max Rounds 15.
	 * @param armor : Armor to which add on to be added.
	 * @throws ArmorException if we try to add ArmorAddon to a ArmorAddon.
	 */
	public ArmorPosionAddon(Armor armor) throws ArmorException
	{
		super(armor, 15);
	}

	/**
	 * calculates the remaining damage after Armor absorbs the damage.
	 * @param damage : original damage.
	 * @return the reduced damage.
	 */
	@Override
	public Damage reduceDamage(Damage damage)
	{
		if (damage.getDamageType().equals(StringConstants.POISON))
		{
			damage.setDamagePoints(0);
			return damage;
		}
		else
		{
			return armor.reduceDamage(damage);
		}
	}

	/**
	 * @return the character to be displayed on the map.
	 */
	@Override
	public char getChar()
	{
		return 'O';
	}

}
