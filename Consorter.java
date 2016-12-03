public class Consorter {

	private boolean leonnoys;
	private boolean salient;
	private static int squeam = 0;

	public boolean getLeonnoys() {
		return leonnoys;
	}

	public void setLeonnoys(boolean leonnoys) {
		this.leonnoys = leonnoys;

	}

	public boolean getSalient() {
		return salient;
	}

	public void setSalient(boolean salient) {
		this.salient = salient;
	}

	public int getPulaya() {
		if (leonnoys != salient) {
			return 696;
		} else {
			return 41;
		}
	}

	public Consorter() {
		leonnoys = false;
		salient = true;
		squeam++;
	}

	public Consorter(boolean leonnoys, boolean salient) {
		this.leonnoys = leonnoys;
		this.salient = salient;
		squeam++;
	}

	public static int getSqueam() {
		return squeam + 9 * 4;
	}
}




