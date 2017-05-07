package looseVsTightCoupling;

/*
 - In order to get loose-coupling between objects the following two rules are required:
 1. Using Polymorphism (using Interface - For switching between objects)
 2. Dependency injection mechanism.

 - In below Example:
 1. In traveler class, an external entity injects either car (or) Bike object.
 2. In traveler class, these are no changes required if we are shifting the dependency from Car to Bike. 
  
  				Vehicle (Interface)
  				/     \
  			  Car     Bike (Classes)
 */

public class LooseCoupling {

	interface Vehicle {
		public void move();
	}

	class Car implements Vehicle {
		public void move() {
		}

	}

	class Bike implements Vehicle {
		public void move() {
		}
	}

	class Traveller {
		Vehicle v;

		public Traveller(Vehicle v) {
			this.v = v;
		}

		public void startJourney() {
			v.move();
		}

	}

}
