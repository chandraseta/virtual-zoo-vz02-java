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
  public static int total_req_meat;
  /**
   * Jumlah total tumbuhan yang dibutuhkan (dalam kilogram).
   */
  public static int total_req_plant;

  /**
   * Menambahkan jumlah daging yang dibutuhkan ke total_req_meat.
   * @param req_meat Jumlah daging yang dibutuhkan.
   */
  public static void addTotalMeat(int req_meat) {
    total_req_meat += req_meat;
  }

  /**
   * Menambahkan jumlah tumbuhan yang dibutuhkan ke total_req_plant.
   * @param req_plant Jumlah tumbuhan yang dibutuhkan
   */
  public static void addTotalPlant(int req_plant) {
    total_req_plant += req_plant;
  }

  /**
   * Mengembalikan total jumlah daging yang dibutuhkan.
   * @return Nilai total_req_meat.
   */
  public static int getTotalMeat() {
    return total_req_meat;
  }

  /**
   * Mengembalikan total jumlah tumbuhan yang dibutuhkan
   * @return Nilai total_req_plant.
   */
  public static int getTotalPlant() {
    return total_req_plant;
  }
}
