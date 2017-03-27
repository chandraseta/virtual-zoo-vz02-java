package virtualzoo.infrastructure;

/**
 * Kelas Cell yang menangani
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 2.0
 * @since 2.0
 */
public class Cell {

  /**
   * Suatu Cell dapat dikunjungi atau tidak oleh pengunjung.
   */
  boolean is_accessible;
  /**
   * Jenis Cell.
   */
  String type;
  /**
   * Nama dari suatu Cell.
   */
  String name;
  /**
   * Jalan merupakan jalan masuk Zoo.
   */
  boolean is_entrance;
  /**
   * Jalan merupakan jalan keluar Zoo.
   */
  boolean is_exit;

  /**
   * Constructor
   *
   * Menciptakan cell sesuai dengan parameter.
   * Semua habitat tidak bisa diakses (is_accessible = false).
   * Road dan semua habitat memiliki nama "" (string kosong).
   * Parameter _entrance dan _exit hanya boleh true saat _type adalah "Road".
   *
   * @param _accessible Nilai true/false cell dapat diakses.
   * @param _type Tipe cell.
   * @param _name Nama fasilitas cell.
   * @param _entrance Nilai true/false cell merupakan entrance.
   * @param _exit Nilai true/false cell merupakan exit.
   */
  public Cell(boolean _accessible, String _type, String _name, boolean _entrance, boolean _exit) {
    type = _type;
    if (type.equals("AirHabitat") || type.equals("LandHabitat") || type.equals("WaterHabitat")) {
      is_accessible = false;
    } else {
      is_accessible = _accessible;
    }
    if (type.equals("Road") || type.equals("AirHabitat") || type.equals("LandHabitat") ||
        type.equals("WaterHabitat")) {
      name = "";
    } else {
      name = _name;
    }
    if (type == "Road") {
      is_entrance = _entrance;
      is_exit = _exit;
    } else {
      is_entrance = false;
      is_exit = false;
    }
  }

  /**
   * Copy constructor
   *
   * Menciptakan cell yang sama dengan cell yang sudah ada.
   *
   * @param C Objek cell yang telah diciptakan.
   */
  public Cell(Cell C) {
    type = C.type;
    is_accessible = C.is_accessible;
    name = C.name;
    is_entrance = C.is_entrance;
    is_entrance = C.is_exit;
  }

  /**
   * Mengembalikan apakah cell dapat diakses.
   * @return Nilai is_accessible.
   */
  public boolean isAccessible() {
    return is_accessible;
  }

  /**
   * Mengembalikan tipe cell.
   * @return Nilai type.
   */
  public String getType() {
    return type;
  }

  /**
   * Mengembalikan nama cell.
   * @return Nilai name.
   */
  public String getName() {
    return name;
  }

  /**
   * Mengembalikan apakah cell merupakan jalan masuk Zoo.
   * @return Nilai is_entrance.
   */
  public boolean isEntrance() {
    return is_entrance;
  }

  /**
   * Mengembalikan apakah cell merupakan jalan keluar Zoo.
   * @return Nilai is_exit.
   */
  public boolean isExit() {
    return is_exit;
  }

  /**
   * Mengembalikan character untuk proses render.
   * @return Karakter untuk dirender.
   */
  public char render() {
    if (type.equals("AirHabitat")) {
      return 'a';
    } else if (type.equals("LandHabitat")) {
      return 'l';
    } else if (type.equals("WaterHabitat")) {
      return 'w';
    } else if (type.equals("Road")) {
      return '.';
    } else if (type.equals("Park")) {
      return '*';
    } else if (type.equals("Restaurant")) {
      return 'R';
    } else {
      return ' ';
    }

  }
}