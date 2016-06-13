package environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * @author Sameer Kumar Kotra
 */
public class TestEnvironment
{

	@Test
	public void testInitialization()
	{
		Environment environment1 = Environment.getWorldInstance();

		assertNull(environment1.getMapItem(0, 0));
		assertNull(environment1.getMapItem(4, 3));

		Environment environment2 = Environment.getWorldInstance();

		assertEquals(environment1, environment2);
	}
}
