package items.potion;

import environment.MapItem;

public interface Potion extends MapItem
{
	public static final String PORTION="PORTION";
	public PotionDetails getDetails();

}
