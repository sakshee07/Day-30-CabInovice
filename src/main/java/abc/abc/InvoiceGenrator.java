package abc.abc;

public class InvoiceGenrator {

	
		private static final int COST_PER_TIME = 1;
		private static final double COST_PER_KM = 10;
		private static final double MINIMUM_FARE = 5;
		private RideRepository rideRepository;
		
		public InvoiceGenrator() {
			this.rideRepository = new RideRepository();
		}
		
		public double calculateFare(MultipalRides ride) {
			return Math.max(ride.rideCategory.minFare,
					ride.getDistance() * ride.rideCategory.costPerKm + ride.getTime() * ride.rideCategory.costPerTime);
		}

		public EnhancedInvoice calculateFare(MultipalRides[] rides) {
			double totalFare = 0;
			for (MultipalRides ride : rides) {
				totalFare += calculateFare(ride);
			}
			return new EnhancedInvoice(rides.length, totalFare);
		}
		
		public void addRides(String userId, MultipalRides[] ride) {
			rideRepository.addRide(userId, ride);
		}

		
		public EnhancedInvoice getInvoiceSummary(String userId) {
			return this.calculateFare(rideRepository.getRides(userId));
			
		}


	}