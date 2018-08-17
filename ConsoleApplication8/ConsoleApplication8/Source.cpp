#include <iostream>
#include <string>
using namespace std;

struct employeeInfo
{
	string name;
	int hours;
	float payRate;
};

int main()
{
	employeeInfo E1 = { "Michael Scott", 40, 25.0 };
	
	E1.name = "Michael Scott";
	E1.hours = 40;
	E1.payRate = 25.0;

	cout << E1.name << endl;
	cout << "Wages are: " << E1.hours * E1.payRate << endl;

	employeeInfo E2;
	cout << "Please enter the name: ";
	getline(cin,E2.name);
	cout << "Please enter the hours worked: ";
	cin >> E2.hours;
	cout << "Please enter the pay rate: ";
	cin >> E2.payRate;

	cout << E2.name << endl;
	cout << E2.hours << endl;
	cout << E2.hours * E2.payRate << endl;


	return 0;
}