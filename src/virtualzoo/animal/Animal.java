package virtualzoo.animal;

import java.awt.Point;
import java.util.Set;

/**
 * Kelas Animal yang menangani semua jenis hewan
 * yang ada di dalam Zoo.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 2.0
 * @since 2.0
 */
public class Animal {

  /**
   * ID unik untuk setiap jenis animal
   */
  private int ID;
  /**
   * Banyaknya alat gerak yang dimiliki Animal.
   */
  private int limb_count;
  /**
   * Jenis kulit yang dimiliki Aninmal.
   */
  private String skin_type;
  /**
   * Atribut yang menentukan apakah Animal dapat hidup di habitat darat.
   */
  private boolean is_land_animal;
  /**
   * Atribut yang menentukan apakah Animal dapat hidup di habitat air.
   */
  private boolean is_water_animal;
  /**
   * Atribut yang menentukan apakah Animal dapat hidup di habitat udara.
   */
  private boolean is_air_animal;
  /**
   * Sebuah point yang menyatakan lokasi dari Animal.
   */
  private Point position;
  /**
   * Atribut menentukan apakah perilaku Animal jinak atau liar
   */
  private boolean is_wild;
  /**
   * Berisi ID Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek Animal terkait.
   */
  private Set<Integer> enemy;
  /**
   * Nilai berat Animal (dalam kilogram).
   */
  private int weight;
  /**
   * Atribut yang menentukan apakah Animal memakan daging atau tidak.
   */
  private boolean eat_meat;
  /**
   * Atribut yang menentukan apakah Animal memakan tumbuhan atau tidak.
   */
  private boolean eat_plant;
  /**
   * Nilai rasio berat daging yang diperlukan terhadap berat Animal.
   */
  private int ratio_meat;
  /**
   * Nilai rasio berat tumbuhan yang diperlukan terhadap berat Animal.
   */
  private int ratio_plant;

  /**
   * Constructor.
   *
   * Menciptakan Animal dengan jenis tertentu sesuai _ID, dengan posisi (_x,_y)
   * dan memiliki berat _weight.
   *
   * @param _ID Digunakan sebagai penentu jenis Animal.
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat Animal.
   */
  public Animal(int _ID, int _x, int _y, int _weight) {
    ID = _ID;
    position.setLocation(_x, _y);
    weight = _weight;
    if (ID == 0) {
      limb_count = 4;
      skin_type = "Hairy";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = false;
      eat_plant = true;
      ratio_meat = 0;
      ratio_plant = 90;
      is_wild = true;
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
      for (int id = 0; id <= 21; id++) {
        addEnemy(id);
      }
    } else if (ID == 1) {
      limb_count = 4;
      skin_type = "Hairy";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = false;
      ratio_meat = 50;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 2) {
      limb_count = 4;
      skin_type = "Hairy";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = false;
      ratio_meat = 60;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 3) {
      limb_count = 4;
      skin_type = "Hairy";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = false;
      ratio_meat = 50;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 4) {
      limb_count = 4;
      skin_type = "Hairy";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = false;
      eat_plant = true;
      ratio_meat = 0;
      ratio_plant = 45;
      is_wild = false;
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 5) {
      limb_count = 4;
      skin_type = "Hairy";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = true;
      ratio_meat = 10;
      ratio_plant = 40;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 6) {
      limb_count = 4;
      skin_type = "Hairy";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = false;
      eat_plant = true;
      ratio_meat = 0;
      ratio_plant = 60;
      is_wild = false;
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 7) {
      limb_count = 4;
      skin_type = "Hairy";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = false;
      eat_plant = true;
      ratio_meat = 0;
      ratio_plant = 80;
      is_wild = false;
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 8) {
      limb_count = 4;
      skin_type = "Scute";
      is_land_animal = true;
      is_water_animal = true;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = false;
      ratio_meat = 60;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 9) {
      limb_count = 4;
      skin_type = "Scute";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = false;
      ratio_meat = 40;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 10) {
      limb_count = 4;
      skin_type = "Scute";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = false;
      ratio_meat = 70;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 11) {
      limb_count = 4;
      skin_type = "Scute";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = true;
      ratio_meat = 20;
      ratio_plant = 40;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 12) {
      limb_count = 4;
      skin_type = "Scute";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = true;
      ratio_meat = 20;
      ratio_plant = 50;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 13) {
      limb_count = 0;
      skin_type = "Scale";
      is_land_animal = false;
      is_water_animal = true;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = false;
      ratio_meat = 70;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 14) {
      limb_count = 0;
      skin_type = "Scale";
      is_land_animal = false;
      is_water_animal = true;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = true;
      ratio_meat = 30;
      ratio_plant = 40;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 15) {
      limb_count = 0;
      skin_type = "Scale";
      is_land_animal = false;
      is_water_animal = true;
      is_air_animal = false;
      eat_meat = true;
      eat_plant = false;
      ratio_meat = 60;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 16) {
      limb_count = 2;
      skin_type = "Feather";
      is_land_animal = true;
      is_water_animal = true;
      is_air_animal = true;
      eat_meat = true;
      eat_plant = true;
      ratio_meat = 30;
      ratio_plant = 30;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 17) {
      limb_count = 2;
      skin_type = "Feather";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = true;
      eat_meat = true;
      eat_plant = false;
      ratio_meat = 60;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 18) {
      limb_count = 2;
      skin_type = "Feather";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = true;
      eat_meat = true;
      eat_plant = true;
      ratio_meat = 60;
      ratio_plant = 0;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
    } else if (ID == 19) {
      limb_count = 2;
      skin_type = "Feather";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = true;
      eat_meat = false;
      eat_plant = true;
      ratio_meat = 0;
      ratio_plant = 60;
      is_wild = false;
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 20) {
      limb_count = 2;
      skin_type = "Feather";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = true;
      eat_meat = true;
      eat_plant = true;
      ratio_meat = 20;
      ratio_plant = 40;
      is_wild = false;
      AnimalFood.addTotalMeat(ratio_meat * weight / 100);
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
    } else if (ID == 21) {
      limb_count = 2;
      skin_type = "Feather";
      is_land_animal = true;
      is_water_animal = false;
      is_air_animal = true;
      eat_meat = false;
      eat_plant = true;
      ratio_meat = 0;
      ratio_plant = 60;
      is_wild = true;
      AnimalFood.addTotalPlant(ratio_plant * weight / 100);
      addEnemy(2);
      addEnemy(3);
      addEnemy(9);
      addEnemy(19);
    }
  }

  /**
   * Mengatur interaksi dengan Animal sesuai dengan ID-nya (jenisnya).
   */
  public void interact() {
    if (ID == 0) {
      System.out.println("The wild bunny is looking at you with murderous intent");
    } else if (ID == 1) {
      System.out.println("The wolf is howling");
    } else if (ID == 2) {
      System.out.println("The lion is roaring");
    } else if (ID == 3) {
      System.out.println("The tiger is graciously lying on the grass");
    } else if (ID == 4) {
      System.out.println("The zebra is running at the grass field");
    } else if (ID == 5) {
      System.out.println("The monkey is peeling a banana");
    } else if (ID == 6) {
      System.out.println("The giraffe is looking down to you, literally");
    } else if (ID == 7) {
      System.out.println("The elephant is playing with its own trunk");
    } else if (ID == 8) {
      System.out.println("The crocodile is laying still on a slab of rock");
    } else if (ID == 9) {
      System.out.println("The python is slithering across the ground");
    } else if (ID == 10) {
      System.out.println("The komodo is looking at you intensely");
    } else if (ID == 11) {
      System.out.println("The iguana is calmly sleeping on a tree");
    } else if (ID == 12) {
      System.out.println("The chameleon can be barely seen");
    } else if (ID == 13) {
      System.out.println("The shark is staring at you menacingly");
    } else if (ID == 14) {
      System.out.println("The clownfish is not as funny as its name...");
    } else if (ID == 15) {
      System.out.println("The barracuda completely ignores you");
    } else if (ID == 16) {
      System.out.println("The duck just quacked loudly");
    } else if (ID == 17) {
      System.out.println("The owl is hooting randomly");
    } else if (ID == 18) {
      System.out.println("The eagle is roosting majestically on a tree");
    } else if (ID == 19) {
      System.out.println("The colibri is looking at you, apparently confused");
    } else if (ID == 20) {
      System.out.println("The peacock is showing off its beautiful feather");
    } else if (ID == 21) {
      System.out.println("The wild colibri is going to skewer your eyes");
    }
  }

  /**
   * Menggerakkan Animal dengan mengubah position-nya.
   *
   * @param movement Sebuah nilai yang menentukan arah gerak Animal.
   */
  public void move(int movement) {
    if (movement == 1) {
      position.setLocation(position.getX(), position.getY() - 1);
    } else if (movement == 2) {
      position.setLocation(position.getX() + 1, position.getY());
    } else if (movement == 3) {
      position.setLocation(position.getX(), position.getY() + 1);
    } else {
      position.setLocation(position.getX() - 1, position.getY());
    }
  }

  /**
   * Mengembalikan nilai ID Animal untuk mengetahui jenisnya.
   *
   * @return Nilai ID.
   */
  public int getID() {
    return ID;
  }

  /**
   * Mengembalikan sebuah Point yang berisi posisi Animal.
   *
   * @return Nilai position.
   */
  public Point getPosition() {
    return position;
  }

  /**
   * Mengubah posisi Animal menjadi (_x,_y).
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   */
  public void setPosition(int _x, int _y) {
    position.setLocation(_x, _y);
  }

  /**
   * Mengembalikan nilai absis posisi Animal.
   *
   * @return Nilai position.x;
   */
  public int getX() {
    return (int) position.getX();
  }

  /**
   * Mengembalikan nilai ordinat posisi Animal.
   *
   * @return Nilai position.y;
   */
  public int getY() {
    return (int) position.getY();
  }

  /**
   * Menentukan apakah Animal dapat hidup di habitat darat.
   *
   * @return Nilai is_land_animal.
   */
  public boolean isLandAnimal() {
    return is_land_animal;
  }

  /**
   * Menentukan apakah Animal dapat hidup di habitat air.
   *
   * @return Nilai is_water_animal.
   */
  public boolean isWaterAnimal() {
    return is_water_animal;
  }

  /**
   * Menentukan apakah Animal dapat hidup di habitat udara.
   *
   * @return Nilai is_air_animal.
   */
  public boolean isAirAnimal() {
    return is_air_animal;
  }

  /**
   * Menentukan apakah Animal yang dimaksud merupakan carnivora.
   *
   * @return Nilai true/false apakah Animal herbivora.
   */
  public boolean isHerbivore() {
    return (!eat_meat && eat_plant);
  }

  /**
   * Menentukan apakah Animal yang dimaksud merupakan carnivora.
   *
   * @return Nilai true/false apakah Animal carnivora.
   */
  public boolean isCarnivore() {
    return (eat_meat && !eat_plant);
  }

  /**
   * Menentukan apakah Animal yang dimaksud merupakan omnivora.
   *
   * @return Nilai true/false apakah Animal omnivora.
   */
  public boolean isOmnivore() {
    return (eat_meat && eat_plant);
  }

  /**
   * Menentukan kebutuhan makanan Animal yang berupa daging.
   *
   * @return Jumlah daging yang dibutuhkan.
   */
  public int getReqMeat() {
    return ratio_meat * weight / 100;
  }

  /**
   * Menentukan kebutuhan makanan Animal yang berupa tumbuhan.
   *
   * @return Jumlah tumbuhan yang diperlukan.
   */
  public int getReqPlant() {
    return ratio_plant * weight / 100;
  }

  /**
   * Mengembalikan apakah Animal memiliki sifat liar.
   *
   * @return Nilai is_wild.
   */
  public boolean getBehavior() {
    return is_wild;
  }

  /**
   * Menambahkan ANimal yang tidak bisa disatukan dalam satu kandang
   * dengan objek Animal terkait.
   *
   * @param id Nilai ID Animal yang akan ditambahkan
   */
  public void addEnemy(int id) {
    enemy.add(id);
  }

  /**
   * Menghapus Animal yang tidak bisa disatukan dalam satu kandang
   * dengan objek Animal terkait.
   * @param id
   */
  public void removeEnemy(int id) {
    enemy.remove(id);
  }

  public boolean isEnemy(int id) {
    if (!is_wild) {
      return false;
    } else {
      return enemy.contains(id);
    }
  }

  /**
   * Mengembalikan sebuah karakter untuk proses render.
   *
   * @return Sebuah char yang menandakan Animal.
   */
  public char render() {
    return 'O';
  }
}
