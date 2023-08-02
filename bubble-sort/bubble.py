def bubble_sort(array):
    for i in range(0,len(array)):
        for j in range(0,len(array)-1):
            if array[j] > array[j+1]:
                temp = array[j+1]
                array[j+1] = array[j]
                array[j] = temp
    return array

array = [39,95,27,67,31,44,92,60,82,5,62,55,23,11,22]
print(bubble_sort(array))