package classesWithAttributes;


public class Product {
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	
	public Product(String name, String description){
		this(2,name,description,1,3,"deniz");
	}
	
	public Product() {
		/*
		 * this.id = 0; this.name ="bilgi yok"; this.description= "bilgi yok";
		 * this.price = 0; this.stockAmount = 0; this.kod = "bilgi yok";
		 */
		this(0,"bilgi yok","Bilgi yok",4500,3,"deniz");
		
	}
	
	public Product(int id, String name,String description,double price,int stockAmount,String kod) {
		this.id = id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount =stockAmount;
		this.kod =kod;
	}
	
	


	
	public void showInfos() {
		System.out.println("bu değer :"+ this.description + " " + this.price);
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// *****************
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// **********************

	public String getDescpition() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	//********************************

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the stockAmount
	 */
	public int getStockAmount() {
		return stockAmount;
	}

	/**
	 * @param stockAmount the stockAmount to set
	 */
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	/**
	 * @return the kod
	 */
	public String getKod() {
		return kod;
	}

	/**
	 * @param kod the kod to set
	 */
	public void setKod(String kod) {
		this.kod = kod;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	

}
