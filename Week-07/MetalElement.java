
public class MetalElement extends Element{
    public MetalElement(String symbol, int atomicNum, double atomicWeight) {
        super(symbol, atomicNum, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Metal Elements are good Conductors of Electricity.");
    }
}
