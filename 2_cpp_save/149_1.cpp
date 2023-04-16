#include <iostream>
using namespace std;

class Tower{

	int meter;

	public:
		Tower(){meter = 1;}
		Tower(int m){meter = m;}
		int getHeight();
};

int Tower::getHeight(){
	return meter;
}

int main(){
	Tower myTower;// 1m
	Tower seoulTower(100); // 100m
	cout << "hight is:	"<< myTower.getHeight()<<"m"<< endl;
	cout << "hight is:	"<< seoulTower.getHeight()<<"m"<< endl;
}
