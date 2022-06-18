package entity;

import java.util.ArrayList;

public class StoreCode {
	private Integer storeCode;
	private String storeName;
	public static ArrayList<StoreCode> arrayListStoreCodes = new ArrayList<StoreCode>();
	
	private StoreCode(Integer storeCode, String storeName) {
		this.storeCode = storeCode;
		this.storeName = storeName;
	}

	public static void createStoreCode(Integer storeCode, String storeName) {
		
		StoreCode csCode = new StoreCode(storeCode, storeName);
		arrayListStoreCodes.add(csCode);

	}
	
	public Integer getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(Integer storeCode) {
		this.storeCode = storeCode;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
