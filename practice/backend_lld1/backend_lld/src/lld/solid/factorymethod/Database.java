package lld.solid.factorymethod;

public interface Database {

    public Boolean connect();
    public Boolean execute(String query);
}
