package weapon;
import lifeform.Damage;
/**
 * Attachment has common method to all Attachments.
 * @author Dalal Alzeer.
 */
public class Attachments implements Weapon
{
	/**
	 * Weapon to store the Weapon.
	 */
	protected Weapon weapon;
	int attachmentDamage;
	public Attachments(Weapon w)
	{
		weapon=w;
		if (weapon.getWeaponType().compareToIgnoreCase("Maces")==0)
		{
			attachmentDamage=weapon.getBaseDamage()+5;
		}
		else if (weapon.getWeaponType().compareToIgnoreCase("Swords")==0)
		{
			attachmentDamage=weapon.getBaseDamage()+15;
		}
		else if (weapon.getWeaponType().compareToIgnoreCase("Spears")==0)
		{
			attachmentDamage=weapon.getBaseDamage()+10;
		}
	}
	
	/**
	 * @return the base damage of the weapon.
	 */
	@Override
	public int getBaseDamage()
	{
		return weapon.getBaseDamage();
	}
	/**
	 * Calculates the damage.
	 * @return the damage caused by the weapon.
	 */
	@Override
	public Damage calculateDamage()
	{
		Damage damage=new Damage("W",attachmentDamage);
		return damage;
	}
	
	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getItemType()
	{
		
		return "Weapon";
	}
	

	@Override
	public String getWeaponType() 
	{
			return weapon.getWeaponType();
	}

}
