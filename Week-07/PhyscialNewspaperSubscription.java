
public class PhyscialNewspaperSubscription extends NewspaperSubscription {
    PhyscialNewspaperSubscription(String name, String address){
        super(name, address, 15);
    }

    @Override
    public boolean setAddress(String address) {
        return address.matches(".*\\d+.*");
    }
}
