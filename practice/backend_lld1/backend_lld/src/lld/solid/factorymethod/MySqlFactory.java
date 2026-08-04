package lld.solid.factorymethod;

public class MySqlFactory extends DatabaseFactory{

    @Override
    public Database createConnection() {
        return new MySQLDatabase();
    }


}
