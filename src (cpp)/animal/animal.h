#ifndef ANIMAL_H
#define ANIMAL_H

#include <set>
#include <string>
#include <iostream>
#include "animalfood.h"
#include "../misc/point.h"

/** @class Animal
  * Kelas Animal menampung semua jenis hewan
  */
class Animal {
  public :
    /** @brief Constructor
      * Menciptakan Animal dengan ID sesuai spesies yang diinginkan,
      * posisi (x,y) dan berat _weight.
      * @param _ID ID Animal yang diciptakan
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk Animal.
      */
    Animal(int _ID, int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan Animal.
      * Menuliskan interaksi ke layar.
      */
    void Interact();
    /** @brief Menggerakkan animal dengan mengubah posisi.
      * @param movement Nilai menentukan arah gerak animal.
      */
    void Move(int movement);
    /** @brief Getter nilai is_land_animal.
      * @return Nilai is_land_animal.
      */
    bool IsLandAnimal();
    /** @brief Getter nilai is_water_animal.
      * @return Nilai is_water_animal.
      */
    bool IsWaterAnimal();
    /** @brief Getter nilai is_air_animal.
      * @return Nilai is_air_animal.
      */
    bool IsAirAnimal();
    /** @brief Menentukan apakah Animal merupakan herbivora.
      * @return Nilai true/false Animal merupakan herbivora. 
      */
    bool IsHerbivore();
    /** @brief Menentukan apakah Animal merupakan carnivora.
      * @return Nilai true/false Animal merupakan carnivora. 
      */
    bool IsCarnivore();
    /** @brief Menentukan apakah Animal merupakan omnivora.
      * @return Nilai true/false Animal merupakan omnivora. 
      */
    bool IsOmnivore();
    /** @brief Getter nilai kebutuhan makanan Animal dalam bentuk daging.
      * @return Jumlah daging yang dibutuhkan untuk Animal tertentu.
      */
    int GetReqMeat();
    /** @brief Getter nilai kebutuhan makanan Animal dalam bentuk tumbuhan.
      * @return Jumlah tumbuhan yang dibutuhkan untuk Animal tertentu.
      */
    int GetReqPlant();
    /** @brief Getter nilai point position.
      * @return Nilai position.
      */
    Point GetPosition();
    /** @brief Menambah musuh Animal.
      * Menambahkan Animal dengan ID x dari set.
      * @param x ID Animal yang ingin  ditambah.
      */
    void AddEnemy(int x);
    /** @brief Menghapus musuh Animal.
      * Melenyapkan Animal dengan ID x dari set.
      * @param x ID Animal yang ingin dihapus.
      */
    void RemoveEnemy(int x);
    /** @brief Mengecek status Animal.
      * Memeriksa apakah Animal dengan ID x merupakan musuh.
      * @param x ID Animal yang ingin diperiksa.
      * @return Nilai true/false apakah merupakan musuh.
      */
    bool IsEnemy(int x);
    /** @brief Getter nilai ID.
      * @return Nilai ID.
      */
    int GetID();
    /** @brief Menentukan lokasi Animal.
      * Mengubah lokasi Animal menjadi di posisi (_x,_y).
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      */
    void SetLocation(int _x, int _y);
    /** @brief Getter nilai absis
      * @return Nilai absis.
      */
    int GetX() const;
    /** @brief Getter nilai ordinat
      * @return Nilai ordinat.
      */
    int GetY() const;
    /** @brief Getter nilai is_wild. 
      * @return Nilai is_wild.
      */
    bool GetBehavior();
    /** @brief Mengembalikan character untuk proses render.
      * @return Karakter untuk dirender.
      */
    char Render();
    
  private:
    int ID;
    bool is_wild;
    std::set<int> enemy;
    Point position;
    int limb_count;
    std::string skin_type;
    bool is_land_animal;
    bool is_water_animal;
    bool is_air_animal;
    int weight;
    bool eat_meat;
    bool eat_plant;
    int ratio_meat;
    int ratio_plant;
};

#endif