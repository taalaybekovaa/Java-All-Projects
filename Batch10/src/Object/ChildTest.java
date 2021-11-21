package Object;

public class ChildTest {

    public static void main(String[] args) {

      Child toddler= new Child();
      toddler.name="Leo";
      toddler.age=3;
      toddler.eyeColor="Green";
      toddler.mothersName="Emma";
      toddler.fathersName="David";
      toddler.weight=25;

      toddler.feed("banana");
      toddler.takeANap();
      toddler.kiss();
      toddler.bath();
      toddler.walk("Along the lake ");
      toddler.play("Playground");



    }

}
