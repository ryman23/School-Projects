#By Riley Stephens
""" This program will take parameters t for the turtle, length in pixels, and max_sides for
the maximum number of sides. This will create a spirialing square."""

import turtle

def pattern_2(t, length, max_sides):
    """
    Draw a square spiral using turtle t with the first side
    of the given length and the  maximum number of sides 
    given in max_sides.
    """
    change = length / max_sides     #Find the length by dividing the desired starting
                                    #length by the number of desired sides 
    
    for x in range(max_sides):
        bob.forward(length)         #Forward length pixels
        bob.left(90)                #Left turn at 90 degrees
        length = length - change    #Find the length by dividing the desired starting
        print(length)               #length by the number of desired sides
        max_sides = max_sides - 1   #Decrease max sides by 1
    print('Function "pattern_2" was called.')

# __main__
bob = turtle.Turtle()
pattern_2(bob, 200, 25)
turtle.mainloop()
