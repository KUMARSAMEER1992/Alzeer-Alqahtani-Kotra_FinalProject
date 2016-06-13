package player;



public abstract class Ability extends Creature

{
	protected Creature creature;

	public Ability(String name, int points) {
		super(name, points);
		// TODO Auto-generated constructor stub
	}

	public Ability(Creature creature)
	{
		this.creature=creature;
	}
	public Ability()
	{
		
	}

	







}
