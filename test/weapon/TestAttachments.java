package weapon;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
/**
 * The test cases for Attachments class.
 * @author Dalal Alzeer
 */
public class TestAttachments 
{
	/**
	 * test Mace attachment.
	 */
	@Test
	public void testMace() 
	{
		//Test mace attachment after calculate base damage of mace
		Maces mace = new Maces();
		Attachments a=new Attachments(mace);
		assertEquals(10,a.attachmentDamage);
	}
	/**
	 * test Sword attachment.
	 */
	@Test
	public void testSword() 
	{
		//Test Sword attachment after calculate base damage of Sword
		Swords sword=new Swords();
		Attachments a1=new Attachments(sword);
		assertEquals(25,a1.attachmentDamage);
	}
	/**
	 * test Spear attachment.
	 */
	@Test
	public void testSpear() 
	{
		//Test Spear attachment after calculate base damage of Spear
		Spears spear=new Spears();
		Attachments a2=new Attachments(spear);
		assertEquals(17,a2.attachmentDamage);
	}
	

}
