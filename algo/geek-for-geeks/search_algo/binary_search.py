# given a sorted algorithm
# the task is to find number with o(n)
arr = [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
x = 23


def binary_search(arr, l, r, search_number):
    print(l,r)
    mid = l+ (r-l) / 2
    print(mid)
    if mid > 0:
        if arr[mid] < search_number:
            return binary_search(arr,mid+1, r,  search_number)
        elif arr[mid] > search_number:
            print(arr)
            return binary_search(arr, l, mid-1, search_number)
        elif arr[mid] == search_number:
            return mid


print(binary_search(arr,0, len(arr)-1, x))

