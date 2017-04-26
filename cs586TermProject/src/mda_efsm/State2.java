package mda_efsm;

public class State2 extends State{

	private MDA mda;
	
	public State2(MDA mda){
		this.mda = mda;
	}
	
	public void approve(){
		//TODO: Display Menu		
		
		mda.changeState(3);
	}
	public void reject(){
		//TODO: Reject message
		
		mda.changeState(0);
	}
}
