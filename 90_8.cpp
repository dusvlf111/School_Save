#include <iostream>
#include <string>

using namespace std;


int main() {
	cout << "input 5 name";
	char name[100];
	string max;
	int num =0;

	for (int i=0; i<5; i++){

		cin.getline(name, 100, ';');
		cout<< i+1 << ":" << name <<endl;

		if(num<=strlen(name)){
			num = strlen(name);
			max = name;
		}
	}
	cout << max;
}
