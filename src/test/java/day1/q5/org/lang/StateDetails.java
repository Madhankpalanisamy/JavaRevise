package day1.q5.org.lang;


//import day1.q5.org.lang.LanguageInfo;

public class StateDetails {

	public void southIndia() {

		System.out.println("I like South India");
	}

	public void northIndia() {

		System.out.println("I like North India");

	}
	

	public static void main(String[] args) {
		
		
		StateDetails state = new StateDetails();
		
		state.southIndia();
		state.northIndia();
		
		LanguageInfo lang = new LanguageInfo();
		lang.hindiLanguage();
		lang.englishLanguage();
		lang.tamilLanguage();
	
	}

}
