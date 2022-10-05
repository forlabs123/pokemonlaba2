package Pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nidoqeen extends Pokemon{
	public Nidoqeen(String name, int level) {
		super (name,level);
		super.setType(Type.POISON,Type.GROUND);
		super.setStats(90,92,87,75,85,76);
		super.setMove(new Scratch(), new Rest(), new FurySwipes(), new Bulldoze());
	}

}
