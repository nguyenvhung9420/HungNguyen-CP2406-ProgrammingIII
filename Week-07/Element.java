
public abstract class Element {
    String symbol;
    int atomicNum;
    double atomicWeight;

    public Element(String symbol, int atomicNum, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNum = atomicNum;
        this.atomicWeight = atomicWeight;
    }

    public abstract void describeElement();
}
