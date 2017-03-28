package virtualzoo.infrastructure;

import java.awt.Point;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import virtualzoo.animal.Animal;

/**
 * Kelas Cage yang memiliki area dan berisi animal
 *
 * @author Oktavianus Handika - 13515035
 * @version 2.0
 * @since 2.0
 */

public class Cage {
  public static final int LAND = 0;
  public static final int WATER = 1;
  public static final int AIR = 2;
  /**
   * Jenis Habitat pada setiap Cage-nya.
   */
  private int type;
  /**
   * Set of Point yang menyatakan area Cage.
   */
  private Set<Point> area;
  /**
   * Vector of pointer to Animal yang berisi hewan.
   */
  private Vector<Animal> animal;
  /**
   * Banyak hewan yang ada pada suatu area.
   */
  int nbAnimal;

  /**
   * Constructor
   * Menciptakan cage default yaitu dengan habitat darat.
   */
  public Cage() {
    type = LAND;
    nbAnimal = 0;
  }

  /**
   * Constructor
   * Menciptakan Cage dengan Habitat tertentu.
   *
   * @param habitatType tipe Habitat
   */
  public Cage(int habitatType) {
    type = habitatType;
    nbAnimal = 0;
  }

  /**
   * Menambahkan Point P menjadi area dalam Cage.
   *
   * @param p Nilai Point yang akan ditambahkan
   */
  public void addPoint(Point p) {
    area.add(p);
  }

  /**
   * Menghilangkan Point P dari area dalam Cage.
   *
   * @param p Nilai Point yang akan dihilangkan
   */
  public void removePoint(Point p) {
    area.remove(p);
  }

  /**
   * Menambahkan animal ke dalam cage.
   * Akan diperiksa terlebih dahulu apakah cage sudah penuh.
   *
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
   * Menghilangkan Animal ke-i dari Cage.
   *
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
   * Menggerakkan semua Animal di dalam Cage.
   * Akan diperiksa agar Animal tidak keluar dari Cage.
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
   * Getter area Cage.
   *
   * @return Set of Point yang menyatakan area Cage
   */
  public Set<Point> getArea() {
    return area;
  }

  /**
   * Getter daftar Animal.
   *
   * @return Vector of pointer to Animal yang berisi hewan
   */
  public Vector<Animal> getAnimal() {
    return animal;
  }
}
