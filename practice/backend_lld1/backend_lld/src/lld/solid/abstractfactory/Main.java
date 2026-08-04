package lld.solid.abstractfactory;

public class Main {

    public static void main(String[] args) {

        CloudResourceFactory cloudResourceFactory = new AzureResouceFactory();
        CloudFileUploadEngine uploadEngine = new CloudFileUploadEngine(cloudResourceFactory);
        uploadEngine.uploadFile("abc.txt");
    }
}
