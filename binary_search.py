a = input("Enter some integers: ")

x = [int(i) for i in a.split(",")]

find = int(input("Enter the number to be looked for: "))
print("\nSorted list: ")
x.sort()
print(x)

l = 0
r = len(x) - 1

mid = l + (r-l)//2

while r-l >= 0:
    if x[mid] == find:
        print("Found!")
        exit()
    elif x[mid] > find:
        r = mid - 1
        mid = l + (r-l)//2
    else:
        l = mid + 1
        mid = l + (r - l)//2
print("Not found!")
