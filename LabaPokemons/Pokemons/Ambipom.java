package Pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Ambipom extends Pokemon{
	public Ambipom  (String name, int level) {
		super(name,level);
		super.setType(Type.NORMAL);
		super.setStats(75,100,66,60,66,115);
		super.setMove(new TailWhip(), new Scratch(),new Screech(), new DualChop());
	}
}
