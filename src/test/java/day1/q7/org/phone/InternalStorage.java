package day1.q7.org.phone;

public class InternalStorage {
	
	public void processorName() {
		String processorName = "Snapdragon825";
		System.out.println("Processor Name is : "+processorName);
		
	}
	
	
	public void ramSize() {
		
		String ramSize = "8 GB";
		System.out.println("Ram size is : "+ramSize);

	}

	public static void main(String[] args) {
		
		InternalStorage store = new InternalStorage();
		store.processorName();
		store.ramSize();
		
		ExternalStorage external = new ExternalStorage();
		external.size();
	

	}
}
