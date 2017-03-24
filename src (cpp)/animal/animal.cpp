
#include "animal.h"

Animal::Animal(int _ID, int _x, int _y, int _weight) {
  ID = _ID;
  position.SetX(_x);
  position.SetY(_y);
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
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
    for (int id = ID; id <= 21; id++) {
      AddEnemy(id);
    }
  }
  else if (ID == 1) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 2) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 3) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 4) {
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
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 5) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 6) {
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
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 7) {
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
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 8) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 9) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 10) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 11) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 12) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 13) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 14) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 15) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 16) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 17) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 18) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
  }
  else if (ID == 19) {
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
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 20) {
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
    AnimalFood::AddTotalMeat(ratio_meat * weight / 100);
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
  }
  else if (ID == 21) {
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
    AnimalFood::AddTotalPlant(ratio_plant * weight / 100);
    AddEnemy(2);
    AddEnemy(3);
    AddEnemy(9);
    AddEnemy(19);
  }
}

void Animal::Interact() {
  if (ID == 0) {
    std::cout << "The wild bunny is looking at you ";
    std::cout << "with murderous intent" << std::endl;
  }
  else if (ID == 1) {
    std::cout << "The wolf is howling" << std::endl;
  }
  else if (ID == 2) {
    std::cout << "The lion is roaring" << std::endl;
  }
  else if (ID == 3) {
    std::cout << "The tiger is graciously lying on the grass" << std::endl;
  }
  else if (ID == 4) {
    std::cout << "The zebra is running at the grass field" << std::endl;
  }
  else if (ID == 5) {
    std::cout << "The monkey is peeling a banana" << std::endl;
  }
  else if (ID == 6) {
    std::cout << "The giraffe is looking down to you, literally" << std::endl;
  }
  else if (ID == 7) {
    std::cout << "The elephant is playing with its own trunk" << std::endl;
  }
  else if (ID == 8) {
    std::cout << "The crocodile is laying still on a slab of rock" << std::endl;
  }
  else if (ID == 9) {
    std::cout << "The python is slithering across the ground" << std::endl;
  }
  else if (ID == 10) {
    std::cout << "The komodo is looking at you intensely" << std::endl;
  }
  else if (ID == 11) {
    std::cout << "The iguana is calmly sleeping on a tree" << std::endl;
  }
  else if (ID == 12) {
    std::cout << "The chameleon can be barely seen" << std::endl;
  }
  else if (ID == 13) {
    std::cout << "The shark is staring at you menacingly" << std::endl;
  }
  else if (ID == 14) {
    std::cout << "The clownfish is not as funny as its name..." << std::endl;
  }
  else if (ID == 15) {
    std::cout << "The barracuda completely ignores you" << std::endl;
  }
  else if (ID == 16) {
    std::cout << "The duck just quacked loudly" << std::endl;
  }
  else if (ID == 17) {
    std::cout << "The owl is hooting randomly" << std::endl;
  }
  else if (ID == 18) {
    std::cout << "The eagle is roosting majestically on a tree" << std::endl;
  }
  else if (ID == 19) {
    std::cout << "The colibri is looking at you, ";
    std::cout << "apparently confused" << std::endl;
  }
  else if (ID == 20) {
    std::cout << "The peacock is showing off its beautiful feather" << std::endl;
  }
  else if (ID == 21) {
    std::cout << "The wild colibri is going to skewer your eyes" << std::endl;
  }
}
void Animal::Move(int movement) {
  if (movement == 1) {
    position.SetY(position.GetY()-1);
  }
  else if (movement == 2) {
    position.SetX(position.GetX()+1);
  }
  else if (movement == 3) {
    position.SetY(position.GetY()+1);
  }
  else {
    position.SetX(position.GetX()-1);
  }
}
bool Animal::GetBehavior() {
  return is_wild;
}
int Animal::GetReqMeat() {
  return ratio_meat * weight / 100;
}
int Animal::GetReqPlant() {
  return ratio_plant * weight / 100;
}
Point Animal::GetPosition() {
  return position;
}
bool Animal::IsLandAnimal() {
  return is_land_animal;
}
bool Animal::IsWaterAnimal() {
  return is_water_animal;
}
bool Animal::IsAirAnimal() {
  return is_air_animal;
}
bool Animal::IsHerbivore() {
  return !eat_meat && eat_plant;
}
bool Animal::IsCarnivore() {
  return eat_meat && !eat_plant;
}
bool Animal::IsOmnivore() {
  return eat_meat && eat_plant;
}
void Animal::AddEnemy(int x) {
  enemy.insert(x);
}
void Animal::RemoveEnemy(int x) {
  enemy.erase(x);
}
bool Animal::IsEnemy(int x) {
  if (!is_wild) {
    return false;
  }
  else {
    return(enemy.find(x) != enemy.end());
  }
}
int Animal::GetID() {
  return ID;
}
void Animal::SetLocation(int _x, int _y) {
  position.SetX(_x);
  position.SetY(_y);
}
int Animal::GetX() const {
  return position.GetX();
}
int Animal::GetY() const {
  return position.GetY();
}
char Animal::Render() {
  return 'O';
}