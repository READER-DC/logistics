package entity;

import java.util.ArrayList;

public class DeliveryShoppe {
	
	private String InvoicePayer;
	private String status;
	private String businessTransaction;
	private String basicСlient;
	private String additionalСlient;
	private Long numTransaction;
	private String dateTransaction;
	private String curency;
	private int itemCode;
	private String  itemNumber;
	private String itemName;
	private int Qty;
	private String serialNum;
	private double cost;
	private double costUAH;
	private String party;
	private double sumCost;
	private String bString;
	private  String notes;
	private String finalSalePriceUAH;
	
	public static ArrayList<DeliveryShoppe> arrayListDeliveryShoppe = new ArrayList<DeliveryShoppe>();
	
	
	private DeliveryShoppe(String invoicePayer, String status, String businessTransaction, String basicСlient,
			String additionalСlient, Long numTransaction, String dateTransaction, String curency, int itemCode,
			String itemNumber, String itemName, int qty, String serialNum, double cost, double costUAH, String party,
			double sumCost, String bString, String notes, String finalSalePriceUAH) {
		
		InvoicePayer = invoicePayer;
		this.status = status;
		this.businessTransaction = businessTransaction;
		this.basicСlient = basicСlient;
		this.additionalСlient = additionalСlient;
		this.numTransaction = numTransaction;
		this.dateTransaction = dateTransaction;
		this.curency = curency;
		this.itemCode = itemCode;
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		Qty = qty;
		this.serialNum = serialNum;
		this.cost = cost;
		this.costUAH = costUAH;
		this.party = party;
		this.sumCost = sumCost;
		this.bString = bString;
		this.notes = notes;
		this.finalSalePriceUAH = finalSalePriceUAH;
	}
	
	public static void CreateDeliveryShoppe (String invoicePayer, String status, String businessTransaction, String basicСlient,
			String additionalСlient, Long numTransaction, String dateTransaction, String curency, int itemCode,
			String itemNumber, String itemName, int qty, String serialNum, double cost, double costUAH, String party,
			double sumCost, String bString, String notes, String finalSalePriceUAH) {
		
		DeliveryShoppe deliveryShoppe = new DeliveryShoppe(invoicePayer, status, businessTransaction, basicСlient,
				additionalСlient, numTransaction, dateTransaction, curency, itemCode,
				itemNumber, itemName, qty, serialNum, cost, costUAH, party,
				sumCost, bString, notes, finalSalePriceUAH);
		
		arrayListDeliveryShoppe.add(deliveryShoppe);
		
	}
	
	
	public String getInvoicePayer() {
		return InvoicePayer;
	}
	public void setInvoicePayer(String invoicePayer) {
		InvoicePayer = invoicePayer;
	}
	public String getStatu() {
		return status;
	}
	public void setStatu(String statu) {
		this.status = statu;
	}
	public String getBusinessTransaction() {
		return businessTransaction;
	}
	public void setBusinessTransaction(String businessTransaction) {
		this.businessTransaction = businessTransaction;
	}
	public String getBasicСlient() {
		return basicСlient;
	}
	public void setBasicСlient(String basicСlient) {
		this.basicСlient = basicСlient;
	}
	public String getAdditionalСlient() {
		return additionalСlient;
	}
	public void setAdditionalСlient(String additionalСlient) {
		this.additionalСlient = additionalСlient;
	}
	public Long getNumTransaction() {
		return numTransaction;
	}
	public void setNumTransaction(Long numTransaction) {
		this.numTransaction = numTransaction;
	}
	public String getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public String getCurency() {
		return curency;
	}
	public void setCurency(String curency) {
		this.curency = curency;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getCostUAH() {
		return costUAH;
	}
	public void setCostUAH(double costUAH) {
		this.costUAH = costUAH;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public double getSumCost() {
		return sumCost;
	}
	public void setSumCost(double sumCost) {
		this.sumCost = sumCost;
	}
	public String getbString() {
		return bString;
	}
	public void setbString(String bString) {
		this.bString = bString;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getFinalSalePriceUAH() {
		return finalSalePriceUAH;
	}
	public void setFinalSalePriceUAH(String finalSalePriceUAH) {
		this.finalSalePriceUAH = finalSalePriceUAH;
	}

	
}
