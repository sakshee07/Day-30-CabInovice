package abc.abc;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {

	Map<String, ArrayList<MultipalRides>> userRides;

	public RideRepository() {
		userRides = new HashMap<String, ArrayList<MultipalRides>>();
	}

	public void addRide(String userId, MultipalRides[] ride) {
		ArrayList<MultipalRides> ridesList = this.userRides.get(userId);
		if (ridesList == null) {
			this.userRides.put(userId, new ArrayList<MultipalRides>(Arrays.asList(ride)));
		}

	}

	public MultipalRides[] getRides(String userId) {
		return this.userRides.get(userId).toArray(new MultipalRides[0]);
	}
}