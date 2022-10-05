package Pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class NidoranF extends Pokemon{
	public NidoranF (String name,int level) {
		super(name,level);
		super.setType(Type.POISON);
		super.setStats(55,47,52,40,40,41);
		super.setMove(new Rest(), new Scratch());
	}
}