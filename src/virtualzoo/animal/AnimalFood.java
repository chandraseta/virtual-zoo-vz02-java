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
   * <p>
   * Jumlah total daging yang dibutuhkan (dalam kilogram).
   * </p>
   */
  public static int totalReqMeat = 0;
  /**
   * <p>
   * Jumlah total tumbuhan yang dibutuhkan (dalam kilogram).
   * </p>
   */
  public static int totalReqPlant = 0;

  /**
   * <p>
   * Menambahkan jumlah daging yang dibutuhkan ke totalReqMeat.
   * </p>
   * @param reqMeat Jumlah daging yang dibutuhkan
   */
  public static void addTotalMeat(int reqMeat) {
    totalReqMeat += reqMeat;
  }

  /**
   * <p>
   * Menambahkan jumlah tumbuhan yang dibutuhkan ke totalReqPlant.
   * </p>
   * @param reqPlant Jumlah tumbuhan yang dibutuhkan
   */
  public static void addTotalPlant(int reqPlant) {
    totalReqPlant += reqPlant;
  }

  /**
   * <p>
   * Mengembalikan total jumlah daging yang dibutuhkan.
   * </p>
   * @return Nilai totalReqMeat
   */
  public static int getTotalMeat() {
    return totalReqMeat;
  }

  /**
   * <p>
   * Mengembalikan total jumlah tumbuhan yang dibutuhkan.
   * </p>
   * @return Nilai totalReqPlant
   */
  public static int getTotalPlant() {
    return totalReqPlant;
  }
}
