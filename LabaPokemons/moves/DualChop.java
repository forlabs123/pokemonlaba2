package moves;

import ru.ifmo.se.pokemon.*;

public class DualChop extends PhysicalMove{
	public DualChop() {
		super(Type.DRAGON,40,90);
		}
	@Override 
	protected void applyOppEffects(Pokemon p) {
		Effect e1 = new Effect().turns(2);
		p.addEffect(e1);
	}
	/*
	@Override
    protected void applyOppDamage(Pokemon d, double damage)
    {
        Status pokemonStatus = d.getCondition();
            d.setMod(Stat.HP, (int) Math.round(damage) * 2);
            }
            */
	@Override
	protected String describe() {
		return "does DualChop";
	}	
}
