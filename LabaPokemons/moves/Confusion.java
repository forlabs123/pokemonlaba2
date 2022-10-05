package moves;

import ru.ifmo.se.pokemon.*;
import java.util.Random;

public class Confusion extends SpecialMove {
	public Confusion() {
			super(Type.PSYCHIC, 50, 100);
			
}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		Random rand1 = new Random();
        double numberChance = rand1.nextDouble();
        if (numberChance < (0.1)) {
        	Effect.confuse(p);
        }

	}
	
	@Override
	protected String describe() {
		return "does Confusion";
		}	
	

}
