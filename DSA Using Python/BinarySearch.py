print("Enter the Size of array : ")
arrSize = int(input())
print("Enter " +str(arrSize)+ " Elements(in ascending order): ")
nums = []
for i in range(arrSize):
    nums.insert(i, int(input()))
print("Enter a Number to Search:")
search = int(input())
first = 0
last = arrSize-1
middle = (first+last)/2
middle = int(middle)
while first <= last:
    if nums[middle]<search:
        first = middle+1
    elif nums[middle]==search:
        print("The Number Found at Position:")
        print(middle+1)
        break
    else:
        last = middle-1
    middle = (first+last)/2
    middle = int(middle)
if first>last:
    print("The Number is not Found !!!")