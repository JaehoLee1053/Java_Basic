package singletonPractice;

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance(); // singleton pattern

		Card myCard = company.createCard();
		Card yourCard = company.createCard();

		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());

	}

}
