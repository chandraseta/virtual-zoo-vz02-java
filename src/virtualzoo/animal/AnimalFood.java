package virtualzoo.animal;

/**
 * Kelas AnimalFood menangani jumlah makanan yang diperlukan Animal.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 2.0
 * @since 2.0
 */
public class AnimalFood {
  /**
   * Jumlah total daging yang dibutuhkan (dalam kilogram).
   */
  public static int totalReqMeat;
  /**
   * Jumlah total tumbuhan yang dibutuhkan (dalam kilogram).
   */
  public static int totalReqPlant;

  /**
   * Menambahkan jumlah daging yang dibutuhkan ke totalReqMeat.
   *
   * @param reqMeat Jumlah daging yang dibutuhkan
   */
  public static void addTotalMeat(int reqMeat) {
    totalReqMeat += reqMeat;
  }

  /**
   * Menambahkan jumlah tumbuhan yang dibutuhkan ke totalReqPlant.
   *
   * @param reqPlant Jumlah tumbuhan yang dibutuhkan
   */
  public static void addTotalPlant(int reqPlant) {
    totalReqPlant += reqPlant;
  }

  /**
   * Mengembalikan total jumlah daging yang dibutuhkan.
   *
   * @return Nilai totalReqMeat
   */
  public static int getTotalMeat() {
    return totalReqMeat;
  }

  /**
   * Mengembalikan total jumlah tumbuhan yang dibutuhkan.
   *
   * @return Nilai totalReqPlant
   */
  public static int getTotalPlant() {
    return totalReqPlant;
  }
}
