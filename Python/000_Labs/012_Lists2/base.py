import random
input = int(input("how many random numbers do you want to generate? "))
for a in range(0,input):
    print(random.randrange(1,10),end="")
print("")