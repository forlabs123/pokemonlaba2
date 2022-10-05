package Pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Aipom extends Pokemon{
	public Aipom  (String name, int level) {
		super(name,level);
		super.setType(Type.NORMAL);
		super.setStats(55,70,55,40,55,85);
		super.setMove(new TailWhip(), new Scratch(), new Screech());
	}
}

