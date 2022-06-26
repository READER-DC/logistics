package util;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import testconnect.Util;

public class TimeTableStarts {
	private String tableName;
	private static int starYear;
	private static int startWeek;
	private int status;
	public static ArrayList<TimeTableStarts> arrayListTimetableStarts = new ArrayList<TimeTableStarts>();
	
	private TimeTableStarts(String tableName, int startWeek, int starYear, int status) {
		super();
		this.tableName = tableName;
		TimeTableStarts.startWeek = startWeek;
		TimeTableStarts.starYear = starYear;
		this.status = status;
	}
	
	public TimeTableStarts() {
		
	}
	
	public static void createTimeTableStart(String tableName, int status){
			startWeek = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
			starYear = Calendar.getInstance().get(Calendar.YEAR);

		
		TimeTableStarts tStarts = new TimeTableStarts(tableName, startWeek, starYear, status);
		arrayListTimetableStarts.add(tStarts);
	}
	
	public void loadTimetableStartsDB() throws SQLException {
		Util conn = new Util();
		conn.init();
		String sql = "insert into timetable_starts(tableName, startWeek, starYear, status)VALUES(????)";
		PreparedStatement stmt = conn.createStatement(sql);
		
		for (TimeTableStarts ts : TimeTableStarts.arrayListTimetableStarts) {
			String sqlAddTimetableStarts = "insert into timetable_starts(tableName, startWeek, starYear, status)VALUES("
					+ "\"" + ts.getTableName() + "\", "
					+ ts.getStartWeek() + ", "
					+ ts.getStarYear() + ", "
					+ ts.getStatus()
					+ ")";
			stmt.executeUpdate(sqlAddTimetableStarts);
		}
		
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
		TimeTableStarts.starYear = starYear;
	}

	public int getStartWeek() {
		return startWeek;
	}

	public void setStartWeek(int startWeek) {
		TimeTableStarts.startWeek = startWeek;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


		
}
