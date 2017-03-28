package virtualzoo.animal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

  /**
   * Inisialisasi objek Animal untuk proses test.
   */
  @Before
  public void animalSetUp() {
    animal1 = new Animal(0, 10, 10, 10);
    animal2 = new Animal(1, 15, 15, 40);
  }

  /**
   * Pengetesan getter dan setter dari kelas Animal.
   */
  @Test
  public void testGetterSetter() {
    assertEquals("Error in getId()", 0, animal1.getId());
    assertEquals("Error in getId()", 1, animal2.getId());
    animal1.setPosition(5, 5);
    assertEquals("Error in setPosition() and getX()", 5, animal1.getX());
    assertEquals("Error in setPosition() and getY()", 5, animal1.getY());
    assertTrue("Error in getIsLandAnimal()", animal1.getIsLandAnimal());
    assertFalse("Error in getIsWaterAnimal()", animal1.getIsWaterAnimal());
    assertFalse("Error in getIsAirAnimal()", animal1.getIsAirAnimal());
    assertTrue("Error in isHerbivore()", animal1.isHerbivore());
    assertFalse("Error in isCarnivore()", animal1.isCarnivore());
    assertFalse("Error in isOmnivore()", animal1.isOmnivore());
    assertEquals("Error in getWeight()", 10, animal1.getWeight());
    assertTrue("Error in getBehavior()", animal1.getBehavior());
    assertFalse("Error in getBehavior()", animal2.getBehavior());
  }

  /**
   * Pengetesan method move().
   */
  @Test
  public void testMove() {
    animal2.move(1);
    assertEquals("Error in move()", 15, animal2.getX());
    assertEquals("Error in move()", 14, animal2.getY());
  }

  /**
   * Pengetesan method addEnemy() dan removeEnemy().
   */
  @Test
  public void testAddRemoveEnemy() {
    animal1.addEnemy(10);
    assertTrue("Error in addEnemy()", animal1.isEnemy(10));
    animal2.removeEnemy(1);
    assertFalse("Error in removeEnemy()", animal2.isEnemy(1));
  }
}