#include <iostream>
using namespace std;

class Color{
	int red, green, blue;

public:
	Color() {red = green = blue = 0; }
	Color(int r, int g, int b){ red = r; green = g; blue = b; }
	void setColor(int r, int g, int b){ red = r; green = g; blue = b; }
	void show() { cout << red << ' ' << green << ' ' << blue << endl; }
};
int main(){
	Color screenColor(255, 0, 0);
	Color *p;
	p =  &screenColor;
	p->show();

	//cout << p << endl;
	// p는 screenColor 의 주소

	Color colors[3];

	cout << colors<<endl;
	p = colors;
	// colors 는 배열의 시작 주소
	p[0].setColor(255, 0, 0);
	p[1].setColor(0, 255, 0);
	p[2].setColor(0, 0, 255);

	for (int i = 0; i < 3; i++){
		p[i].show();
	}
		


}
