package MethodChain;

public class NoBonusesModifier extends CreatureModifier {

	public NoBonusesModifier(Creature creature) {
		super(creature);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handle() {
		System.out.println("No bonuses for you!");
	}

}
