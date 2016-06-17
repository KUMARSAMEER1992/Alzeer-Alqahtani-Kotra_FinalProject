package items.potion;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * test cases for PotionDetails class
 * @author Dalal Alzeer
 */
public class TestPotionDetails 
{
	/**
	 * test get correct potion's type and points 
	 */
	@Test
	public void test() 
	{
		PotionDetails pd=new PotionDetails("Helth",10);
		assertEquals("Helth",pd.getType());
		assertEquals(10,pd.getHealthPoints());
	}

}
