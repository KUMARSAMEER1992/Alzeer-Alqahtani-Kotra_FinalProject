package items.potion;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test for PotionFactory class
 * @author Dalal Alzeer
 *
 */
public class TestPotionFactory 
{
	/**
	 * test create health potion
	 */
	@Test
	public void testCreateHealth() 
	{
		PotionFactory potionfactory=new PotionFactory();
		PotionDetails potionDetails=new PotionDetails("TEST",30);
		Potion potion=new HealthPotion();
		potion=potionfactory.createPotion("HEALTH");
		potionDetails=potion.getDetails();
		//get potion's type
		assertEquals("HEALTH", potionDetails.getType());
		//get health point
		assertEquals(10, potionDetails.getHealthPoints());	
	}
	
	/**
	 * test create acid
	 */
	@Test
	public void testCreateAcid() 
	{
		PotionFactory potionfactory=new PotionFactory();
		PotionDetails potionDetails=new PotionDetails("TEST",30);
		Potion potion=new HealthPotion();
		potion=potionfactory.createPotion("ACID");
		potionDetails=potion.getDetails();
		//get potion's type
		assertEquals("ACID", potionDetails.getType());
		//get health point
		assertEquals(15, potionDetails.getHealthPoints());	
	}
	/**
	 * test create poison
	 */
	@Test
	public void testCreatePoision() 
	{
		PotionFactory potionfactory=new PotionFactory();
		PotionDetails potionDetails=new PotionDetails("TEST",30);
		Potion potion=new HealthPotion();
		potion=potionfactory.createPotion("POISON");
		potionDetails=potion.getDetails();
		//get potion's type
		assertEquals("POISON", potionDetails.getType());
		//get health point
		assertEquals(20, potionDetails.getHealthPoints());	
	}

}
