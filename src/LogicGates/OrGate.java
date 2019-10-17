package LogicGates;

public class OrGate {

    private int input1;
    private int input2;

    public int getInput1() {

        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public OrGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public OrGate(){

    }
    private int getOutput(int input1, int input2){
        if(input1==0 && input2==0){
            return 0;
        }
        else{
            return 1;
        }

    }

    private void printOutput(int input1,int input2){
        System.out.println(input1+" OR "+input2+" results "+getOutput(input1,input2));
    }

    public void printTruthTable() {
        System.out.println("----Truth Table For OR Gate----");
        printOutput(0,0);
        printOutput(0,1);
        printOutput(1,0);
        printOutput(1,1);
    }
}
