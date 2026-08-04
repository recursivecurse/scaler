package lld.solid.factorymethod;

public class Main {

    public static void main(String[] args) {

        DatabaseFactory db = new MySqlFactory();
        db.executeQuery("Select * from student;");
    }
}
