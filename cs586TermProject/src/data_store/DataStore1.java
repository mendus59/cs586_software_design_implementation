package data_store;

public class DataStore1 extends DataStore{

	private float temp_a;
	private float temp_b;
	
	public DataStore1(){}
	
	public float getA(){
		return this.temp_a;
	}
	public float getB(){
		return this.temp_b;
	}
	
	public void setA(float a){
		this.temp_a = a;
	}
	public void setB(float b){
		this.temp_b = b;
	}
	
}
