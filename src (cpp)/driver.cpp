#include <cstdlib>
#include <ctime>
#include <fstream>
#include <iostream>
#include <queue>
#include <sstream>
#include <string>
#include "driver.h"

const string fname = "layout.in";

Driver::Driver() {
  InitZoo();

  int pil;
  do {
    if (system("CLS")) system("clear");
    do {
      cout << "---VIRTUAL ZOO---\n\n"
           << "1. Display Virtual Zoo\n"
           << "2. Tour Virtual Zoo\n"
           << "3. Jumlah Makanan Dikonsumsi\n"
           << "0. Keluar\n"
           << "Pilihan: ";
      cin >> pil;
    } while (pil < 0 || pil > 3);
    switch (pil) {
      case 1: DisplayZoo(); break;
      case 2: TourZoo(); break;
      case 3: ConsumedFood(); break;
    }
  } while (pil != 0);
}
void Driver::DisplayZoo() {
  if (system("CLS")) system("clear");
  cout << "---DISPLAY ZOO---\n\n";
  int ux, uy, lx, ly;
  cout << "Masukkan koordinat batas atas kiri (X Y): ";
  cin >> ux >> uy;
  cout << "Masukkan koordinat batas bawah kanan (X Y): ";
  cin >> lx >> ly;
  ux = (ux < 0) ? 0 : ((ux >= LENGTH) ? LENGTH - 1 : ux);
  uy = (uy < 0) ? 0 : ((uy >= WIDTH) ? WIDTH - 1 : uy);
  lx = (lx < 0) ? 0 : ((lx >= LENGTH) ? LENGTH - 1 : lx);
  ly = (ly < 0) ? 0 : ((ly >= WIDTH) ? WIDTH - 1 : ly);
  zoo.Render(visitor);
  zoo.Print(ux,uy,lx,ly);
  cin.get();
  cin.get();
}
void Driver::TourZoo() {
  if (system("CLS")) system("clear");
  Tour();
}
void Driver::ConsumedFood() {
  int total_meat = 0, total_plant = 0;
  vector<Cage> cages = zoo.GetCages();
  for (auto &c: cages) {
    vector<Animal> animal = c.GetAnimal();
    for (auto &a: animal) {
      total_meat += a.GetReqMeat();
      total_plant += a.GetReqPlant();
    }
  }

  if (system("CLS")) system("clear");
  cout << "---MAKANAN DIKONSUMSI---\n\n"
       << "Jumlah makanan yang dikonsumsi semua hewan dalam zoo setiap hari:\n"
       << "Daging:   " << total_meat << "\t kg\n"
       << "Tumbuhan: " << total_plant << "\t kg\n";
  cin.get();
  cin.get();
}
void Driver::InitZoo() {
  ifstream inf;
  inf.open(fname, ios::in);
  string instr;

  for (int i = 0; i < WIDTH; ++i) {
    // Initialize cells
    getline(inf, instr);
    for (int j = 0; j < LENGTH; ++j) {
      switch (instr[j]) {
        case 'w':
          zoo.SetTile(new Cell(false,"WaterHabitat","",false,false),i,j); break;
        case 'l':
          zoo.SetTile(new Cell(false,"LandHabitat","",false,false),i,j); break;
        case 'a':
          zoo.SetTile(new Cell(false,"AirHabitat","",false,false),i,j); break;
        case '.':
          zoo.SetTile(new Cell(true,"Road","",false,false),i,j); break;
        case '>':
          zoo.SetTile(new Cell(true,"Road","",true,false),i,j); break;
        case '<':
          zoo.SetTile(new Cell(true,"Road","",false,true),i,j); break;
        case '*':
          zoo.SetTile(new Cell(false,"Park","",false,false),i,j); break;
        case 'R':
          zoo.SetTile(new Cell(false,"Restaurant","",false,false),i,j); break;
        default:
          zoo.SetTile(new Cell(false,"","",false,false),i,j); break;
      }
    }
  }

  // Initialize cage
  while (instr != "######") {
    Cage* c = new Cage();
    getline(inf,instr);
    while (instr[0] != '-') {
      int x, y;
      istringstream(instr) >> y >> x;
      c->AddPoint(Point(x,y));
      getline(inf,instr);
    }
    getline(inf,instr);
    queue<Animal*> wild;
    while (instr[0] != '#') {
      string species;
      int x, y, w;
      istringstream(instr) >> species >> y >> x >> w;
      Animal* a = NULL;
      if (species == "Wolf") {
        a = new Animal(1,x,y,w);
      } else if (species == "Lion") {
        a = new Animal(2,x,y,w);
      } else if (species == "Tiger") {
        a = new Animal(3,x,y,w);
      } else if (species == "Zebra") {
        a = new Animal(4,x,y,w);
      } else if (species == "Monkey") {
        a = new Animal(5,x,y,w);
      } else if (species == "Giraffe") {
        a = new Animal(6,x,y,w);
      } else if (species == "Elephant") {
        a = new Animal(7,x,y,w);
      } else if (species == "Crocodile") {
        a = new Animal(8,x,y,w);
      } else if (species == "Python") {
        a = new Animal(9,x,y,w);
      } else if (species == "Komodo") {
        a = new Animal(10,x,y,w);
      } else if (species == "Iguana") {
        a = new Animal(11,x,y,w);
      } else if (species == "Chameleon") {
        a = new Animal(12,x,y,w);
      } else if (species == "Shark") {
        a = new Animal(13,x,y,w);
      } else if (species == "Clownfish") {
        a = new Animal(14,x,y,w);
      } else if (species == "Barracuda") {
        a = new Animal(15,x,y,w);
      } else if (species == "Owl") {
        a = new Animal(16,x,y,w);
      } else if (species == "Eagle") {
        a = new Animal(17,x,y,w);
      } else if (species == "Colibri") {
        a = new Animal(18,x,y,w);
      } else if (species == "Peacock") {
        a = new Animal(19,x,y,w);
      } else if (species == "Duck") {
        a = new Animal(20,x,y,w);
      } else if (species == "WildColibri") {
        wild.push(new Animal(21,x,y,w));
      } else {
        wild.push(new Animal(0,x,y,w));
      }
      if (a != NULL)
        c->AddAnimal(*a);
      getline(inf,instr);
    }
    while (!wild.empty()) {
      c->AddAnimal(*wild.front());
      wild.pop();
    }
    zoo.InsertCage(*c);
  }

  inf.close();
}
void Driver::Tour() {
  // Matrix of visited
  bool visited[WIDTH][LENGTH];
  for (int i = 0; i < WIDTH; ++i) {
    for (int j = 0; j < LENGTH; ++j) {
      visited[i][j] = !(zoo.GetMap()[i][j]->IsAccessible());
    }
  }
  zoo.ListAllEntranceExit();

  // Choose entrance
  srand(time(NULL));
  auto it = zoo.GetEntrance().begin();
  advance(it, rand() % zoo.GetEntrance().size());
  Point loc = *it;
  visitor.SetPosition(loc);
  visited[loc.GetY()][loc.GetX()] = true;

  bool on_exit, no_more_moves = false;
  do {
    // Output map
    if (system("CLS")) system("clear");
    cout << "---TOUR ZOO---\n\n";
    zoo.Render(visitor);
    zoo.Print();

    // Interact
    for (auto &it: zoo.GetCages()) {
      bool adjacent = it.GetArea().count(loc.Up()) + it.GetArea().count(loc.Down()) +
                      it.GetArea().count(loc.Left()) + it.GetArea().count(loc.Right()) > 0;
      if (adjacent) {
        cout << '\n';
        for (int j = 0; j < it.GetAnimal().size(); ++j) {
          it.GetAnimal()[j].Interact();
        }
      }
    }
    cin.get();

    on_exit = zoo.GetExit().find(visitor.GetPosition()) != zoo.GetExit().end();
    if (!on_exit) {
      // Move
      srand(time(NULL));
      char movement = rand() * rand() % 4;
      bool movement_in_range;
      int no_of_tries = 0;
      do {
        visitor.Move(movement);
        loc = visitor.GetPosition();
        movement_in_range = (visited[loc.GetY()][loc.GetX()] == false &&
                              loc.GetY() >= 0 && loc.GetY() < WIDTH &&
                              loc.GetX() >= 0 && loc.GetX() < LENGTH);
        if (!movement_in_range) {
          if (no_of_tries < 4) {
            movement = (movement + 2) % 4;
            visitor.Move(movement);
            movement = (movement + 3) % 4;
            no_of_tries++;
          } else {
            no_more_moves = true;
          }
        } else {
          visited[loc.GetY()][loc.GetX()] = true;
        }
      } while (!movement_in_range && !no_more_moves);

      // Move animals
      for (auto &it: zoo.GetCages()) {
        it.MoveAnimal();
      }
    }
  } while (!on_exit && !no_more_moves);

  if (on_exit) {
    cout << "\nPengunjung keluar dari pintu keluar\n";
  } else {
    cout << "\nPengunjung tidak dapat bergerak lagi\n";
  }
  cin.get();

  // Reset visitor
  visitor.ResetPosition();
}