package input_processor;

import mda_efsm.MDA;
import mda_efsm.DataStore;

public class gasPump1 {

	private MDA mda;
	private DataStore ds;
	
	public gasPump1(){
		this.mda = new MDA();
	}
	
	public void setDataStore(DataStore ds){
		this.ds = ds;
	}
	
	public void activate(float a, float b){
		
	}
	public void start(){
		mda.start();
	}
	public void payCredit(){
		mda.payType(1);
	}
	public void reject(){
		mda.reject();
	}
	public void cancel(){
		mda.cancel();
	}
	public void approve(){
		mda.approve();
	}
	public void Super(){
		mda.selectGas(2);
	}
	public void regular(){
		mda.selectGas(1);
	}
	public void startPump(){
		mda.startPump();
	}
	public void pumpGallon(){
		mda.pump();
	}
	public void stopPump(){
		mda.stopPump();
		mda.receipt();
	}
	
}
