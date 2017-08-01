public class BusStop {
  private int number;
  private String name;
  private Person[] passengers;

  public BusStop(int number, String name) {

    this.number = number;
    this.name = name;
    this.passengers = new Person[6];
  }

  public int getNumber() {
    return this.number;
  }

  public String getName() {
    return this.name;
  }

  public int passengerCount() {
    int count = 0;
    for (Person passenger : this.passengers) {
      if(passenger != null) {
        count++;
      }
    }
    return count;
  }

  public void enter( Person passenger ) {
    if (busStopFull()) {
      return;
    }
    int passengerCount = passengerCount();
    passengers[passengerCount] = passenger;
  }

  public boolean busStopFull() {
    return passengerCount() == passengers.length;
  }



}