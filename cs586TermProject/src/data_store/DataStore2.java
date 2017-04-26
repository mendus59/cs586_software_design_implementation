package data_store;

public class DataStore2 {

	private int temp_a;
	private int temp_b;
	private int temp_c;
	private float temp_cash;
	
	private float cash;
	private int L;
	private float price;
	
	public DataStore2(){}
	
	public int getA(){
		return this.temp_a;
	}
	public int getB(){
		return this.temp_b;
	}
	public int getC(){
		return this.temp_c;
	}
	public float getTempCash(){
		return this.temp_cash;
	}
	
	public float getCash(){
		return this.cash;
	}
	public int getL(){
		return this.L;
	}
	public float getPrice(){
		return this.price;
	}
	
	public void setA(int a){
		this.temp_a = a;
	}
	public void setB(int b){
		this.temp_b = b;
	}
	public void setC(int c){
		this.temp_c = c;
	}
	public void setTempCash(float cash){
		this.temp_cash = cash;
	}
	public void setCash(float cash){
		this.cash = cash;
	}
	public void setL(int L){
		this.L = L;
	}
	public void setPrice(float price){
		this.price = price;
	}
}
