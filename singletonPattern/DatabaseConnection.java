package org.example.singletonPattern;

public class DatabaseConnection {
    private static volatile DatabaseConnection databaseConnection;
    public String dbName;
    public String url;
    public String username;
    public String password;

    public String getDbName() {
        return dbName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private  DatabaseConnection()
    {

    }

    public static DatabaseConnection getDatabaseConnectionObject()
    {
            if(databaseConnection==null)
            {
                synchronized(DatabaseConnection.class)
                {
                    if(databaseConnection==null)
                    {
                        return new DatabaseConnection();
                    }
                }
            }

            return databaseConnection;

    }

    public static void main(String[] args) {

        System.out.println("Object get created");
    }
}


