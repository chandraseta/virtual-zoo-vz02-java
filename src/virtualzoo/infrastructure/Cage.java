package virtualzoo.infrastructure;

import java.awt.Point;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import virtualzoo.animal.Animal;

/**
 * <p>
 * Kelas Cage yang memiliki area dan berisi animal
 * </p>
 * @author Oktavianus Handika - 13515035
 * @version 2.0
 * @since 2.0
 */

public class Cage {
  public static final int LAND = 0;
  public static final int WATER = 1;
  public static final int AIR = 2;
  /**
   * <p>
   * Jenis Habitat pada setiap Cage-nya.
   * </p>
   */
  private int type;
  /**
   * <p>
   * Set of Point yang menyatakan area Cage.
   * </p>
   */
  private Set<Point> area;
  /**
   * <p>
   * Vector of pointer to Animal yang berisi hewan.
   * </p>
   */
  private Vector<Animal> animal;
  /**
   * <p>
   * Banyak hewan yang ada pada suatu area.
   * </p>
   */
  private int nbAnimal;

  /**
   * <p>
   * Constructor
   *
   * Menciptakan cage default yaitu dengan habitat darat.
   * </p>
   */
  public Cage() {
    type = LAND;
    nbAnimal = 0;
  }

  /**
   * <p>
   * Constructor
   *
   * Menciptakan Cage dengan Habitat tertentu.
   * </p>
   * @param habitatType tipe Habitat
   */
  public Cage(int habitatType) {
    type = habitatType;
    nbAnimal = 0;
  }

  /**
   * <p>
   * Menambahkan Point P menjadi area dalam Cage.
   * </p>
   * @param p Nilai Point yang akan ditambahkan
   */
  public void addPoint(Point p) {
    area.add(p);
  }

  /**
   * <p>
   * Menghilangkan Point P dari area dalam Cage.
   * </p>
   * @param p Nilai Point yang akan dihilangkan
   */
  public void removePoint(Point p) {
    area.remove(p);
  }

  /**
   * <p>
   * Menambahkan animal ke dalam cage.
   * Akan diperiksa terlebih dahulu apakah cage sudah penuh.
   * </p>
   * @param a Hewan yang ingin ditambahkan
   */
  public void addAnimal(Animal a) {
    if (nbAnimal < area.size() / 10 * 3) {
      if (!(a.getBehavior())) {
        animal.add(a);
        nbAnimal++;
      } else {
        boolean placeable = true;
        for (int i = 0; i < animal.size() && placeable; ++i) {
          placeable = a.isEnemy(animal.elementAt(i).getId());
        }
        if (placeable) {
          animal.add(a);
          nbAnimal++;
        }
      }
    }
  }

  /**
   * <p>
   * Menghilangkan Animal ke-i dari Cage.
   * </p>
   * @param i Indeks Animal yang ingin dikurangi
   */
  public void removeAnimal(int i) {
    if (i < animal.size()) {
      Animal a = animal.elementAt(i);
      animal.remove(i);
      nbAnimal--;
    }
  }

  /**
   * <p>
   * Menggerakkan semua Animal di dalam Cage.
   * Akan diperiksa agar Animal tidak keluar dari Cage.
   * </p>
   */
  public void moveAnimal() {
    Random randomNo = new Random();

    for (int i = 0; i < animal.size(); ++i) {
      int movement = randomNo.nextInt(4);
      boolean movementInCage;
      int noOfTries = 0;
      do {
        animal.elementAt(i).move(movement);
        movementInCage = area.contains(animal.elementAt(i).getPosition());
        if (!movementInCage) {
          movement = (movement + 2) % 4;
          animal.elementAt(i).move(movement);
          movement = (movement + 3) % 4;
          noOfTries++;
        }
      } while (!movementInCage && noOfTries < 4);
    }
  }

  /**
   * <p>
   * Getter area Cage.
   * </p>
   * @return Set of Point yang menyatakan area Cage
   */
  public Set<Point> getArea() {
    return area;
  }

  /**
   * <p>
   * Getter daftar Animal.
   * </p>
   * @return Vector of pointer to Animal yang berisi hewan
   */
  public Vector<Animal> getAnimal() {
    return animal;
  }
}
