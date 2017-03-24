#include "cell.h"

Cell::Cell(bool _accessible, const std::string& _type, 
                             const std::string& _name, 
                             bool _entrance, 
                             bool _exit): type(_type), name(_name) {
  if ((type == "AirHabitat") || (type == "LandHabitat") ||
    (type == "WaterHabitat")) {
    is_accessible = false;
  } else {
    is_accessible = _accessible;
  }
  if ((type == "Road") || (type == "AirHabitat") ||
      (type == "LandHabitat") || (type == "WaterHabitat")) {
    name = "";
  }
  if (type == "Road") {
    is_entrance = _entrance; 
    is_exit = _exit;
  } else {
    is_entrance = false;
    is_exit = false;
  }
}
Cell::Cell(Cell& C): type(C.type), name(C.name) {
  is_accessible = C.is_accessible;
  is_entrance = C.is_entrance;
  is_exit = C.is_exit;
}
bool Cell::IsAccessible() const {
  return is_accessible;
}
std::string Cell::GetType() const {
  return type;
}
std::string Cell::GetName() const {
  return name;
}
bool Cell::IsEntrance() const {
  return is_entrance;
}
bool Cell::IsExit() const {
  return is_exit;
}
char Cell::Render() const {
  if (type == "AirHabitat")
    return 'a';
  else if (type == "LandHabitat")
    return 'l';
  else if (type == "WaterHabitat")
    return 'w';
  else if (type == "Road")
    return '.';
  else if (type == "Park")
    return '*';
  else if (type == "Restaurant")
    return 'R';
  else
    return ' ';
}