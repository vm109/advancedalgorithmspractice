# problem statement -
# Find the indexes i and j so that [j-i] is maximum
# constraint arr[i] <= arr[j] and no sorting is done
arr = [34, 8, 10, 3, 2, 80, 30, 33, 1]

# i should be always be on the left hand side of the array mid
# j should be always be on the right hand side of the array mid
def find_max_index_difference(arr):
    arri = []
    arrj = []
    largest_difference = 0
    arrj.append({"num": arr[len(arr) - 1], "index": len(arr) - 1})
    arri.append({"num": arr[0], "index": 0})
    for i in range(0, len(arr)):
        if arr[len(arr)-1-i] > arrj[len(arrj) - 1]["num"]:
            arrj.append({"num": arr[len(arr)-1-i], "index": len(arr)-1-i})

    for i in range(0, len(arr)):
        if arr[i] < arri[len(arri) - 1]["num"]:
            arri.append({"num": arr[i], "index": i})
    for j in range(0, len(arrj)):
        for i in range(0, len(arri)):
            if arri[i]["num"] <= arrj[j]["num"] and arrj[j]["index"] - arri[i]["index"] > largest_difference:
                largest_difference = arrj[j]["index"] - arri[i]["index"]
                print(arrj[j]["index"] , arri[i]["index"])
    print(largest_difference)
    print(arri)
    print(arrj)

def max_condition(arr):
    i = 0
    j = len(arr) - 1
    if arr[i] <= arr[j]:
        return j - i


find_max_index_difference(arr)
