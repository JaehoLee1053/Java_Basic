package hidingPractice;

public class MyDate {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		int limit = 0;
		if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8
				|| this.month == 10 || this.month == 12)
			limit = 31;
		else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)
			limit = 30;
		else if (this.month == 2)
			limit = 28;

		if (isValid(day, limit))
			this.day = day;
		else
			System.out.println("Day over the limit.");
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (isValid(month, 12))
			this.month = month;
		else
			System.out.println("Month over the limit.");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (isValid(year, 9999))
			this.year = year;
		else
			System.out.println("Year over the limit.");
	}

	public MyDate(int day, int month, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}

	public boolean isValid(int input, int limit) {
		if (0 < input && input <= limit)
			return true;
		else
			return false;
	}

	public void printInfo() {
		System.out.println(this.year + "년 " + this.month + "월 " + this.day + "일");
	}

}
