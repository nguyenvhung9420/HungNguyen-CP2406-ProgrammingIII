
public class OnlineNewspaperSubscription extends NewspaperSubscription{
    OnlineNewspaperSubscription(String name, String address){
        super(name, address, 9);
    }

    @Override
    public boolean setAddress(String address) {
        return address.contains("@");
    }
}
