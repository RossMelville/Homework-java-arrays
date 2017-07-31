import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {

Bus bus;
Person person;

  @Before
  public void before() {
    bus = new Bus(35, "Dave", 20, 14.95);
    person = new Person();
  }

  @Test
  public void hasRoute() {
    assertEquals( 35, bus.getRoute() );
  }

  @Test 
  public void hasDriver() {
    assertEquals( "Dave", bus.getDriver() );
  }

  @Test
  public void hasWeight() {
    assertEquals( 20, bus.getWeight() );
  }

  @Test
  public void hasHeight() {
    assertEquals( 14.95, bus.getHeight(), 0.01);
  }

  @Test
  public void canFitUnderLowBridge() {
    assertEquals(true, bus.fitUnderLowBridge() );
  }

  @Test 
  public void cannotFitUnderLowBridge() {
    Bus tallBus = new Bus(22, "Steve", 22, 15.55);
    assertEquals(false, tallBus.fitUnderLowBridge() );
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void personCanBoardBus() {
    bus.boarded( person );
    assertEquals(1, bus.passengerCount());
  }



}