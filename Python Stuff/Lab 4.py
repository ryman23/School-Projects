#Lab 4

def show_inventory(d):
    """ This function will print and sort the current fruit inventory"""
    
    print("Current fruit inventory:")
    for key in sorted(d):       #Sort the dict by the key values
        value = d[key]
        print(key, value)       #Print the dict in a sorted manner

def update_inventory(d):
    """This function will search for an item in the fruit inventory and if it exists,
    change it's value to the user desired value."""
    
    item_to_update = input("Please enter an item to update: ")      #Get the item
    item_to_update.lower()
    quantity_to_update = input("Please enter the quanity to update: ")  #Get the quantity

    if(item_to_update in d):
        d[item_to_update] = quantity_to_update              #Update the value
    else:
        print("Item not found, please try again.")


#__main__
fruit_inventory = {
    'strawberry': 211,
    'watermelon': 18,
    'pineapple': 13,
    'apricot': 99,
    'peach': 103,
    'nectarine': 95,
    'blueberry': 204,
    'raspberry': 193,
    'cherry': 121,
    'avocado': 42
    }
keep_going = 'y'        #Initalize 

while(keep_going == 'y'):
    see_inv = input("Would you like to see the entire inventory of fruit? (y/n): ")
    see_inv.lower()

    if(see_inv == 'y'): 
        show_inventory(fruit_inventory)
    elif(see_inv == 'n'):
        change_inv = input("Would you like to change the inventory? (y/n): ")
        if(change_inv == 'y'):
            update_inventory(fruit_inventory)
        

    keep_going = input("Do you wish to see the inventory/change the inventory? (y/n): ")
    keep_going.lower()
