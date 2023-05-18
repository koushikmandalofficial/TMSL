print("Enter the Size of array : ")
arrSize = int(input())
print("Enter " +str(arrSize)+ " Elements: ")
arr = []
for i in range(arrSize):
  arr.append(input())
print("Enter an Element to Search: ")
elem = input()
chk = 0
for i in range(arrSize):
  if elem==arr[i]:
    index = i
    chk = 1
    break
if chk==1:
  print("\nElement Found at Index Number: " + str(index))
else:
  print("\nElement doesn't found!")