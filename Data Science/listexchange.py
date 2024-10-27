#l = ["apple","orange","watermelon","pineapple","banana"]
s = []
x = int(input("Enter the number of items in the list: "))
for i in range(0,x):
    z = input("Enter the element: ")
    s.append(z)
#print(l)
print(s)

a = s[0]
s[0] = s[-1]
s[-1] = a

print(s)



