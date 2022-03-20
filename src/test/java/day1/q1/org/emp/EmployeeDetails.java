package day1.q1.org.emp;

public class EmployeeDetails {

	public void empId() {

		int empId = 25913;
		System.out.println("Employee id is : " + empId);

	}

	public void empName() {

		String empName = "Madhan Kumar P";
		System.out.println("Employee Name is :" + empName);
	}

	public void empDob() {

		String empDob = "12-10-1993";
		System.out.println("Employee dateofbirth is : " + empDob);
	}

	public void empPhone() {

		long empPhone = 8098951396l;
		System.out.println("Employee Phone Number is :" + empPhone);

	}

	public void empEmail() {

		String empEmail = "madhankpalanisamy@gmail.com";
		System.out.println("Employee Email is :" + empEmail);

	}

	public void empAddress() {

		String empAddress = "40/19 Thadikkaraswamy Koil Street, Alandur , Chennai-600016";

		System.out.println("Employee address : " + empAddress);

	}

	public static void main(String[] args) {

		EmployeeDetails empobj = new EmployeeDetails();
		empobj.empId();
		empobj.empName();
		empobj.empDob();
		empobj.empPhone();
		empobj.empAddress();

	}

}
