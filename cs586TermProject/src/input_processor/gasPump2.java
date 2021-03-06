package input_processor;

import data_store.DataStore2;
import mda_efsm.MDA;

public class gasPump2 {

	private MDA mda;
	private DataStore2 ds;
	
	public gasPump2(){
		mda = new MDA();
	}
	
	public void setDataStore(DataStore2 ds){
		this.ds = ds;
	}
	
	public void activate(int a, int b, int c){
		if (a > 0 && b > 0 && c > 0){
			ds.setA(a);
			ds.setB(b);
			ds.setC(c);
			mda.activate();
		}
	}
	
	public void start(){
		mda.start();
	}
	
	public void payCash(float c){
		if (c > 0){
			ds.setCash(c);
			mda.payType(2);
		}
	}
	public void cancel(){
		mda.cancel();
	}
	public void Super(){
		mda.selectGas(2);
	}
	public void premium(){
		mda.selectGas(3);
	}
	public void regular(){
		mda.selectGas(1);
	}
	public void startPump(){
		mda.startPump();
	}
	public void pumpLiter(){
		if(ds.getCash() < ((ds.getL()+1)*ds.getPrice())){
			mda.stopPump();
		} else {
			mda.pump();
		}
	}
	public void stop(){
		mda.stopPump();
	}
	public void receipt(){
		mda.receipt();
	}
	public void noReceipt(){
		mda.noReceipt();
	}
}
