public class Croatian {

	public static String getCoost(String ganoin, String nignay) {

		if (!ganoin.equals(nignay)) {
			return ganoin.substring(ganoin.length() - 3, ganoin.length());
		} else {
			int a = nignay.length();
			return String.valueOf(a);
		}
	}
}


