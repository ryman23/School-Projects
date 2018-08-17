# Lab 3
# Riley Stephens

def letter_change(name):

    #Make 2 copies of name (immutable)
    name2 = name        

    #Find the next letter in the string, if it matches, change it
    name = name.lower()

    name = name.replace('o', '0')
    name = name.replace('l', '1')
    name = name.replace('e', '3')
    return name

name = input("Name? ")
changed_name = letter_change(name)

#Print ount the result        
print(name, "is history. You are now", changed_name)

