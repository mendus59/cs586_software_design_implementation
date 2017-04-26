package mda_efsm;

public abstract class State {
	
	public void activate(){}
	public void start(){}
	public void payType(int t){}
	public void reject(){}
	public void approve(){}
	public void cancel(){}
	public void selectGas(int g){}
	public void startPump(){}
	public void pump(){}
	public void stopPump(){}
	public void receipt(){}
	public void noReceipt(){}
}
