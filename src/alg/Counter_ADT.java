package alg;

public class Counter_ADT {
    private String instanceName;

    private static int counter;

    public Counter_ADT(String instanceName){
        this.instanceName = instanceName;
    }

    public void increment(){
        counter++;
    }

    public int getPresentValue(){
        return counter;
    }

    public String getInstanceName(){
        return this.instanceName;
    }

    @Override
    public String toString(){

        return String.valueOf(counter);
    }
}
