year = int(input("please enter a year: "))

if year%4 == 0 and year%400 <= 99:
    print("yes that is a leap year")
else:
    print("that is not a leap year")