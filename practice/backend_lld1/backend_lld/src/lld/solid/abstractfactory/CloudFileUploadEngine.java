package lld.solid.abstractfactory;

public class CloudFileUploadEngine {

    private ComputeInstance computeInstance;
    private StorageBucket storageBucket;

    CloudFileUploadEngine(CloudResourceFactory cloudResourceFactory)
    {
        this.computeInstance = cloudResourceFactory.createCompute();
        this.storageBucket = cloudResourceFactory.createStorageBucket();
    }

    public void uploadFile(String file)
    {
        computeInstance.start();
        System.out.println("Starting file upload now");
        storageBucket.upload(file);
        System.out.println("File uploaded successfully");
    }
}
