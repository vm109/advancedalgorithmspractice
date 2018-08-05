package search;

import java.util.Arrays;
import java.util.List;

/*
Find the k closest elements to the given elemnt
 */
public class FindKClosest {
    int index=-1;
    public Integer findKClosest(List<Integer> listOfElements, int k, int value){
        return 0;
    }

    public void findIndex(List<Integer> listOfElements, int value, int lowestIndex, int highestIndex){

        if(listOfElements.size()>1) {
            int halfWay = (listOfElements.size()-1) / 2;
            if (value > listOfElements.get(halfWay)) {
                findIndex(listOfElements.subList(halfWay+1, listOfElements.size()), value, lowestIndex+(halfWay+1), highestIndex);
            } else if(value < listOfElements.get(halfWay)){
                findIndex(listOfElements.subList(0, halfWay+1), value, lowestIndex, highestIndex-(halfWay+1));
            }else{
                if((lowestIndex+highestIndex)==1) {
                    index = ((lowestIndex + highestIndex) / 2)+1;
                }else{
                    index = ((lowestIndex + highestIndex) / 2);
                }

            }
        }
       else if(lowestIndex==highestIndex){
            index = lowestIndex;
        }
    }

    public static void main(String[] args){
        Integer[] integers = {12, 15,16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56,57};
        List<Integer> integers1 = Arrays.asList(integers);
        FindKClosest fc = new FindKClosest();
        fc.findIndex(integers1,15,0,integers1.size()-1);
        System.out.println(fc.index);
    }
}
