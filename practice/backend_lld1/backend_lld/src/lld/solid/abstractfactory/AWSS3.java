package lld.solid.abstractfactory;

public class AWSS3 implements StorageBucket{
    @Override
    public void upload(String file) {
        System.out.println("Uploading "+ file + " to AWS S3");
    }
}
