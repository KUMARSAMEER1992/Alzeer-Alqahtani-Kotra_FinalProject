package player;


import weapon.Weapon;
import items.armor.Armor;
import lifeform.Damage;
import lifeform.LifeForm;

public class Player extends LifeForm 
{
	private static Player player;
	private Weapon weapon;
	private Armor armor;
	private Damage damage;
	static int Strength;

	
	private Player(String name, int points)
	{
		super(name,points);
		
	}
	public static Player getPlayer()
	{
		if (player == null)
			player = new Player("bob",50);
			Strength=5;

		return player;
	}
	@Override
	public char getChar() {
		
		return 'P';
	}
	@Override
	public String getItemType() {
		return "Player";
	}
	@Override
	public void takeHit(Damage damage)
	{
			int newDamage;
			if(armor!=null)
			{
				damage=armor.reduceDamage(damage);
			}
			if (damage.getDamagePoints() > 0)
			{
				newDamage=damage.getDamagePoints();
				if (newDamage > 0)
				{
					currentLifePoints=currentLifePoints-newDamage;
					if(currentLifePoints < 0) 
						currentLifePoints=0;
				}
			}
		
	}
	public int getAttachStrength()
	{
		return Strength;
	}
	
	static void resetInstance()
	{
		player = null;
	}
	@Override
	public Damage calculateDamage() 
	{
		if (weapon == null)
		{
			Damage damage=new Damage("Player",getAttachStrength());
			return damage;
		}
		else 
		{
			return weapon.calculateDamage();
		}
	}
	public void pickUp(Weapon weapon)
	{
		if (this.weapon == null)
		{
			this.weapon = weapon;
		}
	}

	
	public Weapon getWeapon()
	{
		return weapon;
	}



}
