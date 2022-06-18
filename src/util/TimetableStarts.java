package util;

import java.util.ArrayList;
import java.util.Calendar;

public class TimetableStarts {
	private String tableName;
	private static int starYear;
	private static int startWeek;
	private String status;
	public static ArrayList<TimetableStarts> arrayListTimetableStarts = new ArrayList<TimetableStarts>();
	
	private TimetableStarts(String tableName, int startWeek, int starYear, String status) {
		super();
		this.tableName = tableName;
		TimetableStarts.startWeek = startWeek;
		TimetableStarts.starYear = starYear;
		this.status = status;
	}
	
	public static void createTimeTableStart(String tableName, String status) {
			startWeek = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
			starYear = Calendar.getInstance().get(Calendar.YEAR);

		
		TimetableStarts tStarts = new TimetableStarts(tableName, startWeek, starYear, status);
		arrayListTimetableStarts.add(tStarts);
	}
	
	public void dateStart() {
		
//		SimpleDateFormat cal = new SimpleDateFormat("yyyy dd MM");
		
		
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getStarYear() {
		return starYear;
	}

	public void setStarYear(int starYear) {
		TimetableStarts.starYear = starYear;
	}

	public int getStartWeek() {
		return startWeek;
	}

	public void setStartWeek(int startWeek) {
		TimetableStarts.startWeek = startWeek;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


		
}
