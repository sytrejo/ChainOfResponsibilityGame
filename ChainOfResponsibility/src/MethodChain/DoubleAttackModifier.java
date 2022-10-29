package MethodChain;

public class DoubleAttackModifier extends CreatureModifier {

	public DoubleAttackModifier(Creature creature) {
		super(creature);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handle() {
		System.out.print("Doubling " + creature.name + "'s attack");
		creature.attack *=2;
		super.handle();
	}

}
