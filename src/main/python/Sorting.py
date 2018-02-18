def find_lower_value_from(list):
    lower = list[0]
    index_lower = 0

    for i in range(1, len(list)):
        if list[i] < lower:
            lower = list[i]
            index_lower = i
    return index_lower


def sort(list):
    new_list = []
    for i in range(len(list)):
        lower = find_lower_value_from(list)
        new_list.append(list.pop(lower))

    return new_list


print sort([5,3,6,2,10])
