#This progarm will spell out the word "Hi!" using the turtle objectt
import turtle

hi = turtle.Turtle()
def draw_hi(hi):
    #Make the "H"
    hi.right(90)
    hi.forward(80)
    hi.penup()
    hi.backward(40)
    hi.pendown()
    hi.left(90)
    hi.forward(20)
    hi.right(90)
    hi.penup()
    hi.backward(40)
    hi.pendown()
    hi.forward(80)

    #Make the "i"
    hi.left(90)
    hi.penup()
    hi.forward(20)
    hi.pendown()
    hi.left(90)
    hi.forward(50) 
    hi.penup()   
    hi.forward(15)
    hi.pendown()
    hi.forward(5)
    hi.penup()
    hi.forward(10)
    hi.pendown()

    #Make the "!"
    hi.right(90)
    hi.penup()
    hi.forward(20)
    hi.pendown()    
    hi.right(90)
    hi.forward(70)
    hi.penup()
    hi.forward(5)
    hi.pendown()
    hi.forward(5)

draw_hi(hi)

turtle.mainloop()
