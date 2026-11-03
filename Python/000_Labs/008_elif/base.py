x=input("please enter a # ")
y=input("enter another # ")
z=input("enter an operator ")

if z == "+":
    a=int(x)+int(y)
    print(str(x)+"+"+str(y)+"="+str(a))
elif z == "-":
    b=int(x)-int(y)
    print(str(x)+"-"+str(y)+"="+str(b))
elif z == "/":
    c=int(x)/int(y)
    print(str(x)+"/"+str(y)+"="+str(c))
elif z == "*":
    d=int(x)*int(y)
    print(str(x)+"*"+str(y)+"="+str(d))
else:
    print("thats not an opperator")