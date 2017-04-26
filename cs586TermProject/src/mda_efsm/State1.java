package mda_efsm;

public class State1 extends State{

	private MDA mda;
	
	public State1(MDA mda){
		this.mda = mda;
	}
	
	public void payType(int t){
		if (t == 1){
			mda.changeState(2);
		} else if (t == 2){
			//TODO: Store cash
			//TODO: Display Menu
			
			mda.changeState(3);
		}
	}
}
