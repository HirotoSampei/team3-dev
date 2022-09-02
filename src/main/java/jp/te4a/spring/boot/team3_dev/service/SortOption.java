package jp.te4a.spring.boot.team3_dev.service;

import java.util.Date;

public class SortOption {

	String machine_id;      	//管理番号
	String name;				//品名
	String model_number;		//型番	
	String maker;				//メーカー	
	String spec;				//仕様	
	String purchase;				//購入日	(xxxx/xx/xx)
	int useful_life;			//耐用年数	
	String depreciation;		//減価償却	
	boolean availabilityBOOLEAN;//使用不能	
	boolean loanabilityBOOLEAN;	//貸出可能(〇×)
	String location;			//設置場所		
	String expiration_date;		//使用期限(～xxxx/xx/xx)
	
    //コンストラクタ
    public SortOption(String machine_id,String name,String model_number,String maker,String spec,
    		String purchase,int useful_life,String depreciation,boolean availabilityBOOLEAN,boolean loanabilityBOOLEAN,
    		String location,String expiration_date) {
    	
        this.machine_id = machine_id;
        this.name = name;
        this.model_number = model_number;
        this.maker = maker;
        this.spec = spec;
        this.purchase = purchase;
        this.useful_life = useful_life;
        this.depreciation = depreciation;
        this.availabilityBOOLEAN = availabilityBOOLEAN;
        this.loanabilityBOOLEAN = loanabilityBOOLEAN;
        this.location = location;
        this.expiration_date = expiration_date;
        
    }

	    //管理番号
	    public String getmachine_id(){
	        return this.machine_id;
	    }    
	    public void setmachine_id(String machine_id)
	    {
	    	this.machine_id = machine_id;
	    }
	        
	    //品名
	    public String getname(){
	        return this.name;
	    }
	    public void setname(String name)
	    {
	    	this.name = name;
	    }
	    
	    //型番	
	    public String getmodel_number(){
	        return this.model_number;
	    }
	    public void setmodel_number(String model_number)
	    {
	    	this.model_number = model_number;
	    }
	    
	    //メーカー	
	    public String getmaker(){
	        return this.maker;
	    }
	    public void setmaker(String maker)
	    {
	    	this.maker = maker;
	    }
	    
	    //仕様	
	    public String getspec(){
	        return this.spec;
	    }
	    public void setspec_number(String spec)
	    {
	    	this.spec = spec;
	    }
	    
	    //購入日	(xxxx/xx/xx)
	    public String getpurchase(){
	        return this.purchase;
	    }
	    public void setpurchase(String purchase)
	    {
	    	this.purchase = purchase;
	    }
	    
	    //耐用年数	
	    public int getuseful_life(){
		        return this.useful_life;
		}
	    public void setmodel_number(int useful_life)
	    {
	    	this.useful_life = useful_life;
	    }
	    
	    //減価償却	
	    public String getdepreciation(){
	        return this.depreciation;
	    }
	    public void setdepreciation(String depreciation)
	    {
	    	this.depreciation = depreciation;
	    }
	    
	    //使用不能	
	    public boolean getavailabilityBOOLEAN(){
	        return this.availabilityBOOLEAN;
	    }
	    public void setavailabilityBOOLEAN(boolean availabilityBOOLEAN)
	    {
	    	this.availabilityBOOLEAN = availabilityBOOLEAN;
	    }
	    
	    //貸出可能(〇×)
	    public boolean getloanabilityBOOLEAN(){
	        return this.loanabilityBOOLEAN;
	    }
	    public void setloanabilityBOOLEAN(boolean loanabilityBOOLEAN)
	    {
	    	this.loanabilityBOOLEAN = loanabilityBOOLEAN;
	    }
	    
	    //設置場所
	    public String getlocation(){
	        return this.location;
	    }
	    public void setlocation(String location)
	    {
	    	this.location = location;
	    }
	    
	    //使用期限(～xxxx/xx/xx)
		public String getexpiration_date(){
	        return this.expiration_date;
		}
	    public void setexpiration_date(String expiration_date)
	    {
	    	this.expiration_date = expiration_date;
	    }
	    
}