package lld.solid.factorymethod;

import jdk.jfr.DataAmount;

public class MySQLDatabase implements Database {

    @Override
    public Boolean connect() {
        System.out.println("Connecting to MySql Server");
        return true;
    }

    @Override
    public Boolean execute(String query) {
        System.out.println("Executing query : "+ query);
        return true;
    }
}
