package mda_efsm;

public class State3 extends State{

	private MDA mda;
	
	public State3(MDA mda){
		this.mda = mda;
	}
	
	public void cancel(){
		//TODO: CancelMsg
		//TODO: ReturnCash
		
		mda.changeState(0);
	}
	public void selectGas(int g){
		//TODO: SetPrice(g)
		
		mda.changeState(4);
	}
}
