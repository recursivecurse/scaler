package lld.solid.abstractfactory;

public class AWSResourceFactory implements CloudResourceFactory{

    @Override
    public ComputeInstance createCompute() {
        return new AWSEc2();
    }

    @Override
    public StorageBucket createStorageBucket() {
        return new AWSS3();
    }
}
