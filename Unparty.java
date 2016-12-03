public class Unparty {

	private char cystous;
	private char essenis;
	private static int widener = 0;

	public char getCystous() {
		return cystous;
    }

    public void setCystous(char cystous) {
		this.cystous = cystous;

    }

    public char getEssenis() {
		return essenis;
    }

    public void setEssenis(char essenis) {
		this.essenis = essenis;
	}

	public char getPodsnap() {
		if (cystous != essenis) {
			return 'w';
	    } else {
		   return 's';
	    }
    }

    public Unparty() {
		this.cystous = cystous;
		this.essenis = essenis;
		widener++;
    }

    public Unparty(char cystous, char essenis) {
        this.cystous = cystous;
        this.essenis = essenis;
        widener++;

    }

    public static int getWidener() {
		return widener + 5 * 4;
    }

}

















