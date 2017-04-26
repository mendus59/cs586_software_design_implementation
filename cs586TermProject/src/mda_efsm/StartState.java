package mda_efsm;

public class StartState extends State{

	private MDA mda;
	
	public StartState(MDA mda){
		this.mda = mda;
	}
	
	public void activate(){
		//TODO: Store Data
		
		mda.changeState(0);
	}
	
}
