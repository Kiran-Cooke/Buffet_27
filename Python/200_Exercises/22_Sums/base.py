x = int(input("please enter an number: "))
y = 0
for z in range(1 ,x):
    print(z, end="+")
    y = y + z
print(x)
y=y+x
print("the triangular # is " + str(y))