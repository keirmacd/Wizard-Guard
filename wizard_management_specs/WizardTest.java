import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  MagicCarpet magicCarpet;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", broomstick);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick ride = (Broomstick)wizard.getRide();
    assertEquals("Nimbus", ride.getBrand());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }
  @Test
  public void canFlyDragon(){
    Dragon dragon = new Dragon("Smaug");
    wizard = new Wizard ("Ricully",dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }
  @Test
  public void canFlyMagicCarpet(){
    MagicCarpet magicCarpet = new MagicCarpet("Crimson");
    wizard = new Wizard("Rincewind",magicCarpet);
    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }


@Test
public void canSetride(){
  Dragon dragon = new Dragon("Erik");
  assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
}
@Test
public void callprotector(){
  
}
}