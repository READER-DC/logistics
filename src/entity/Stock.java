package entity;

import java.util.ArrayList;

public class Stock {
	private String skladName;
	private int itemCode;
	private String itemName;
	private int inReserve;
	private int allStock;
	private double cost;
	private int freeStock;
	private int inReserveForm;
	private double PCost;
	private int generalStock = allStock;
	private String relevance;
	private String arrival;
	private String subCategory;
	private String inDelivery;
	private String brand;
	
	public static ArrayList<Stock> arrayListStock = new ArrayList<Stock>();
	
	private Stock(String skladName, int itemCode, String itemName, int inReserve, int allStock, double cost, int freeStock,
			int inReserveForm, double pCost, int generalStock, String relevance, String arrival, String subCategory,
			String inDelivery, String brand) {
		super();
		this.skladName = skladName;
		this.itemCode = itemCode;
		this.itemName=itemName;
		this.inReserve = inReserve;
		this.allStock = allStock;
		this.cost = cost;
		this.freeStock = freeStock;
		this.inReserveForm = inReserveForm;
		PCost = pCost;
		this.generalStock = generalStock;
		this.relevance = relevance;
		this.arrival = arrival;
		this.subCategory = subCategory;
		this.inDelivery = inDelivery;
		this.brand = brand;
	}
	
	public static void createStock (String skladName, int itemCode, String itemName, int inReserve, int allStock, double cost, int freeStock,
			int inReserveForm, double pCost, int generalStock, String relevance, String arrival, String subCategory,
			String inDelivery, String brand)
	{
		Stock scSklad= new Stock( skladName,  itemCode, itemName, inReserve,  allStock, cost, freeStock,
				inReserveForm, pCost, generalStock, relevance, arrival, subCategory,
				inDelivery, brand);
				arrayListStock.add(scSklad);
	}
	
	
	public String getSkladName() {
		return skladName;
	}

	public void setSkladName(String skladName) {
		this.skladName = skladName;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getInReserve() {
		return inReserve;
	}

	public void setInReserve(int inReserve) {
		this.inReserve = inReserve;
	}

	public int getAllStock() {
		return allStock;
	}

	public void setAllStock(int allStock) {
		this.allStock = allStock;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getFreeStock() {
		return freeStock;
	}

	public void setFreeStock(int freeStock) {
		this.freeStock = freeStock;
	}

	public int getInReserveForm() {
		return inReserveForm;
	}

	public void setInReserveForm(int inReserveForm) {
		this.inReserveForm = inReserveForm;
	}

	public double getPCost() {
		return PCost;
	}

	public void setPCost(double pCost) {
		PCost = pCost;
	}

	public int getGeneralStock() {
		return generalStock;
	}

	public void setGeneralStock(int generalStock) {
		this.generalStock = generalStock;
	}

	public String getRelevance() {
		return relevance;
	}

	public void setRelevance(String relevance) {
		this.relevance = relevance;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getInDelivery() {
		return inDelivery;
	}

	public void setInDelivery(String inDelivery) {
		this.inDelivery = inDelivery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
