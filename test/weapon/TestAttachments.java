package weapon;
import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;
/**
 * The test cases for Attachments class.
 * @author Dalal Alzeer
 */
public class TestAttachments 
{
	/**
	 * test attachment initialization.
	 */
	@Test
	public void testInitialization() 
	{
		Attachments a=new MockAttachment();
		assertTrue(a instanceof MapItem);
		assertEquals("WEAPON",a.getItemType());
	}
	
}
