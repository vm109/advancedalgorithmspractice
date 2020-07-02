def binary_search(arr, search_number, actualIndex):
    print(actualIndex)
    mid = len(arr) / 2
    if mid >= 0:
        if arr[mid] > search_number:
            new_arr = arr[0:mid]
            print(new_arr,"------")
            return binary_search(new_arr, search_number, actualIndex- (actualIndex-len(new_arr)/2))
        if arr[mid] < search_number:
            new_arr = arr[mid: len(arr)]
            print(new_arr,"++++++")
            return binary_search(new_arr, search_number, actualIndex+(len(new_arr)/2))
        if arr[mid] == search_number:
            return actualIndex


arr = [2, 5, 8, 12, 16, 23, 56,89,91,803,900,1000,1400]
x = 16
print(binary_search(arr, x, len(arr)/2))
