package weapon;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestAttachments {

	
	@Test
	public void test() 
	{
		Maces mace = new Maces();
		Attachments a=new Attachments(mace);
		assertEquals(10,a.attachmentDamage);
		Swords s=new Swords();
		Attachments a1=new Attachments(s);
		assertEquals(25,a1.attachmentDamage);
		Spears sp=new Spears();
		Attachments a3=new Attachments(sp);
		assertEquals(17,a3.attachmentDamage);
	}
	

}
