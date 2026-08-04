package lld.solid.factorymethod;

abstract public class DatabaseFactory {


    abstract public Database createConnection();

    public void executeQuery(String query)
    {
        if(query == null || query.isBlank())
            System.out.println("Query is blank");
        else
        {
            Database db = createConnection();
            if(db.connect())
            {
                db.execute(query);
            }
            else
            {
                System.out.println("Cannot connect to database");
            }
        }
    }

}
