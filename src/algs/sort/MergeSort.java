package algs.sort;

import java.util.*;

public class MergeSort {

static List<Integer> sortedFinal = new LinkedList<>();
    public static List<Integer>  mergesort(List<Integer> firstList, List<Integer> secondList){
        List<Integer> sortedList= new LinkedList<>();
        int firstListSize = firstList.size();
        int secondListSize = secondList.size();
        int length = firstListSize;
        if(firstListSize>secondListSize){
            length = secondListSize;
        }
       int j=0;
        int i=0;
        for(;i<length;){

            if(j<length && firstList.get(i)> secondList.get(j)) {

                sortedList.add(secondList.get(j));
                j++;
            }else if(j<secondListSize && firstList.get(i)<secondList.get(j)){
                sortedList.add(firstList.get(i));
                i++;
            }else{
                break;
            }
        }

        if(j!= secondListSize){
            while(j<secondListSize){
                sortedList.add(secondList.get(j));
                j++;
            }
        }

        if(i!= firstListSize){
            while(i<firstListSize){
                sortedList.add(firstList.get(i));
                i++;
            }
        }

        return sortedList;
    }

    public static  List<Integer> divide(List<Integer> sortedList,List<Integer> unsortedList) {

        int length = unsortedList.size();

        if (length > 1) {

            List<Integer> leftHalf = unsortedList.subList(0, (length / 2));
            List<Integer> rightHalf = unsortedList.subList(length / 2, length);

            divide(sortedList, leftHalf);
            divide(sortedList, rightHalf);
            if (rightHalf.size() > 1) {
                sortedFinal =  mergesort(leftHalf, sortedFinal);
            }else {
                sortedFinal = mergesort(leftHalf, rightHalf);
            }

        }
        return sortedFinal;
    }

    public static void print(List<Integer> sortedList){
        Iterator<Integer> it = sortedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void main(String[] args){
        List<Integer> firstList = new LinkedList<>();
        firstList.add(7);
        firstList.add(2);
       firstList.add(1);
       firstList.add(5);
        firstList.add(3);


//
//        List<Integer> secondList = new LinkedList<>();
//
//        secondList.add(1);
//        secondList.add(2);
//
//
//        mergesort(firstList,secondList);
//        print(mergesort(firstList,secondList));
    List<Integer> sortedList = new LinkedList<>();
       divide(sortedList,firstList);
   print(divide(sortedList,firstList));
    }
}
