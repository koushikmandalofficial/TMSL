def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min_index = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr

# Get user input for the list of elements
elements = input("Enter the elements of the list (space-separated): ").split()
# Convert the input elements to integers
elements = [int(x) for x in elements]

sorted_list = selection_sort(elements)
print("Sorted list:", sorted_list)
