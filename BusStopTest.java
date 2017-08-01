import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {

Bus bus;
Person person;
BusStop busStop;

  @Before
  public void before() {
    bus = new Bus(35, "Dave", 20, 14.95);
    person = new Person();
    busStop = new BusStop(1, "Westport");
    
  }

  @Test
  public void hasNumber() {
    assertEquals(1, busStop.getNumber() );
  }

  @Test
  public void hasName() {
    assertEquals("Westport", busStop.getName() );
  }

  @Test
  public void busStopStartsEmpty() {
    assertEquals(0, busStop.passengerCount());
  }

  @Test
  public void personEnterBusStop() {
    busStop.enter( person );
    assertEquals(1, busStop.passengerCount());
  }

}