package isp.bad;

public class MobilePhone implements IPhone {

    @Override
    public void call(final String telephoneNumber) {
        System.out.println("calling...");
    }

    @Override
    public void sendMessage(final String message) {
        System.out.println("sending...");
    }
}
