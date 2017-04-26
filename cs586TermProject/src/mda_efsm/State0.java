package mda_efsm;

public class State0 extends State{

	private MDA mda;
	
	public State0(MDA mda){
		this.mda = mda;
	}
	
	public void start(){
		//TODO: PayMsg
		
		mda.changeState(1);
	}
}
