package virtualzoo.infrastructure;

/**
 * <p>
 * Kelas Cell yang menangani
 * </p>
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 2.0
 * @since 2.0
 */
public class Cell {

  /**
   * <p>
   * Suatu Cell dapat dikunjungi atau tidak oleh pengunjung.
   * </p>
   */
  private boolean infrastructureAccessible;
  /**
   * <p>
   * Jenis Cell.
   * </p>
   */
  private String type;
  /**
   * <p>
   * Nama dari suatu Cell.
   * </p>
   */
  private String name;
  /**
   * <p>
   * Jalan merupakan jalan masuk Zoo.
   * </p>
   */
  private boolean isEntrance;
  /**
   * <p>
   * Jalan merupakan jalan keluar Zoo.
   * </p>
   */
  private boolean isExit;

  /**
   * <p>
   * Constructor
   * Menciptakan cell sesuai dengan parameter.
   * Semua habitat tidak bisa diakses (infrastructureAccessible = false).
   * Road dan semua habitat memiliki nama "" (string kosong).
   * Parameter entrance dan exit hanya boleh true saat cellType adalah "Road".
   * </p>
   *
   * @param accessible Nilai true/false cell dapat diakses.
   * @param cellType Tipe cell
   * @param facilityName Nama fasilitas cell
   * @param roadEntrance Nilai true/false cell merupakan entrance.
   * @param roadExit Nilai true/false cell merupakan exit.
   */
  public Cell(boolean accessible, String cellType, String facilityName, boolean roadEntrance,
      boolean roadExit) {
    type = cellType;
    infrastructureAccessible =
        !(type.equals("AirHabitat") || type.equals("LandHabitat") || type.equals("WaterHabitat"))
            && accessible;
    if (type.equals("Road") || type.equals("AirHabitat") || type.equals("LandHabitat")
        || type.equals("WaterHabitat")) {
      name = "";
    } else {
      name = facilityName;
    }
    if (type.equals("Road")) {
      isEntrance = roadEntrance;
      isExit = roadExit;
    } else {
      isEntrance = false;
      isExit = false;
    }
  }

  /**
   * <p>
   * Copy constructor
   *
   * Menciptakan cell yang sama dengan cell yang sudah ada.
   * </p>
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
   * <p>
   * Mengembalikan apakah Cell dapat diakses.
   * </p>
   *
   * @return Nilai infrastructureAccessible
   */
  public boolean infrastructureAccessible() {
    return infrastructureAccessible;
  }

  /**
   * <p>
   * Mengembalikan tipe Cell.
   * </p>
   *
   * @return Nilai type
   */
  public String getType() {
    return type;
  }

  /**
   * <p>
   * Mengembalikan nama cell.
   * </p>
   *
   * @return Nilai name
   */
  public String getFacilityName() {
    return name;
  }

  /**
   * <p>
   * Mengembalikan apakah Cell merupakan jalan masuk Zoo.
   * </p>
   *
   * @return Nilai isEntrance
   */
  public boolean isEntrance() {
    return isEntrance;
  }

  /**
   * <p>
   * Mengembalikan apakah Cell merupakan jalan keluar Zoo.
   * </p>
   *
   * @return Nilai isExit
   */
  public boolean isExit() {
    return isExit;
  }

  /**
   * <p>
   * Mengembalikan character untuk proses render.
   * </p>
   *
   * @return Karakter untuk dirender
   */
  public char render() {
    switch (type) {
      case "AirHabitat":
        return 'a';
      case "LandHabitat":
        return 'l';
      case "WaterHabitat":
        return 'w';
      case "Road":
        return '.';
      case "Park":
        return '*';
      case "Restaurant":
        return 'R';
      default:
        return ' ';
    }

  }
}