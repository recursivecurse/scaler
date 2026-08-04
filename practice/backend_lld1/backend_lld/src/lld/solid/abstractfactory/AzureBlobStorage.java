package lld.solid.abstractfactory;

public class AzureBlobStorage implements StorageBucket{
    @Override
    public void upload(String file) {
        System.out.println("Uploading "+file+" to blob storage");
    }
}
