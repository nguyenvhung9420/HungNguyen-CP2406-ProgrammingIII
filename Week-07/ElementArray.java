
public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[2];
        elements[0] = new NonMetalElement("C", 6, 12.01);
        elements[1] = new MetalElement("C", 6, 12.01);

        elements[0].describeElement();
        elements[1].describeElement();

    }
}
