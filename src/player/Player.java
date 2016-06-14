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
	
	private Player(String name, int points, int Strength)
	{
		super(name,points,Strength);
		
	}
	public static Player getPlayer()
	{
		if (player == null)
			player = new Player("bob",50,5);

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
			this.damage=damage;
			if(armor!=null)
			{
				damage=armor.reduceDamage(damage);
			}
			if (damage.getDamagePoints() > 0)
			{ 
			
				currentLifePoints=currentLifePoints-damage.getDamagePoints();
					if(currentLifePoints < 0) 
						currentLifePoints=0;
				
			}
		
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
			Damage damage=new Damage("Player",super.getAttachStrength());
			return damage;
		}
		else 
		{
			return new Damage("Player",weapon.getBaseDamage());
		}
	}
	public void pickUp(Weapon weapon)
	{
		if (this.weapon == null)
		{
			this.weapon = weapon;
		}
	}

	public void drop()
	{
		
			this.weapon = null;
		
	}
	
	public Weapon getWeapon()
	{
		return weapon;
	}



}
