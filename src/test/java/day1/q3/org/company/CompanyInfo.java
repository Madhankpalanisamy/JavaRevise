package day1.q3.org.company;

public class CompanyInfo {

	public void companyName() {

		String companyName = "Tata Elxsi";
		System.out.println("companyName : " + companyName);

	}

	public void companyId() {

		int companyId = 25913;
		System.out.println("companyName : " + companyId);

	}

	public void companyAddress() {
		String companyAddress = "Tata Elxsi chennai";
		System.out.println("companyName : " + companyAddress);

	}

	public static void main(String[] args) {
		
		CompanyInfo info = new CompanyInfo();
		info.companyAddress();
		info.companyId();
		info.companyName();

	}

}
