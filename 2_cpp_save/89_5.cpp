#include <iostream>
#include <string>
using namespace std;

int main(){

	cout << "rite sting:	";
	string str;
	cin >> str;
	int count = 0;
	for(int i=0; i<str.length(); i++)
		if(str[i]=='x')
			count = count+1;

	cout<< count;
}
