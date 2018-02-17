def find_lower(list):
    lower = list[0]
    index_lower = 0

    for i in range(1, len(list)):
        if list[i] < lower:
            lower = list[i]
            index_lower = i
    return index_lower


def sort_by_selection(list):
    new_list = []
    for i in range(len(list)):
        lower = find_lower(list)
        new_list.append(list.pop(lower))

    return new_list

print sort_by_selection([5,3,6,2,10])
