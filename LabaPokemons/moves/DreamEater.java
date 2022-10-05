package moves;
import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
	int a;
	public DreamEater() {
	super(Type.PSYCHIC, 100, 100);
}
	
		
	@Override 
	protected void applyOppEffects(Pokemon p) {
		if (p.getCondition() == Status.SLEEP){
			this.a = ((int)(-((p.getStat(Stat.HP) - p.getHP()) / 2)));
	}
	}
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.HP, this.a);
	}
	@Override
	protected String describe() {
		return "does DreamEater";
	}	

}
