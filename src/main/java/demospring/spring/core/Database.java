package demospring.spring.core;

/**
 * Database
 */
public class Database {

    private static Database database;

    public static Database getInstanceDatabase(){
        if(database == null){
            database = new Database();
        }
        return database;
    }

    private Database(){

    }
}