package util;

public class CheckArrival {
	
	public static final String SKIPARCHIVE_STRING = "Архив";
	public static final String SKIPINETPRICE_STRING = "Рабоч. ассорт./интернет";
	public static final String SKIPINET_STRING = "Рабоч. ассорт./интернет прайс";
	public static final String SKIPOPT_STRING = "Рабоч. ассорт./опт";
	
	public CheckArrival() {
		
	}
	
	public Boolean equalArrivalSKIPARCHIVE_STRING(String arrival) {
		Boolean a = true;
		
		for (int i = 0; i < arrival.length(); i++) {
			if (arrival.charAt(i) != SKIPARCHIVE_STRING.charAt(i)) {
				return false;
			}
		}
		
		return a;
	}
	
	public Boolean equalArrivalSKIPINETPRICE_STRING(String arrival) {
		Boolean a = true;
		
		for (int i = 0; i < arrival.length(); i++) {
			if (a = arrival.charAt(i) != SKIPINETPRICE_STRING.charAt(i)) {
				return false;
			}
		}
		
		return a;
	}
	
	public Boolean equalArrivalSKIPINET_STRING(String arrival) {
		Boolean a = true;
		
		for (int i = 0; i < arrival.length(); i++) {
			if (arrival.charAt(i) != SKIPINET_STRING.charAt(i)) {
				return false;
			}
		}
		
		return a;
	}
	
	public Boolean equalArrivalSKIPOPT_STRING(String arrival) {
		Boolean a = true;
		
		for (int i = 0; i < arrival.length(); i++) {
			if (arrival.charAt(i) != SKIPOPT_STRING.charAt(i)) {
				return false;
			}
		}
		
		return a;
	}
}
