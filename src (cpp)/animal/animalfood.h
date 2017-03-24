#ifndef ANIMALFOOD_H
#define ANIMALFOOD_H

/** @class AnimalFood
  * Kelas AnimalFood menghitung jumlah makanan hewan yang diperlukan.
  */
class AnimalFood {
	public:
    /** @brief Menambahkan jumlah daging yang dibutuhken ke total_req_meat.
      * @param req_meat Jumlah daging yang dibutuhkan.
      */
		static void AddTotalMeat(int req_meat);
    /** @brief Menambahkan jumlah tumbuhan yang dibutuhkan ke total_req_plant.
      * @param req_plant Jumlah tumbuhan yang dibutuhkan.
      */
		static void AddTotalPlant(int req_plant);
    /** @brief Getter nilai total_req_meat.
      * @return Nilai total_req_meat.
      */
		static int GetTotalMeat();
    /** @brief Getter nilai total_req_plant.
      * @return Nilai total_req_plant.
      */
		static int GetTotalPlant();

	protected:
		static int total_req_meat;
		static int total_req_plant;
};

#endif