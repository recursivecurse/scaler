package lld.solid.abstractfactory;

public class AzureVM implements ComputeInstance{

    @Override
    public void start() {
        System.out.println("Starting your azure VM");
    }
}
