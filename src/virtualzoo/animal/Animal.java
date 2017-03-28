package virtualzoo.animal;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Kelas Animal yang menangani semua jenis hewan
 * yang ada di dalam Zoo.
 * </p>
 * @author Rionaldi Chandraseta - 13515077
 * @version 2.0
 * @since 2.0
 */
public class Animal {
  /**
   * <p>
   * ID unik untuk setiap jenis Animal.
   * </p>
   */
  private int id;
  /**
   * <p>
   * Banyaknya alat gerak yang dimiliki Animal.
   * </p>
   */
  private int limbCount;
  /**
   * <p>
   * Jenis kulit yang dimiliki Animal.
   * </p>
   */
  private String skinType;
  /**
   * <p>
   * Atribut yang menentukan apakah Animal dapat hidup di habitat darat.
   * </p>
   */
  private boolean isLandAnimal;
  /**
   * <p>
   * Atribut yang menentukan apakah Animal dapat hidup di habitat air.
   * </p>
   */
  private boolean isWaterAnimal;
  /**
   * <p>
   * Atribut yang menentukan apakah Animal dapat hidup di habitat udara.
   * </p>
   */
  private boolean isAirAnimal;
  /**
   * <p>
   * Sebuah Point yang menyatakan lokasi dari Animal.
   * </p>
   */
  private Point position = new Point(-1, -1);
  /**
   * <p>
   * Atribut menentukan apakah perilaku Animal jinak atau liar.
   * </p>
   */
  private boolean isWild;
  /**
   * <p>
   * Berisi ID Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek Animal terkait.
   * </p>
   */
  private Set<Integer> enemy = new HashSet<Integer>();
  /**
   * <p>
   * Nilai berat Animal (dalam kilogram).
   * </p>
   */
  private int weight;
  /**
   * <p>
   * Atribut yang menentukan apakah Animal memakan daging atau tidak.
   * </p>
   */
  private boolean eatMeat;
  /**
   * <p>
   * Atribut yang menentukan apakah Animal memakan tumbuhan atau tidak.
   * </p>
   */
  private boolean eatPlant;
  /**
   * <p>
   * Nilai rasio berat daging yang diperlukan terhadap berat Animal.
   * </p>
   */
  private int ratioMeat;
  /**
   * <p>
   * Nilai rasio berat tumbuhan yang diperlukan terhadap berat Animal.
   * </p>
   */
  private int ratioPlant;

  /**
   * <p>
   * Constructor
   *
   * Menciptakan Animal dengan jenis tertentu sesuai ID, dengan posisi (locX,locY)
   * dan memiliki berat animalWeight.
   * </p>
   * @param animalId Digunakan sebagai penentu jenis Animal
   * @param locX Nilai absis posisi
   * @param locY Nilai ordinat posisi
   * @param animalWeight Nilai berat Animal
   */
  public Animal(int animalId, int locX, int locY, int animalWeight) {
    id = animalId;
    position.setLocation(locX, locY);
    weight = animalWeight;
    if (animalId == 0) {
      limbCount = 4;
      skinType = "Hairy";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = false;
      eatPlant = true;
      ratioMeat = 0;
      ratioPlant = 90;
      isWild = true;
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
      for (int id = 0; id <= 21; id++) {
        addEnemy(id);
      }
    } else if (animalId == 1) {
      limbCount = 4;
      skinType = "Hairy";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = false;
      ratioMeat = 50;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 2) {
      limbCount = 4;
      skinType = "Hairy";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = false;
      ratioMeat = 60;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 3) {
      limbCount = 4;
      skinType = "Hairy";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = false;
      ratioMeat = 50;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 4) {
      limbCount = 4;
      skinType = "Hairy";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = false;
      eatPlant = true;
      ratioMeat = 0;
      ratioPlant = 45;
      isWild = false;
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 5) {
      limbCount = 4;
      skinType = "Hairy";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = true;
      ratioMeat = 10;
      ratioPlant = 40;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 6) {
      limbCount = 4;
      skinType = "Hairy";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = false;
      eatPlant = true;
      ratioMeat = 0;
      ratioPlant = 60;
      isWild = false;
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 7) {
      limbCount = 4;
      skinType = "Hairy";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = false;
      eatPlant = true;
      ratioMeat = 0;
      ratioPlant = 80;
      isWild = false;
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 8) {
      limbCount = 4;
      skinType = "Scute";
      isLandAnimal = true;
      isWaterAnimal = true;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = false;
      ratioMeat = 60;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 9) {
      limbCount = 4;
      skinType = "Scute";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = false;
      ratioMeat = 40;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 10) {
      limbCount = 4;
      skinType = "Scute";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = false;
      ratioMeat = 70;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 11) {
      limbCount = 4;
      skinType = "Scute";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = true;
      ratioMeat = 20;
      ratioPlant = 40;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 12) {
      limbCount = 4;
      skinType = "Scute";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = true;
      ratioMeat = 20;
      ratioPlant = 50;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 13) {
      limbCount = 0;
      skinType = "Scale";
      isLandAnimal = false;
      isWaterAnimal = true;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = false;
      ratioMeat = 70;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 14) {
      limbCount = 0;
      skinType = "Scale";
      isLandAnimal = false;
      isWaterAnimal = true;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = true;
      ratioMeat = 30;
      ratioPlant = 40;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 15) {
      limbCount = 0;
      skinType = "Scale";
      isLandAnimal = false;
      isWaterAnimal = true;
      isAirAnimal = false;
      eatMeat = true;
      eatPlant = false;
      ratioMeat = 60;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 16) {
      limbCount = 2;
      skinType = "Feather";
      isLandAnimal = true;
      isWaterAnimal = true;
      isAirAnimal = true;
      eatMeat = true;
      eatPlant = true;
      ratioMeat = 30;
      ratioPlant = 30;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 17) {
      limbCount = 2;
      skinType = "Feather";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = true;
      eatMeat = true;
      eatPlant = false;
      ratioMeat = 60;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 18) {
      limbCount = 2;
      skinType = "Feather";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = true;
      eatMeat = true;
      eatPlant = true;
      ratioMeat = 60;
      ratioPlant = 0;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
    } else if (animalId == 19) {
      limbCount = 2;
      skinType = "Feather";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = true;
      eatMeat = false;
      eatPlant = true;
      ratioMeat = 0;
      ratioPlant = 60;
      isWild = false;
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 20) {
      limbCount = 2;
      skinType = "Feather";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = true;
      eatMeat = true;
      eatPlant = true;
      ratioMeat = 20;
      ratioPlant = 40;
      isWild = false;
      AnimalFood.addTotalMeat(ratioMeat * animalWeight / 100);
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
    } else if (animalId == 21) {
      limbCount = 2;
      skinType = "Feather";
      isLandAnimal = true;
      isWaterAnimal = false;
      isAirAnimal = true;
      eatMeat = false;
      eatPlant = true;
      ratioMeat = 0;
      ratioPlant = 60;
      isWild = true;
      AnimalFood.addTotalPlant(ratioPlant * animalWeight / 100);
      addEnemy(2);
      addEnemy(3);
      addEnemy(9);
      addEnemy(19);
    }
  }

  /**
   * Mengatur interaksi dengan Animal sesuai dengan Id-nya (jenisnya).
   */
  public void interact() {
    if (id == 0) {
      System.out.println("The wild bunny is looking at you with murderous intent");
    } else if (id == 1) {
      System.out.println("The wolf is howling");
    } else if (id == 2) {
      System.out.println("The lion is roaring");
    } else if (id == 3) {
      System.out.println("The tiger is graciously lying on the grass");
    } else if (id == 4) {
      System.out.println("The zebra is running at the grass field");
    } else if (id == 5) {
      System.out.println("The monkey is peeling a banana");
    } else if (id == 6) {
      System.out.println("The giraffe is looking down to you, literally");
    } else if (id == 7) {
      System.out.println("The elephant is playing with its own trunk");
    } else if (id == 8) {
      System.out.println("The crocodile is laying still on a slab of rock");
    } else if (id == 9) {
      System.out.println("The python is slithering across the ground");
    } else if (id == 10) {
      System.out.println("The komodo is looking at you intensely");
    } else if (id == 11) {
      System.out.println("The iguana is calmly sleeping on a tree");
    } else if (id == 12) {
      System.out.println("The chameleon can be barely seen");
    } else if (id == 13) {
      System.out.println("The shark is staring at you menacingly");
    } else if (id == 14) {
      System.out.println("The clownfish is not as funny as its name...");
    } else if (id == 15) {
      System.out.println("The barracuda completely ignores you");
    } else if (id == 16) {
      System.out.println("The duck just quacked loudly");
    } else if (id == 17) {
      System.out.println("The owl is hooting randomly");
    } else if (id == 18) {
      System.out.println("The eagle is roosting majestically on a tree");
    } else if (id == 19) {
      System.out.println("The colibri is looking at you, apparently confused");
    } else if (id == 20) {
      System.out.println("The peacock is showing off its beautiful feather");
    } else if (id == 21) {
      System.out.println("The wild colibri is going to skewer your eyes");
    }
  }

  /**
   * <p>
   * Menggerakkan Animal dengan mengubah position-nya.
   * </p>
   * @param movement Sebuah nilai yang menentukan arah gerak Animal
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
   * <p>
   * Mengembalikan nilai ID Animal untuk mengetahui jenisnya.
   * </p>
   * @return Nilai ID
   */
  public int getId() {
    return id;
  }

  /**
   * <p>
   * Mengembalikan sebuah Point yang berisi posisi Animal.
   * </p>
   * @return Nilai position
   */
  public Point getPosition() {
    return position;
  }

  /**
   * <p>
   * Mengubah posisi Animal menjadi (locX,locY).
   * </p>
   * @param locX Nilai absis posisi
   * @param locY Nilai ordinat posisi
   */
  public void setPosition(int locX, int locY) {
    position.setLocation(locX, locY);
  }

  /**
   * <p>
   * Mengembalikan nilai absis posisi Animal.
   * </p>
   * @return Nilai position.x
   */
  public int getX() {
    return (int) position.getX();
  }

  /**
   * <p>
   * Mengembalikan nilai ordinat posisi Animal.
   * </p>
   * @return Nilai position.y
   */
  public int getY() {
    return (int) position.getY();
  }

  /**
   * <p>
   * Menentukan apakah Animal dapat hidup di habitat darat.
   * </p>
   * @return Nilai isLandAnimal
   */
  public boolean getIsLandAnimal() {
    return isLandAnimal;
  }

  /**
   * <p>
   * Menentukan apakah Animal dapat hidup di habitat air.
   * </p>
   * @return Nilai isWaterAnimal
   */
  public boolean getIsWaterAnimal() {
    return isWaterAnimal;
  }

  /**
   * <p>
   * Menentukan apakah Animal dapat hidup di habitat udara.
   * </p>
   * @return Nilai isAirAnimal
   */
  public boolean getIsAirAnimal() {
    return isAirAnimal;
  }

  /**
   * <p>
   * Menentukan apakah Animal yang dimaksud merupakan carnivora.
   * </p>
   * @return Nilai true/false apakah Animal herbivora.
   */
  public boolean isHerbivore() {
    return (!eatMeat && eatPlant);
  }

  /**
   * <p>
   * Menentukan apakah Animal yang dimaksud merupakan carnivora.
   * </p>
   * @return Nilai true/false apakah Animal carnivora.
   */
  public boolean isCarnivore() {
    return (eatMeat && !eatPlant);
  }

  /**
   * <p>
   * Menentukan apakah Animal yang dimaksud merupakan omnivora.
   * </p>
   * @return Nilai true/false apakah Animal omnivora.
   */
  public boolean isOmnivore() {
    return (eatMeat && eatPlant);
  }

  /**
   * <p>
   * Mengembalikan nilai berat Animal (dalam kilogram).
   * </p>
   * @return Nilai weight.
   */
  public int getWeight() {
    return weight;
  }

  /**
   * <p>
   * Menentukan kebutuhan makanan Animal yang berupa daging.
   * </p>
   * @return Jumlah daging yang dibutuhkan
   */
  public int getReqMeat() {
    return ratioMeat * weight / 100;
  }

  /**
   * <p>
   * Menentukan kebutuhan makanan Animal yang berupa tumbuhan.
   * </p>
   * @return Jumlah tumbuhan yang diperlukan.
   */
  public int getReqPlant() {
    return ratioPlant * weight / 100;
  }

  /**
   * <p>
   * Mengembalikan apakah Animal memiliki sifat liar.
   * </p>
   * @return Nilai isWild.
   */
  public boolean getBehavior() {
    return isWild;
  }

  /**
   * <p>
   * Menambahkan ANimal yang tidak bisa disatukan dalam satu kandang
   * dengan objek Animal terkait.
   * </p>
   * @param id Nilai ID Animal yang akan ditambahkan
   */
  public void addEnemy(int id) {
    enemy.add(id);
  }

  /**
   * <p>
   * Menghapus Animal yang tidak bisa disatukan dalam satu kandang
   * dengan objek Animal terkait.
   * </p>
   * @param id Nilai ID Animal yang akan dihapus
   */
  public void removeEnemy(int id) {
    enemy.remove(id);
  }

  /**
   * <p>
   * Memeriksa apakah Animal dengan ID x merupakan musuh.
   * </p>
   * @param id Animal yang ingin diperiksa
   * @return Nilai true/false apakah merupakan musuh
   */
  public boolean isEnemy(int id) {
    if (!isWild) {
      return false;
    } else {
      return enemy.contains(id);
    }
  }

  /**
   * <p>
   * Mengembalikan sebuah karakter untuk proses render.
   * </p>
   * @return Sebuah char yang menandakan Animal
   */
  public char render() {
    return 'O';
  }
}
