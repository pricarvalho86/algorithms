def binary_search(list, item):
    low = 0
    high = len(list) - 1
    return recursive_binary_search(low, high, list, item)


def recursive_binary_search(low, high, list, item):
    middle = (low + high) / 2
    guess = list[middle]

    if guess == item:
        return middle
    if low <= high:
        if guess > item:
            return recursive_binary_search(low, middle - 1, list, item)
        else:
            return recursive_binary_search(middle + 1, high, list, item)
    return None


def calculate_log(elementsSize, iteractions = 0):
    result = elementsSize / 2

    if result != 0:
        return calculate_log(result, iteractions + 1)

    return iteractions

my_list = [1,3,5,7,9]

print binary_search(my_list, 3)
print binary_search(my_list, -1)

print calculate_log(128)
print calculate_log(128 * 2)
