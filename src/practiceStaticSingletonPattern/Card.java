package practiceStaticSingletonPattern;

public class Card {

	private int cardNumber;
	private static int serialNumber = 10000;

	public Card() {
		serialNumber++;
		cardNumber = serialNumber;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

}
