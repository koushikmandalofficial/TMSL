def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(n - 1 - i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

    return arr


# Get user input for the list of elements
elements = input("Enter the elements of the list (space-separated): ").split()
# Convert the input elements to integers
elements = [int(x) for x in elements]

sorted_list = bubble_sort(elements)
print("Sorted list:", sorted_list)
