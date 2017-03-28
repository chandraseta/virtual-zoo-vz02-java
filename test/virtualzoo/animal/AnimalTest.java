package virtualzoo.animal;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

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

  /**
   * <p>
   * ID unik untuk setiap jenis Animal.
   * </p>
   */
  private int id;
  /**
   * <p>
   * Atribut yang menentukan apakah Animal dapat hidup di habitat darat.
   * </p>
   */
  private boolean isLandAnimal;
  /**
   * <p>
   * Atribut yang menentukan apakah Animal dapat hidup di habitat air.
   * </p>
   */
  private boolean isWaterAnimal;
  /**
   * <p>
   * Atribut yang menentukan apakah Animal dapat hidup di habitat udara.
   * </p>
   */
  private boolean isAirAnimal;
  /**
   * <p>
   * Sebuah Point yang menyatakan lokasi dari Animal.
   * </p>
   */
  private Point position = new Point(-1, -1);
  /**
   * <p>
   * Atribut menentukan apakah perilaku Animal jinak atau liar.
   * </p>
   */
  private boolean isWild;
  /**
   * <p>
   * Nilai berat Animal (dalam kilogram).
   * </p>
   */
  private int weight;

  private Animal animal;

  /**
   * Constructor.
   * <p>
   * Meciptakan sebuah Animal dan menyimpan atribut-atributnya
   * untuk pengetesan.
   * </p>
   * @param animalID Digunakan sebagai penentu jenis Animal.
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Animal.
   */
  public AnimalTest(int animalID, int locX, int locY, int animalWeight) {
    animal = new Animal(animalID, locX, locY, animalWeight);
    id = animalID;
    isLandAnimal = animal.getIsLandAnimal();
    isWaterAnimal = animal.getIsWaterAnimal();
    isAirAnimal = animal.getIsAirAnimal();
    position.setLocation(locX, locY);
    isWild = animal.getBehavior();
    weight = animal.getWeight();
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