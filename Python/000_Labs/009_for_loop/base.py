x = int(input("please enter line length:"))
y = input("please chose vertical or horizontal(v/h):")

if y == "h":
    for b in range(0,x):
        print("*",end="")

elif y == "v":
    for b in range(0,x):
        print("*")
        

