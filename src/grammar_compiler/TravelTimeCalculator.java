package grammar_compiler;

import java.util.*; // for GregorianCalendar
import java.text.*; // for DateFormat Class

/**
 * Class: Fundamental Programming Practice <br />
 * 
 * @author "Jing Chen" <br />
 *         Description: Design your own Travel Time Calculator class with
 *         necessary data members and methods. Estimate the duration of your
 *         travel from the source to the destination around US cities by using
 *         the ZonedDateTime Java8 feature. (Air Way).. <br />
 */

public class TravelTimeCalculator {

	City startCity;
	City endCity;
	double distance;
	GregorianCalendar startTime, endTime;
	final double speedPerMinute = 14;

	enum City {
		NewYork, LA, Chicago, Seatle, Detroit, Washington
	}

	public TravelTimeCalculator(City startCity, City endCity, GregorianCalendar startTime, double distance) {
		this.startCity = startCity;
		this.endCity = endCity;
		this.startTime = startTime;
		this.distance = distance;
	}

	public double getTimeOfFlightInMinutes() {
		return distance / speedPerMinute;
	}

	public int getTimeZone(City c) {
		int n = 0;
		switch (c) {
		case NewYork:
			n = 5;
			break;
		case LA:
			n = 8;
			break;
		case Chicago:
			n = 6;
			break;
		case Seatle:
			n = 8;
			break;
		case Detroit:
			n = 5;
			break;
		case Washington:
			n = 5;
			break;

		default:
			System.out.println("city not included");

			break;

		}
		return n;
	}

	public void getEndTime() {
		endTime = startTime;
		endTime.add(Calendar.MINUTE, (int) getTimeOfFlightInMinutes());

		endTime.add(Calendar.HOUR, getTimeZone(startCity) - getTimeZone(endCity));

	}

	public static void main(String[] args) {
		TravelTimeCalculator t = new TravelTimeCalculator(City.NewYork, City.Seatle,
				new GregorianCalendar(2016, Calendar.JANUARY, 1, 1, 1, 1), 4589.15);

		DateFormat fmt = DateFormat.getInstance();
		System.out.println("Your flight is from " + t.startCity + " to " + t.endCity);
		System.out.println("the start time of travel is : " + fmt.format(t.startTime.getTime()));
		t.getEndTime();

		System.out.println("the end time of travel is : " + fmt.format(t.endTime.getTime()));

	}

}

/*
 * Your flight is from NewYork to Seatle the start time of travel is : 16-1-1
 * ä¸Šå?ˆ1:01 the end time of travel is : 16-1-1 ä¸Šå?ˆ3:28
 */