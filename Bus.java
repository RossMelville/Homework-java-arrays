class Bus{
  private int route;
  private String driver;
  private int weight;
  private double height;
  private Person[] passengers;

  public Bus(int route, String driver, int weight, double height) {
    this.route = route;
    this.driver = driver;
    this.weight = weight;
    this.height = height;
    this.passengers = new Person[20];
  }

  public int getRoute() {
    return this.route;
  }

  public String getDriver() {
    return this.driver;
  }

  public int getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }

  public boolean fitUnderLowBridge() {
    return this.height < 15;
  }

  public int passengerCount() {
    int count = 0;
    for( Person passenger : this.passengers) {
      if(passenger != null) {
        count++;
      }
    }
    return count;
  }


}