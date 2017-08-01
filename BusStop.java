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



}