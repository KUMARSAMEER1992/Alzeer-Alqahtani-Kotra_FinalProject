package items.potion;

public abstract class PotionAddon implements Potion
{ 
	protected Potion potion;
	
	public abstract char getChar();
	public  String getItemType()
	{
		return "Potion";
	}
}
