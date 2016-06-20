package player;

import static org.junit.Assert.*;
import lifeform.Damage;

import org.junit.Test;

public class MockCreature extends Creature 
{

	public MockCreature(String name, int points) 
	{
		super(name, points);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}

	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void takeHit(Damage damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Damage calculateDamage() {
		// TODO Auto-generated method stub
		return null;
	}

}
