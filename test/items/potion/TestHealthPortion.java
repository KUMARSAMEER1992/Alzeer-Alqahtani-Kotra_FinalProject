package items.potion;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.MapItem;

public class TestHealthPortion 
{

	@Test
	public void testInitialization() 
	{
		HealthPortion hp=new HealthPortion();
		assertTrue(hp instanceof MapItem);
	}

}
