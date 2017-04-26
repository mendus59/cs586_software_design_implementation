package mda_efsm;

public class State4 extends State{

	private MDA mda;
	
	public State4(MDA mda){
		this.mda = mda;
	}
	
	public void startPump(){
		//TODO: Set Initial Values
		//TODO: Ready Msg
		
		mda.changeState(5);
	}
}
