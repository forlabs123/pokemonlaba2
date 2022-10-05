package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends SpecialMove {
	public Rest() {
		super (Type.PSYCHIC,0,0);
	}
	@Override 
	protected void applySelfEffects(Pokemon p) {
		Effect e1 = new Effect().turns(2).condition(Status.SLEEP);
		Effect e = new Effect().turns(0).stat(Stat.HP,-99999);
		p.addEffect(e);
		p.setCondition(e1);
	}
	@Override
	protected String describe() {
		return "does Rest";
	}

}
