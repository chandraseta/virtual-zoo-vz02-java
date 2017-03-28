package virtualzoo.misc;

import java.awt.Point;

/**
 * <p>
 * Kelas Person memiliki person yang dapat melakukan tour dalam zoo.
 * </p>
 * @author Oktavianus Handika - 13515035
 * @version 2.0
 * @since 2.0
 */
public class Person {
  /**
   * <p>
   * Posisi atau lokasi pengunjung berada pada Zoo.
   * </p>
   */
  private Point position  = new Point(-1, -1);

  /**
   * <p>
   * Constructor
   *
   * Menciptakan person default pada posisi (-1,-1).
   * </p>
   */
  public Person() {
    resetPosition();
  }

  /**
   * <p>
   * Getter nilai position.
   * </p>
   *
   * @return Nilai position
   */
  public Point getPosition() {
    return position;
  }

  /**
   * <p>
   * Menetapkan nilai position berdasarkan point p.
   * </p>
   *
   * @param p Point yang sudah diciptakan
   */
  public void setPosition(Point p) {
    position = p;
  }

  /**
   * <p>
   * Menetapkan nilai position berdasarkan x dan y.
   * </p>
   *
   * @param x Nilai posisi absis
   * @param y Nilai posisi ordinat
   */
  public void setPosition(int x, int y) {
    position.setLocation(x, y);
  }

  /**
   * <p>
   * Mengembalikan character untuk proses render.
   * </p>
   *
   * @return Karakter untuk dirender
   */
  public char render() {
    return '?';
  }

  /**
   * <p>
   * Menggerakkan person dengan mengubah posisi.
   * </p>
   *
   * @param movement Nilai menentukan arah gerak animal.
   */
  public void move(int movement) {
    if (movement == 1) {  // Up
      position.setLocation(position.getX(), position.getY() - 1);
    } else if (movement == 2) {  // Right
      position.setLocation(position.getX() + 1, position.getY());
    } else if (movement == 3) {  // Down
      position.setLocation(position.getX(), position.getY() + 1);
    } else {  // Left
      position.setLocation(position.getX() - 1, position.getY());
    }
  }

  /**
   * <p>
   * Mengembalikan nilai posisi menjadi default.
   * Mengubah posisi person menjadi (-1,-1).
   * </p>
   */
  public void resetPosition() {
    position.setLocation(-1, -1);
  }
}
