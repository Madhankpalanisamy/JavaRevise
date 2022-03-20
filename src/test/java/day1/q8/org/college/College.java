package day1.q8.org.college;

public class College {

	public void collegeName() {
		String collegeName = "Karpagam University";
		System.out.println("College Name:" + collegeName);

	}

	public void collegeCode() {
		int collegeCode = 10001;
		System.out.println("College Code :" + collegeCode);

	}

	public void collegeRank() {
		int collegeRank = 10;
		System.out.println("College Rank :" + collegeRank);

	}

	public static void main(String[] args) {

		College clg = new College();
		clg.collegeCode();
		clg.collegeName();
		clg.collegeRank();
		Student std = new Student();
		std.studentDept();
		std.studentId();
		std.studentName();
		Hostel htl = new Hostel();
		htl.hostelName();
		Dept dpt = new Dept();
		dpt.deptName();

	}

}
