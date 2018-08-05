package alg.zigzag;

public class zigzag {
    private int[] strArray = {1,5,6,8,9,10};
    public void zigzagSorting(){
        for(int i=0;i<strArray.length;i++){
            if (i<strArray.length-1 && ((i%2==0 && strArray[i]>strArray[i+1]) || (i%2==1 && strArray[i]<strArray[i+1]))){
                int temp = strArray[i];
                strArray[i] = strArray[i+1];
                strArray[i+1] = temp;
            }
        }
    }

    public void print(){
        for(int num : strArray){
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        zigzag zg = new zigzag();
        zg.zigzagSorting();
        zg.print();
    }
}
