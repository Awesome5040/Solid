package isp.bad;

import ocp.bad.ProjectRuntimeException;

public class LandlinePhone implements IPhone {

    @Override
    public void call(String telephoneNumber) {
        System.out.println("calling...");
    }

    @Override
    public void sendMessage(String message) {
        throw new ProjectRuntimeException("Unsupported method");
    }
}
