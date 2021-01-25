package hiding;

public class MyDate {
	// 같은 Package 내에서만 접근 가능
//	int day;
//	int month;
//	int year;

	// 접근 제한
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; // default == false

	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay(int day) {
		return day;
	}

	public void showDate() {
		System.out.println(year + "년 " + month +"월 " + day +"일");
	}

}
