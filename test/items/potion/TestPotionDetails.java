package items.potion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPotionDetails 
{

	@Test
	public void test() 
	{
		PotionDetails pd=new PotionDetails("Helth",10);
		assertEquals("Helth",pd.getType());
		assertEquals(10,pd.getHealthPoints());
		
	}

}
