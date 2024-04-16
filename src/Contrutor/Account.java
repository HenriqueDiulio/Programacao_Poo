package Contrutor;

public class Account {
	private String name;
	private double saldo;
	
	public Account(String name) {
		this.name = "Nome aleatorio";
	}
	public Account(String name, double saldo) {
		this.name=name;
		if(saldo == 0.0) {
			this.saldo=saldo;
		}
		
	}
	   
    public void setName(String name){
    	// aqui ele vai setar um valor a variavel name
        this.name = name.trim();
    }
    public String getName(){
        return name;
    }
}
