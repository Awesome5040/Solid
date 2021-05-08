package isp.good;

public class MobilePhone implements IMessageSender, IPhone {
    @Override
    public void sendMessage(String message) {
        System.out.println("sending...");
    }

    @Override
    public void call(String telephoneNumber) {
        System.out.println("calling...");
    }
}
