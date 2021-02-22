package singletonPractice;

public class CardCompany {
	
	private static int cardNumber = 10001;

	public static CardCompany instance = new CardCompany();
	
	public CardCompany() {}
	
	public static CardCompany getInstance() {
		
		if(instance == null) {
			instance = new CardCompany();
		}
		
		return instance;
		
	}
	
	public Card createCard() {
		
		Card newCard = new Card(cardNumber++);
		
		return newCard;
		
	}

}
