package lld.solid.abstractfactory;

public interface CloudResourceFactory {
    ComputeInstance createCompute();
    StorageBucket createStorageBucket();
}
