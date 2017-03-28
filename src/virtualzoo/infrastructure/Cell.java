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
  boolean infrastructureAccessible;
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
  boolean isEntrance;
  /**
   * Jalan merupakan jalan keluar Zoo.
   */
  boolean isExit;

  /**
   * Constructor
   * Menciptakan cell sesuai dengan parameter.
   * Semua habitat tidak bisa diakses (infrastructureAccessible = false).
   * Road dan semua habitat memiliki nama "" (string kosong).
   * Parameter entrance dan exit hanya boleh true saat habitatType adalah "Road".
   *
   * @param accessible Nilai true/false cell dapat diakses.
   * @param habitatType Tipe cell
   * @param facilityName Nama fasilitas cell
   * @param roadEntrance Nilai true/false cell merupakan entrance.
   * @param roadExit Nilai true/false cell merupakan exit.
   */
  public Cell(boolean accessible, String habitatType, String facilityName, boolean roadEntrance,
              boolean roadExit) {
    type = habitatType;
    if (type.equals("AirHabitat") || type.equals("LandHabitat") || type.equals("WaterHabitat")) {
      infrastructureAccessible = false;
    } else {
      infrastructureAccessible = accessible;
    }
    if (type.equals("Road") || type.equals("AirHabitat") || type.equals("LandHabitat")
        || type.equals("WaterHabitat")) {
      name = "";
    } else {
      name = facilityName;
    }
    if (type == "Road") {
      isEntrance = roadEntrance;
      isExit = roadExit;
    } else {
      isEntrance = false;
      isExit = false;
    }
  }

  /**
   * Copy constructor
   * Menciptakan cell yang sama dengan cell yang sudah ada.
   *
   * @param c Objek cell yang telah diciptakan
   */
  public Cell(Cell c) {
    type = c.type;
    infrastructureAccessible = c.infrastructureAccessible;
    name = c.name;
    isEntrance = c.isEntrance;
    isEntrance = c.isExit;
  }

  /**
   * Mengembalikan apakah Cell dapat diakses.
   *
   * @return Nilai infrastructureAccessible
   */
  public boolean infrastructureAccessible() {
    return infrastructureAccessible;
  }

  /**
   * Mengembalikan tipe Cell.
   *
   * @return Nilai type
   */
  public String getType() {
    return type;
  }

  /**
   * Mengembalikan nama cell.
   *
   * @return Nilai name
   */
  public String getfacilityName() {
    return name;
  }

  /**
   * Mengembalikan apakah Cell merupakan jalan masuk Zoo.
   *
   * @return Nilai isEntrance
   */
  public boolean isEntrance() {
    return isEntrance;
  }

  /**
   * Mengembalikan apakah Cell merupakan jalan keluar Zoo.
   *
   * @return Nilai isExit
   */
  public boolean isExit() {
    return isExit;
  }

  /**
   * Mengembalikan character untuk proses render.
   *
   * @return Karakter untuk dirender
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