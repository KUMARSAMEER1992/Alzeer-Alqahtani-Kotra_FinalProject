package items.potion;

import environment.MapItem;

public interface Potion extends MapItem
{
	public static final String POTION="POTION";
	public PotionDetails getDetails();

}
