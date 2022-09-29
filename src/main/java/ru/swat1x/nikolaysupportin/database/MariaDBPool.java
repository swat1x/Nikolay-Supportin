package ru.swat1x.nikolaysupportin.database;

public class MariaDBPool extends HikariDatabase {

    private static final String HOST = "localhost";
    private static final int PORT = 3306;
    private static final String DATABASE = "server";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public MariaDBPool() {
        super("Nikolay-Supportin", "org.mariadb.jdbc.Driver", "jdbc:mariadb", HOST, PORT, DATABASE, USER, PASSWORD);
    }

}
