package looseVsTightCoupling;

/*

1. Traveller object is tighly coupled with Car object.
2. If traveller object wants to use Bike object in place of Car then Traveller class needs to be updated.
 
*/

public class TightCoupling {
	class Car {
		public void move() {
		}

	}

	class Bike {
		public void move() {
		}
	}

	class Traveller {
		Car c = new Car();

		public void startJourney() {
			c.move();
		}

	}
}
