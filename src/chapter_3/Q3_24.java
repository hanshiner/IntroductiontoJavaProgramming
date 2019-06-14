package chapter_3;

public class Q3_24 {

	public static void main(String[] args) {
		
        String suit=" ", deck="";
		
		int deckOfCard = (int) (Math.random()*53);
		
		int suitOfCard = (int) (Math.random()*5);
		
		if(suitOfCard == 1 && deckOfCard==1)
		 suit= "Clubs";
		 deck = "Ace";
		 if(suitOfCard == 1 && deckOfCard==1)
			 suit= "Clubs";
			 deck = "Ace";
			 if(suitOfCard == 1 && deckOfCard==2)
				 suit= "Clubs";
				 deck = "2";
				 if(suitOfCard == 1 && deckOfCard==3)
					 suit= "Clubs";
					 deck = "3";
					 if(suitOfCard == 1 && deckOfCard==4)
						 suit= "Clubs";
						 deck = "4";
						 if(suitOfCard == 1 && deckOfCard==5)
							 suit= "Clubs";
							 deck = "5";
							 if(suitOfCard == 1 && deckOfCard==6)
								 suit= "Clubs";
								 deck = "6";
								 if(suitOfCard == 1 && deckOfCard==7)
									 suit= "Clubs";
									 deck = "7";
									 if(suitOfCard == 1 && deckOfCard==8)
										 suit= "Clubs";
										 deck = "8";
										 if(suitOfCard == 1 && deckOfCard==9)
											 suit= "Clubs";
											 deck = "9";
											 if(suitOfCard == 1 && deckOfCard==10)
												 suit= "Clubs";
												 deck = "10";
												 if(suitOfCard == 1 && deckOfCard==11)
													 suit= "Clubs";
													 deck = "Jack";
													 if(suitOfCard == 1 && deckOfCard==12)
														 suit= "Clubs";
														 deck = "Queen";
														 if(suitOfCard == 1 && deckOfCard==13)
															 suit= "Clubs";
															 deck = "King";
															 
															 
														 
		 System.out.println("The card you picked is "+ deck + " of " + suit);
	
	
	}

}
