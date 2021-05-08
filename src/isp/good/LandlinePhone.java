package isp.good;

public class LandlinePhone implements IPhone {
    @Override
    public void call(String telephoneNumber) {
        System.out.println("calling...");
    }
}
