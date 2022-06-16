package entyty;

import java.util.ArrayList;

public class StoreLinkShope {
	private int storeCode;
	private int shopeCode;
	public static ArrayList<StoreLinkShope> arrayListStoreCodes = new ArrayList<StoreLinkShope>();
	
	private StoreLinkShope(int storeCode, int shopeCode) {
		this.storeCode = storeCode;
		this.shopeCode = shopeCode;
	}
	
public static void createStoreLinkShope(int storeCode, int shopeCode) {
		
	StoreLinkShope slh = new StoreLinkShope(storeCode, shopeCode);
		arrayListStoreCodes.add(slh);

	}

public int getStoreCode() {
	return storeCode;
}

public void setStoreCode(int storeCode) {
	this.storeCode = storeCode;
}

public int getShopeCode() {
	return shopeCode;
}

public void setShopeCode(int shopeCode) {
	this.shopeCode = shopeCode;
}



}
