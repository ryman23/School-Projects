// This program will allow the user to find the area of a given shape.	
#include <iostream>
using namespace std;

int main()
{
	int
		inputNumber;				// The number the user imputs.
	
    double	base,					// The base of the shape.
		    radius,					// The circle's radius.
		    height,					// The height of the shape.
		    width,					// The width of the shape.
		    circle,				    // The area of the circle
		    triangle,				// The area of the triangle.
		    rectangle;				// The area of the rectangle.
	
	double power = 2;

		cout << "Geometry Calculator" << endl;
		cout << "1. Calculate the Area of a Circle" << endl;
		cout << "2. Calculate the Area of a Rectangle" << endl;
		cout << "3. Calculate the Area of a Triangle" << endl;
		cout << "4. Quit" << endl;
		cout << "Enter your choice (1-4): ";
		cin >> inputNumber;
		
		// Calculate what the user has esired.
	switch (inputNumber)
	{
		case (1): cout << "Enter the circle's radius: ";
				  cin >> radius;
				  circle = 3.14 * (radius * radius);
				  cout << "The area of the circle is: " << circle << endl;
				  break;
		case (2) : cout << "Enter the legnth of the height: ";
				   cin >> height;
			       cout << "Enter the rectangles width: ";
			       cin >> width;
			       rectangle = height * width;
			       cout << "The area of the rectangle is: " << rectangle << endl;
			       break;
		case (3) : cout << "Enter the legnth of the base: ";
			       cin >> base;
			       cout << "Enter the triangle's height: ";
		       	   cin >> height;
			       triangle = (base * height) / 2;
			       cout << "The area of the triangle is: " << triangle << endl;
				   break;
		case (4) : int main();
		{
			// Close the program.
		}
		break;
		default: cout << "You may only enter 1, 2, 3, or 4" << endl;
	}
	return 0;
}