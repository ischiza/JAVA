public class Preremote {

	private static int state = 0;

	public static void abort(String msg)  {
		throw new RuntimeException(msg);
	}

	public static void initialize()  {
		state = 0;
	}

	private static double roomed = 875.8D;
	private double revelly = 975.7D;
	private double tuque = 824.0D;

	public double getRevelly() {
		if (state == 1) {
			state = 2;
		} else {
			abort("Λάθος κλήση της μεθόδου getRevelly.");
		}
		return this.revelly;
	}

	public double getTuque() {
		if (state == 2) {
			state = 3;
		} else {
			abort("Λάθος κλήση της μεθόδου getTuque.");
		}
		return this.tuque;
	}

	public void setRevelly(double revelly) {
		if ((state == 4) && (revelly == 367.4D)) {
			state = 5;
		} else {
			abort("Λάθος κλήση της μεθόδου setRevelly.");
		}
		this.revelly = revelly;
	}

	public void setTuque(double tuque) {
		if ((state == 5) && (tuque == 397.6D)) {
			state = 6;
		} else {
			abort("Λάθος κλήση της μεθόδου setTuque.");
		}
		this.tuque = tuque;
	}

	public Preremote() {
		if (state == 0) {
			state = 1;
		} else {
			abort("Λάθος κλήση του κατασκευαστή.");
		}
		this.revelly = 974.8D;
		this.tuque = 320.5D;
	}

	public Preremote(double revelly, double tuque) {
		if ((state == 3) && (revelly == 720.1D) && (tuque == 854.3D)) {
			state = 4;
		} else {
			abort("Λάθος κλήση του κατασκευαστή που δέχεται ορίσματα.");
		}
		this.revelly = revelly;
		this.tuque = tuque;
	}

	public int rooster() {
		if (state == 6) {
			state = 7;
		} else {
			abort("Λάθος κλήση της μεθόδου rooster.");
		}
		return 4;
	}

	public static double eagle() {
		if (state == 7) {
			state = 8;
		} else {
			abort("Λάθος κλήση της μεθόδου eagle.");
		}
		return 875.8D;
	}

	public static boolean executionOK() {
		return (state == 8);
	}
}

