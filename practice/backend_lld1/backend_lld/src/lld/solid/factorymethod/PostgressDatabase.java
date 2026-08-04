package lld.solid.factorymethod;

public class PostgressDatabase implements Database{

    @Override
    public Boolean connect() {
        System.out.println("Connecting to Postgress ");
        return true;
    }

    @Override
    public Boolean execute(String query) {
        System.out.println("Executing query : "+query);
        return true;
    }
}
