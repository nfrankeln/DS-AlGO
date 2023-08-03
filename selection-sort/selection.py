def selection_sort(array):
    for i in range(0, len(array)) :
        minIndex = i
        for j in range(i, len(array)):
            if array[j] < array[minIndex]:
                minIndex = j
        if minIndex != i:
            temp = array[i]
            array[i] = array[minIndex]
            array[minIndex] = temp
    return array

print(selection_sort([5,2,1,50,23,12,66,8]))