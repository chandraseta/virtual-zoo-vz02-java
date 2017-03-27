#include "person.h"

Person::Person() {
  ResetPosition();
}
Point Person::GetPosition() const {
  return position;
}
void Person::SetPosition(const Point& p) {
  position = p;
}
void Person::SetPosition(int x, int y) {
  position.SetX(x);
  position.SetY(y);
}
char Person::Render() const {
  return '?';
}
void Person::Move(int movement) {
  if (movement == 1) {
    position.SetY(position.GetY()-1);
  } else if (movement == 2) {
    position.SetX(position.GetX()+1);
  } else if (movement == 3) {
    position.SetY(position.GetY()+1);
  } else {
    position.SetX(position.GetX()-1);
  }
}
void Person::ResetPosition() {
  SetPosition(-1,-1);
}