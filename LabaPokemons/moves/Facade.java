package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
	public Facade() {
		super(Type.NORMAL,70,100);
	}
	  @Override
	    protected void applyOppDamage(Pokemon d, double damage)
	    {
	        Status pokemonStatus = d.getCondition();
	        if (pokemonStatus.equals(Status.BURN) || pokemonStatus.equals(Status.POISON) || pokemonStatus.equals(Status.PARALYZE)){
	            d.setMod(Stat.HP, (int) Math.round(damage) * 2);
	        }
	    }
	@Override
	protected String describe() {
		return "does Facade";
	}	
}
