package LogicGates;

public class GatesTest {
    public static  void main(String[] args) {
        AndGate andGate = new AndGate();
        andGate.printTruthTable();
        OrGate orGate = new OrGate();
        orGate.printTruthTable();
        NotGate notGate = new NotGate();
        notGate.printTruthTable();
    }
}