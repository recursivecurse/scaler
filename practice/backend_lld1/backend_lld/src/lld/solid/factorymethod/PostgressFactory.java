package lld.solid.factorymethod;

public class PostgressFactory extends DatabaseFactory{

    @Override
    public Database createConnection() {
        return new PostgressDatabase();
    }
}
