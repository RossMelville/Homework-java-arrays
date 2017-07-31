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

}