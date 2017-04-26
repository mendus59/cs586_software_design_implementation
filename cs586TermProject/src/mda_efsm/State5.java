package mda_efsm;

public class State5 extends State{

	private MDA mda;
	
	public State5(MDA mda){
		this.mda = mda;
	}
	
	public void pump(){
		//TODO: Pump Gas Unit
		//TODO: Gas Pumped Msg
	}
	public void stopPump(){
		//TODO: StopMsg
		
		mda.changeState(6);
	}
}
