package LogicGates;

public class NotGate {
    private int input1;
    private int input2;

    public int getInput1() {
        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }


    public NotGate(int input1) {
        this.input1 = input1;
    }

    public NotGate(){

    }

    private int getOutput(int input1){
        if (input1==0){
            return 1;
        }
        else {
            return 0;
        }
    }

    private void printOutput(int input1){
        System.out.println("NOT "+input1+" results "+getOutput(input1));
    }

    public void printTruthTable() {
        System.out.println("----Truth Table For NOT Gate----");
        printOutput(0);
        printOutput(1);
    }
}
