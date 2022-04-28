package abc.abc;

public class EnhancedInvoice {

	public int numOfRides;
	public double totalFare;
	public double avgFare;

	public EnhancedInvoice(int numOfRides, double totalFare) {
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.avgFare = this.totalFare / this.numOfRides;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		EnhancedInvoice that = (EnhancedInvoice) obj;
		return (numOfRides == that.numOfRides) && Double.compare(that.totalFare, totalFare) == 0
				&& Double.compare(that.avgFare, avgFare) == 0;
	}

}
