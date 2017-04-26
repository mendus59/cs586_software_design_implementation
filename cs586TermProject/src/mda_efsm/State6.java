package mda_efsm;

public class State6 extends State{

	private MDA mda;
	
	public State6(MDA mda){
		this.mda = mda;
	}
	
	public void receipt(){
		//TODO: Print receipt
		//TODO: Return Cash
		
		mda.changeState(0);
	}
	public void noReceipt(){
		//TODO: Return Cash
		
		mda.changeState(0);
	}
}
