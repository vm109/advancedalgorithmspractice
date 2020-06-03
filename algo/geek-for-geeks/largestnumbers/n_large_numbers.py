#small algo to find the largest number
# We have achieved this with O(n)
# We need to see if we can reduce the time complexity further
array = [4, 5, 67, 23, 9, 10, 29]
number_of_large_to_find = 2


def find_largest_n_numbers():
    largest1 = array[0]
    largest2 = array[0]
    for x in array:
        if x > largest1:
            largest2 = largest1
            largest1 = x
        elif x > largest2:
            largest2 = x

    print('largest1 - ', largest1)
    print('largest2 - ', largest2)


find_largest_n_numbers()
