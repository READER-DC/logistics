package entity;

import java.util.ArrayList;

public class StoreLinkShoppe {
	private Integer storeCode;
	private Integer shoppeCode;
	public static ArrayList<StoreLinkShoppe> arrayListStoreLinkShoppe = new ArrayList<StoreLinkShoppe>();
	
	private StoreLinkShoppe(Integer storeCode, Integer shoppeCode) {
		this.storeCode = storeCode;
		this.shoppeCode = shoppeCode;
	}
	
public static void createStoreLinkShope(Integer shoppeCode, Integer storeCode) {
		
	StoreLinkShoppe slh = new StoreLinkShoppe(shoppeCode, storeCode);
	arrayListStoreLinkShoppe.add(slh);

	}

public Integer getStoreCode() {
	return storeCode;
}

public void setStoreCode(Integer storeCode) {
	this.storeCode = storeCode;
}

public Integer getShoppeCode() {
	return shoppeCode;
}

public void setShoppeCode(Integer shoppeCode) {
	this.shoppeCode = shoppeCode;
}



}
