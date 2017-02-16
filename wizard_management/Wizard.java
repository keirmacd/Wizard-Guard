package wizard_management;
import behaviours.*;


public class Wizard {
  String name;
  Flyable flyable;

  public Wizard(String name, Flyable flyable){
    this.name = name;
    this.flyable = flyable;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.flyable;
  }

  public String fly(){
    return this.flyable.fly();
  }
public void setRide(Flyable ride){
  this.ride = ride;
}
}