package weapon;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
/**
 * The test cases for Attachments class.
 * @author Dalal Alzeer
 */
public class TestAttachments {
	
	/**
	 * The test cases for each attachment.
	 */
	
	@Test
	public void test() 
	{
		//Test Maces
		Maces mace = new Maces();
		Attachments a=new Attachments(mace);
		assertEquals(10,a.attachmentDamage);
		//Test Swords
		Swords s=new Swords();
		Attachments a1=new Attachments(s);
		assertEquals(25,a1.attachmentDamage);
		//Test Spears
		Spears sp=new Spears();
		Attachments a2=new Attachments(sp);
		assertEquals(17,a2.attachmentDamage);
	}
	

}
