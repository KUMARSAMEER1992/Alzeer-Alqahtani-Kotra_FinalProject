package items.armor;

import lifeform.Damage;

/**
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

	@Override
	public char getChar()
	{
		return 'N';
	}

	@Override
	public String getItemType()
	{
		return "ARMOR";
	}

	@Override
	public Damage reduceDamage(Damage damage)
	{
		int temp = damage.getDamagePoints() - armorStrength;
		temp = (temp > 0) ? temp : 0;
		damage.setDamagePoints(temp);
		return damage;
	}

}
