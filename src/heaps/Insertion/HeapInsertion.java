package heaps.Insertion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeapInsertion {
    int maxSize;
    int currentSize;
    private List<Integer> heapArray = new ArrayList<>(maxSize);

    HeapInsertion(int maxSize) {
        this.maxSize = maxSize;
        currentSize = 0;
    }

    public boolean isHeapEmpty() {
        return heapArray.isEmpty();
    }

    public boolean isHeapMaxedOut() {
        return heapArray.size() == maxSize;
    }

    public void printAllTheChildren(int index) {
        int rightChildIndex = (2 * index) + 2;
        int leftChildIndex = (2 * index) + 1;
        System.out.println("right child - " + heapArray.get(rightChildIndex));
        System.out.println("left child - " + heapArray.get(leftChildIndex));
    }

    public void insert(int value) {
        if (!isHeapMaxedOut()) {
            heapArray.add(value);
            trickleUp(currentSize);
            currentSize++;
        }
    }

    private void trickleUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heapArray.get(parentIndex) < heapArray.get(index)) {
            int temp;
            temp = heapArray.get(index);
            heapArray.set(index, heapArray.get(parentIndex));
            heapArray.set(parentIndex, temp);
            index = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
    }

    private void trickleDown(int index) {
        int rightChildIndex = (2 * index) + 2;
        int leftChildIndex = (2 * index) + 1;
        int temp = heapArray.get(index);

        while (!(rightChildIndex >= heapArray.size()) && !(leftChildIndex >= heapArray.size())) {

            if (heapArray.get(leftChildIndex) > heapArray.get(index)) {
                heapArray.set(index, heapArray.get(leftChildIndex));
                heapArray.set(leftChildIndex, temp);
                index = leftChildIndex;
            }

            else if (heapArray.get(rightChildIndex) > heapArray.get(index)) {
                heapArray.set(index, heapArray.get(rightChildIndex));
                heapArray.set(rightChildIndex, temp);
                index = rightChildIndex;
            }

            rightChildIndex = (2 * index) + 2;
            leftChildIndex = (2 * index) + 1;
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < heapArray.size()) {
            int temp = heapArray.get(index);
            heapArray.set(index, heapArray.get(heapArray.size() - 1));
            heapArray.set(heapArray.size() - 1, temp);
            System.out.println("-------" + heapArray.size());
            heapArray.remove(heapArray.size() - 1);
            System.out.println("-------" + heapArray.size());
            trickleDown(index);
        }
    }

    public void printHeap() {
        for (Integer value : heapArray) {
            System.out.println("value - " + value);
        }
    }

    public static void main(String[] args) {
        HeapInsertion heapInsertion = new HeapInsertion(10);
        heapInsertion.insert(10);
        heapInsertion.insert(12);
        heapInsertion.insert(5);
        heapInsertion.insert(11);
        heapInsertion.insert(21);
        heapInsertion.printHeap();
        heapInsertion.delete(0);
        System.out.println("===================");
        heapInsertion.printHeap();
        heapInsertion.delete(0);
        System.out.println("===================");
        heapInsertion.printHeap();
    }

}
