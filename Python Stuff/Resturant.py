#Resturant Calculator

#Get name onthe bill
name_on_bill = input("What's the name on the bill? : ")

#Get the ammount of various foods ordered
app_counter = int(input("How many appetizers were ordered? : "))
drink_counter = int(input("How many drinks were ordered? : "))
entree_counter = int(input("How many entrees were ordered? : "))

#Calculate the subtotal
subtotal = float(input("Enter the subtotal for the food and drinks: $"))
    
#Find the sales tax
sales_tax = float(input("Enter the sales tax rate: "))

#Find the gift certificate value
giftcert = float(input("Enter the value for the gift certificate: "))

#Calculate the total with the gift certificate applied
total = subtotal - giftcert

#Apply tax
finalized_total = total + (total * sales_tax)

#Format
finalized_total_formatted = format(finalized_total, '.2f')

#Display the results
print("Thank you for dining with us: " + name_on_bill)
print("Your final total after discounts is: $" + finalized_total_formatted)
print("There were " + str(app_counter) + " appetizers ordered.")
print("There were " + str(drink_counter) + " drinks ordered.")
print("There were " + str(entree_counter) + " entrees ordered.")
