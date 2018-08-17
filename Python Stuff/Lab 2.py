# Lab 2
# Riley Stephens
""" This program will construct a 'stairway to heaven'. It will draw a stairway that will
disappear into the distance."""

import turtle

def stairway_to_heaven(t, start_length, max_stairs):
    """ t: the turtle used to do the drawing.
    start_length: the size of the first stair.
    max_stairs: the maximum number of stairs to draw."""
    
    for x in range(max_stairs):
        bob.left(90)                #Left 90 to go up
        bob.forward(start_length)   #Forward length
        bob.right(90)               #Right 90
        bob.forward(start_length)   #Forward 90 again

        if(start_length == 0):      #If the length of the stairs is 0, break the loop
            break
        
        start_length = start_length - 5    #Decrease the length of the stairs by 5 each loop
        max_stairs = max_stairs - 1        #Decrease the stair count by 1 each loop
        

bob = turtle.Turtle()
##stairway_to_heaven(bob, 50, 3)
##stairway_to_heaven(bob, 50, 5)
##stairway_to_heaven(bob, 25, 5)
stairway_to_heaven(bob, 50, 1000)
turtle.mainloop()
