package classwork.Day7;

public class BLStdIn {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "Shital salunkhe";
		isEmpty(s1, s2);
		

	}

	private static void isEmpty(String s1, String s2) {
		boolean ans = s1.isEmpty();
		boolean ans1 = s2.isEmpty();
		System.out.println(" Ans of String1: " + ans);
		System.out.println(" Ans of String2: " + ans1);
	}
}