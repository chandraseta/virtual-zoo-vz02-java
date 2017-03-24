#include <ctime>
#include <cstdlib>
#include "cage.h"

Cage::Cage(int _type): type(_type) {
  nb_animal = 0;
}
void Cage::AddPoint(const Point& p) {
  area.insert(p);
}
void Cage::RemovePoint(const Point& p) {
  area.erase(p);
}
void Cage::AddAnimal(Animal& A) {
  if (nb_animal < int(area.size() / 10 * 3)) {
    if (!(A.GetBehavior())) {
      animal.push_back(A);
      nb_animal++;
    } else {
      bool placeable = true;
      for (auto it = animal.begin(); it < animal.end() && placeable; ++it) {
        placeable = A.IsEnemy(it->GetID());
      }
      if (placeable) {
        animal.push_back(A);
        nb_animal++;
      }
    }
  }
}
void Cage::RemoveAnimal(int i) {
  if (i < animal.size()) {
    animal.erase(animal.begin() + i);
    nb_animal--;
  }
}
void Cage::MoveAnimal() {
  srand(time(NULL));
  for (int i = 0; i < animal.size(); ++i) {
    char movement = rand() % 4;
    bool movement_in_cage;
    int no_of_tries = 0;
    do {
      animal[i].Move(movement);
      movement_in_cage = area.find(animal[i].GetPosition()) != area.end();
      if (!movement_in_cage) {
        movement = (movement + 2) % 4;
        animal[i].Move(movement);
        movement = (movement + 3) % 4;
        no_of_tries++;
      }
    } while (!movement_in_cage && no_of_tries < 4);
  }
}
set<Point>& Cage::GetArea() {
  return area;
}
vector<Animal>& Cage::GetAnimal() {
  return animal;
}