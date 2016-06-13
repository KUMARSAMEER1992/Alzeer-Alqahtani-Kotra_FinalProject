package player;

import static org.junit.Assert.*;


import org.junit.Test;

import environment.MapItem;

public class TestAcid 
{

	@Test
	public void test() 
	{
		Creature normal1= new NormalCreature("p",30);
		Creature normal2= new NormalCreature("p",50);
		Ability acid1 = new Acid(normal1);
		Ability acid2 = new Acid(normal2);
		assertTrue(acid1 instanceof MapItem);
		acid1.attack(acid2);
		assertEquals(45,acid2.getCurrentLifePoints());	
	}

}
