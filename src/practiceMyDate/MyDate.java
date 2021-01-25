package practiceMyDate;

public class MyDate {

	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate dateObj = (MyDate) obj;
			if (dateObj.day == this.day && dateObj.month == this.month && dateObj.year == this.year)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
