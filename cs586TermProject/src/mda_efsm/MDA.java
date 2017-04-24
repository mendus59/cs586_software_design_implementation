package mda_efsm;

public class MDA {

	public State[] states = new State[7];
	public State currentState;
	
	public MDA(){
		states[0] = new State0();
		states[1] = new State1();
		states[2] = new State2();
		states[3] = new State3();
		states[4] = new State4();
		states[5] = new State5();
		states[6] = new State6();
	}
	
	public void activate(){}
	public void start(){}
	public void payType(int t){}
	public void reject(){}
	public void cancel(){}
	public void approve(){}
	public void startPump(){}
	public void pump(){}
	public void stopPump(){}
	public void selectGas(int g){}
	public void receipt(){}
	public void noReceipt(){}
	
}
