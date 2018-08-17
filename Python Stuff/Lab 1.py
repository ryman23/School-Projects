#Lab 1
#By Riley Stephens

#This program will find the kinetic energy of an object with given mass and velocity
#and display the results in Joules.

#define the functions
def kinetic_energy(mass_in_kg, velocity_in_ms):
    kinetic_energy_final = .5 * (mass_in_kg) * (velocity_in_ms ** 2)
    kinetic_energy_formatted = format(kinetic_energy_final, '.5f')
    print("Mass of the object: " + str(mass_in_kg) + "Kg" )
    print("Velocity of the object: " + str(velocity_in_ms) + "M/s.")
    print(kinetic_energy_formatted + " Joules of energy." + "\n")

#Pass the parameters
kinetic_energy(1.0, 1.0)
kinetic_energy(0.33, 9.3)
kinetic_energy(0.33, 18.6)
kinetic_energy(.66, 9.3)
