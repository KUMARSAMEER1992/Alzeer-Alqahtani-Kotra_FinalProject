package items.armor;

import environment.StringConstants;
import lifeform.Damage;

/**
 * This class contains Details of NormalArmor.
 * NormalArmor is an Armor.
 * @author Sameer Kumar Kotra
 */
public class NormalArmor implements Armor
{
	/**
	 * int to store the strength of the armor.
	 */
	private int armorStrength;

	/**
	 * @param armorStrength
	 */
	public NormalArmor(int armorStrength)
	{
		this.armorStrength = (armorStrength > 0) ? armorStrength : 0;
	}

	/**
	 * @return the character to be displayed on the map.
	 */
	@Override
	public char getChar()
	{
		return 'A';
	}

	/**
	 * @return the type of the item.
	 */
	@Override
	public String getItemType()
	{
		return StringConstants.ARMOR;
	}

	/**
	 * calculates the remaining damage after Armor absorbs the damage.
	 * @param damage : original damage.
	 * @return the reduced damage.
	 */
	@Override
	public Damage reduceDamage(Damage damage)
	{
		int temp = damage.getDamagePoints() - armorStrength;
		temp = (temp > 0) ? temp : 0;
		damage.setDamagePoints(temp);
		return damage;
	}

}
