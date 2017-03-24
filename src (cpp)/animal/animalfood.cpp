#include "animalfood.h"

int AnimalFood::total_req_meat = 0;
int AnimalFood::total_req_plant = 0;

void AnimalFood::AddTotalMeat(int req_meat) {
	total_req_meat += req_meat;
}
void AnimalFood::AddTotalPlant(int req_plant) {
	total_req_plant += req_plant;
}
int AnimalFood::GetTotalMeat() {
	return total_req_meat;
}
int AnimalFood::GetTotalPlant() {
	return total_req_plant;
}