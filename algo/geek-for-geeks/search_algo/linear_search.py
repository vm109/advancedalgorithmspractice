
# this is a simple linear search algorithm which 
# traverses the array element after element 
# So the Big o notation of this algorithm is O(n)
arr= [2,6,9,11,1,21,43,21]

def linear_search( arr, number ):
    for i, n in enumerate(arr): 
        if n == number: 
            return i

print(linear_search(arr, 21))