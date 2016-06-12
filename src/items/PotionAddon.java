package items;

public abstract class PotionAddon 
{ 
	protected Potion potion;
	
	public abstract char getChar();
	public  String getItemType()
	{
		return "Potion";
	}
}
