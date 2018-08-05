package cipher;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CypherText {


    public List<Integer> getOffset(String inputString,String comparsionString){
        char[] charArray = inputString.toCharArray();
        char[] charArrayOfComparsionString = comparsionString.toCharArray();
        List<Integer> offset = new LinkedList<>();
        int asciiValueInputString;
        int asciiValueComparsionString;
        for(int i=0;i<charArray.length;i++){
            asciiValueInputString = (int) charArray[i];
            asciiValueComparsionString = (int)charArrayOfComparsionString[i];
            int offsetValue = asciiValueComparsionString-asciiValueInputString;
                if(offsetValue<0){
                    offsetValue = offsetValue+26;
                }
                offset.add(offsetValue);

        }

        return offset;
    }

    public static void main(String[] args){
        CypherText ct = new CypherText();
       System.out.println(ct.getOffset("tdaejjptlzec","technovation"));
        System.out.print(ct.getOffset("gdlbnj","genero"));
    }
}
