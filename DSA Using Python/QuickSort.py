def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1

    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1


def quick_sort(arr, low, high):
    if low < high:
        pivot_index = partition(arr, low, high)
        quick_sort(arr, low, pivot_index - 1)
        quick_sort(arr, pivot_index + 1, high)


# Get user input for the list of elements
elements = input("Enter the elements of the list (space-separated): ").split()
# Convert the input elements to integers
elements = [int(x) for x in elements]

n = len(elements)
quick_sort(elements, 0, n - 1)

print("Sorted list:", elements)
