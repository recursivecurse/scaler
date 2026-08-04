package lld.solid.abstractfactory;

public class AzureResouceFactory  implements CloudResourceFactory{

    @Override
    public ComputeInstance createCompute() {
        return new AzureVM();
    }

    @Override
    public StorageBucket createStorageBucket() {
        return new AzureBlobStorage();
    }
}
