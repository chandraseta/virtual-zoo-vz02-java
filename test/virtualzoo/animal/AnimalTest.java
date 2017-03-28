package virtualzoo.animal;



import static org.junit.Assert.assertEquals;

import java.awt.Point;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Kelas AnimalTest mengaplikasikan unit test pada kelas Animal.
 * </p>
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 2.0
 * @since 2.0
 */
public class AnimalTest {

  private Animal animal1;
  private Animal animal2;

  @Before
  public void setUp() {
    animal1 = new Animal(0, 10, 10, 10);
    animal2 = new Animal(1, 15, 15, 40);
  }

  @Test
  public void testGetterSetter {
    assertEquals("Error in getId()", animal1.getId(), 0);
    assertEquals("Error in getId()", animal2.getId(), 1);
    animal1.setPosition(5,5);
    assertEquals("Error in setPosition() and getPosition()", animal1.getPosition().getX(), 5);

  }

  @Test
  public void  {

  }

  /**
   * Mengetes apakah ID Animal benar.
   */
  public void matchId() {
    assertEquals("ID matches", animal.getId(), );
  }

  /**
   * Mengetes apakah tipe Animal benar.
   */
  public void matchType() {
    assertEquals("Land type matches", animal.getIsLandAnimal(), isLandAnimal);
    assertEquals("Water type matches", animal.getIsWaterAnimal(), isWaterAnimal);
    assertEquals("Air type matches", animal.getIsAirAnimal(), isAirAnimal);
  }

  /**
   * Mengetes apakah lokasi Animal benar.
   */
  public void matchPosition() {
    assertEquals("X matches", (int) animal.getPosition().getX(), position.getX());
    assertEquals("Y matches", (int) animal.getPosition().getY(), position.getY());
  }

  /**
   * Mengetes apakah sifat kelakuan Animal benar.
   */
  public void matchBehavior() {
    assertEquals("Behavior matches", animal.getBehavior(), isWild);
  }

  /**
   * Mengetes apakah berat Animal benar.
   */
  public void matchWeight() {
    assertEquals("Weight matches", animal.getWeight(), weight);
  }
}