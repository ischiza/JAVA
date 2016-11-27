import java.util.*;
public class Mazur {

	public static ArrayList<Short> onionlike(Vector<Short> s,
	boolean[]a, boolean[]b) {

		ArrayList<Short> l = new ArrayList<Short>();

		for (int i = 0; i < s.size(); i++) {

			if (a[i] && b[i]) {

				l.add(s.get(i));
			}
		}

		return l;
	}

}

