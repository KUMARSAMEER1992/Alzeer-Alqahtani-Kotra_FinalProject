package player;


import lifeform.Damage;
import lifeform.LifeForm;

public class Player extends LifeForm 
{
	private static Player player;
	Damage damage;
	//private int baseDamege;
	int newDamage;
	
	private Player(String name, int points)
	{
		super(name,points);
		//baseDamege=10;
	}
	public static Player getPlayer()
	{
		if (player == null)
			player = new Player("bob",50);

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
			if (damage.getDamagePoints() > 0)
			{
				newDamage= damage.getDamagePoints()-0;
				if (newDamage > 0)
				{
					currentLifePoints=currentLifePoints-newDamage;
					if(currentLifePoints < 0) 
						currentLifePoints=0;
				}
			}
		
	}
	static void resetInstance()
	{
		player = null;
	}



}
