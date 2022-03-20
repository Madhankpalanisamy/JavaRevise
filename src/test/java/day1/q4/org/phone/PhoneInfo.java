package day1.q4.org.phone;

public class PhoneInfo {

	public void phoneName() {
		String phoneName = "Oneplus 6";
		System.out.println("MY mobile Name is : " + phoneName);

	}

	public void phoneMieiNum() {
		long phoneMieiNum = 865300045457056l;
		System.out.println("MY mobile Name is : " + phoneMieiNum);

	}

	public void Camera() {
		String Camera = "12 MB";
		System.out.println("MY front camera is :" + Camera);

	}

	public void storage() {

		String storage = "128 GB";
		System.out.println("My mobile storeage is :" + storage);

	}

	public void osName() {
		String osName = "Andriod 11";
		System.out.println("My mobile OS name is :" + osName);

	}

	public static void main(String[] args) {
		PhoneInfo info = new PhoneInfo();
		info.Camera();info.osName();info.phoneMieiNum();info.phoneName();info.storage();
	}

}
