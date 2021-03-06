package input_processor;

import data_store.DataStore1;
import mda_efsm.MDA;

public class gasPump1 {

	private MDA mda;
	private DataStore1 ds;
	
	public gasPump1(){
		this.mda = new MDA();
	}
	
	public void setDataStore(DataStore1 ds){
		this.ds = ds;
	}
	
	public void activate(float a, float b){
		if (a > 0 && b > 0){
			ds.setA(a);
			ds.setB(b);
			mda.activate();
		}
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
