def recursive_binary_search(list, item):
    low = 0
    high = len(list) - 1
    return binary_search(low, high, list, item)


def binary_search(low, high, list, item):
    middle = (low + high) / 2
    guess = list[middle]

    if guess == item:
        return middle
    if low <= high:
        if guess > item:
            return binary_search(low, middle - 1, list, item)
        else:
            return binary_search(middle + 1, high, list, item)
    return None

my_list = [1,3,5,7,9]

print recursive_binary_search(my_list, 3)
print recursive_binary_search(my_list, -1)
