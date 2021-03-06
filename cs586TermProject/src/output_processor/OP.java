package output_processor;

import data_store.DataStore;

public class OP {

	private CancelMsg cancelMsg;
	private DisplayMenu displayMenu;
	private GasPumpedMsg gasPumpedMsg;
	private PayMsg payMsg;
	private PrintReceipt printReceipt;
	private PumpGasUnit pumpGasUnit;
	private ReadyMsg readyMsg;
	private RejectMsg rejectMsg;
	private ReturnCash returnCash;
	private SetInitialValues setInitialValues;
	private SetPrice setPrice;
	private StopMsg stopMsg;
	private StoreCash storeCash;
	private StoreData storeData;
	
	private DataStore ds;
	
	public void cancelMsg(){
		cancelMsg.action();
	}
	public void displayMenu(){
		displayMenu.action();
	}
	public void gasPumpedMsg(){
		gasPumpedMsg.action();
	}
	public void payMsg(){
		payMsg.action();
	}
	public void printReceipt(){
		printReceipt.action();
	}
	public void pumpGasUnit(){
		pumpGasUnit.action();
	}
	public void readyMsg(){
		readyMsg.action();
	}
	public void rejectMsg(){
		rejectMsg.action();
	}
	public void returnCash(){
		returnCash.action();
	}
	public void setInitialValues(){
		setInitialValues.action();
	}
	public void setPrice(){
		setPrice.action();
	}
	public void stopMsg(){
		stopMsg.action();
	}
	public void storeCash(){
		storeCash.action();
	}
	public void storeData(){
		storeData.action();
	}
	
	public void setCancelMsg(CancelMsg action){
		this.cancelMsg = action;
	}
	public void setDisplayMenu(DisplayMenu action){
		this.displayMenu = action;
	}
	public void setGasPumpedMsg(GasPumpedMsg action){
		this.gasPumpedMsg = action;
	}
	public void setPayMsg(PayMsg action){
		this.payMsg = action;
	}
	public void setPrintReceipt(PrintReceipt action){
		this.printReceipt = action;
	}
	public void setPumpGasUnit(PumpGasUnit action){
		this.pumpGasUnit = action;
	}
	public void setReadyMsg(ReadyMsg action){
		this.readyMsg = action;
	}
	public void setRejectMsg(RejectMsg action){
		this.rejectMsg = action;
	}
	public void setReturnCash(ReturnCash action){
		this.returnCash = action;
	}
	public void setSetInitialValues(SetInitialValues action){
		this.setInitialValues = action;
	}
	public void setSetPrice(SetPrice action){
		this.setPrice = action;
	}
	public void setStopMsg(StopMsg action){
		this.stopMsg = action;
	}
	public void setStoreCash(StoreCash action){
		this.storeCash = action;
	}
	public void setStoreData(StoreData action){
		this.storeData = action;
	}
}
