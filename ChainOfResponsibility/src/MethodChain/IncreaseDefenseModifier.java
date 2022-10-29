package MethodChain;

public class IncreaseDefenseModifier extends CreatureModifier{

	public IncreaseDefenseModifier(Creature creature) {
		super(creature);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handle() {
		System.out.println("Increaseing "+ creature.name + "'s defense");
		creature.defense +=3;
		super.handle();
	}

}
