package lld.solid.abstractfactory;

public class AWSEc2 implements ComputeInstance{
    @Override
    public void start() {
        System.out.println("Starting AWS EC2 instance");
    }
}
