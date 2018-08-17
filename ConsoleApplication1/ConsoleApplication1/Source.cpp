#include <iostream>
using namespace std;

double getLength()
{
	double length;
	cout << "Enter the legnth: ";
	cin >> length;
	return length;

}

double getWidth()
{
	double width;
	cout << "Enter the width: ";
	cin >> width;
	return width;
}

double getArea(double lenght, double width)
{
	double area;
	area = lenght * width;
	return area;
}

void displayData(double length, double width, double area)
{
	cout << length << " " << width << " " << area << endl;
	return;
}

int main()
{
	double length, width, area;

	length = getLength();
	width = getWidth();
	area = getArea(length, width);
	displayData(length, width, area);

	return 0;
}