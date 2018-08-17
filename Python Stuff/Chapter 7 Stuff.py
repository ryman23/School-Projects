#Chapter 7 Material

##again = 'Y'
##
##while(again == 'Y'): 
##    print("This program will convert temperatures (Fahrenheight/Celsius")
##    print("Enter (F) to convert Fahrenheight to Celsius")
##    print("Enter (C) to convert Celsius to Fahrenheight")
##
##    which = input("Enter selection F or C: ")
##    temp = float(input("Enter temperature to convert: "))
##
##    while(which != 'F' and which != 'C'):
##             print("Try again tard")
##             
##    if(which == 'F'):
##        converted_temp = (temp - 32) * 5/9
##        print(temp, " degrees Fahrenheight equals ", converted_temp, " degrees Celsius.")
##    if(which == 'C'):
##        converted_temp = (9/5 * temp) + 32
##        print(temp, " degrees Celsius equals ", converted_temp, " degrees Fahrenheight.")
##
##    again = input("Again? Enter 'Y' or 'N': ")


#Add up 1 to 10
##sum = 0
##n = 1
##
##while(n <= 10):
##    sum = sum + n
##    n = n + 1
##    
##print(sum)

##print("n      n squared")
##print("----------------")
##
##n = 0
##
##for i in range(11):     #range(start value, stop value) or range(start value, stop value, increment value)
##    n_squared = n**2
##    print(n, '    ', n_squared)
##
##    n = n + 1

import turtle

def draw_turtle(nancy, length):
    
    nancy.forward(length)
    nancy.left(120)
    nancy.forward(length)
    nancy.left(120)
    nancy.forward(length)
    nancy.left(120)
    nancy.left(length)

nancy = turtle.Turtle()
draw_turtle(nancy, 50)
turtle.mainloop()
